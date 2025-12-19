package jp.co.sss.jdbc.chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.sss.jdbc.chapter01.DBManager;

public class Sample0401 {
	public static void main(String[] args) throws IOException {
		// 検索処理を実行
		selectByEmpId();
	}

	/**
	 * 社員IDで社員情報を検索する
	 *
	 * @param empId
	 *            検索対象の社員ID
	 */
	public static void selectByEmpId() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 検索キーワードを入力
			System.out.println("社員IDを入力してください。");
			String empId = br.readLine();

			// DBに接続
			connection = DBManager.getConnection();

			// SQL文を準備（入力値を連結）
			String sql = "SELECT * FROM employee WHERE emp_id = '" + empId + "'";

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
			DBManager.close(resultSet);
			DBManager.close(preparedStatement);
			DBManager.close(connection);
		}
	}
}
