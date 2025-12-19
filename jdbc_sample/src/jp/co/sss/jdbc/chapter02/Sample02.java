package jp.co.sss.jdbc.chapter02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.sss.jdbc.chapter01.DBManager;

public class Sample02 {
	public static void main(String[] args) {
		// 検索処理を実行
		select();
	}

	/**
	 * 全ての社員情報を検索する
	 */
	public static void select() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// DBに接続
			connection = DBManager.getConnection();

			// SQL文を準備
			String sql = "SELECT * FROM employee";

			// ステートメントを作成
			preparedStatement = connection.prepareStatement(sql);

			// SQL文を実行
			resultSet = preparedStatement.executeQuery();

			// レコードを出力
			System.out.println("emp_id\temp_name\tgender\tbirthday");
			while (resultSet.next()) {
				System.out.print(resultSet.getString("emp_id") + "\t");
				System.out.print(resultSet.getString("emp_name") + "\t");
				System.out.print(resultSet.getString("gender") + "\t");
				System.out.println(resultSet.getString("birthday"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// クローズ処理
			DBManager.close(resultSet);
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
	}
}
