package jp.co.sss.jdbc.chapter01;

import java.sql.Connection;

public class Sample01 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // DBに接続
            connection = DBManager.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // DBとの接続を切断
            DBManager.close(connection);
        }
    }
}
