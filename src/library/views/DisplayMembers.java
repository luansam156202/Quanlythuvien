package library.views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class DisplayMembers extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public DisplayMembers() {
        // Thiết lập giao diện
        setTitle("Danh sách thành viên");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Bảng hiển thị thành viên
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Thêm các cột vào bảng
        tableModel.addColumn("ID");
        tableModel.addColumn("Tên");
        tableModel.addColumn("Email");
        tableModel.addColumn("Số điện thoại");
        tableModel.addColumn("Địa chỉ");
        tableModel.addColumn("Ngày tham gia");

        // Nạp dữ liệu từ CSDL
        loadMembers();
    }

    private void loadMembers() {
        String url = "jdbc:mysql://localhost:3306/librarydb"; // Thay đổi theo CSDL của bạn
        String username = "root"; // Thay bằng tài khoản MySQL của bạn
        String password = "Quang7864@@"; // Thay bằng mật khẩu MySQL của bạn

        String query = "SELECT * FROM member";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Lặp qua từng bản ghi trong ResultSet và thêm vào bảng
            while (rs.next()) {
                int id = rs.getInt("memberid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                String joinDate = rs.getString("joindate");

                tableModel.addRow(new Object[]{id, name, email, phone, address, joinDate});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối CSDL: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DisplayMembers displayMembers = new DisplayMembers();
            displayMembers.setVisible(true);
        });
    }
}
