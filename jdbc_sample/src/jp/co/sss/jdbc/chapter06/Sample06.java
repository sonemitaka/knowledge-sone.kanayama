package jp.co.sss.jdbc.chapter06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jp.co.sss.jdbc.chapter01.DBManager;

public class Sample06 {
    public static void main(String[] args) throws IOException {
        // 登録処理を実行
        insert();
    }

    /**
     * 社員情報を登録する（トランザクションあり）
     */
    public static void insert() {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
        	System.out.println("社員を登録します。");

            // 登録する値を入力
            System.out.println("社員IDを入力してください。");
            String empId = br.readLine();
            System.out.println("社員名を入力してください。");
            String empName = br.readLine();
            System.out.println("性別を入力してください（男性：1、女性：2）。");
            String gender = br.readLine();
            System.out.println("生年月日を入力してください（西暦年/月/日）。");
            String birthday = br.readLine();

            // DBに接続
            connection = DBManager.getConnection();

            // トランザクションの開始(自動コミットモードの無効化)
            connection.setAutoCommit(false);

            // SQL文を準備
            String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";

            // ステートメントを作成
            preparedStatement = connection.prepareStatement(sql);

            // 入力値をバインド
            preparedStatement.setString(1, empId);
            preparedStatement.setString(2, empName);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, birthday);

            // SQL文を実行
            int cnt = preparedStatement.executeUpdate();
            System.out.println(cnt + "件のデータを登録しました。");

            // コミット処理
            connection.commit();
        } catch (Exception e) {
            // ロールバック処理
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("エラーが発生したため、データをロールバックしました。");
        } finally {
        	// クローズ処理
            DBManager.close(preparedStatement);
            DBManager.close(connection);
        }
    }
}
