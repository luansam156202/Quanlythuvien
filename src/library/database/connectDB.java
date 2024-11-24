package library.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
    public static void main(String[] args) {
        // Thông tin kết nối
        String url = "jdbc:mysql://localhost:3306/librarydb"; // Thay your_database_name bằng tên DB
        String username = "root"; // Thay bằng username của bạn
        String password = "Quang7864@@"; // Thay bằng password của bạn

        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại!");
        }
    }
}
