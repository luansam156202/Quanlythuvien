package library.views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MemberForm extends JFrame {

    private JTextField txtName, txtEmail, txtPhone, txtAddress;
    private JButton btnSave, btnClear;

    public MemberForm() {
        // Thiết lập cửa sổ
        setTitle("Thêm Thành Viên");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Tạo các thành phần giao diện
        JLabel lblName = new JLabel("Tên:");
        lblName.setBounds(50, 50, 100, 30);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 50, 200, 30);
        add(txtName);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 100, 100, 30);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 100, 200, 30);
        add(txtEmail);

        JLabel lblPhone = new JLabel("Số điện thoại:");
        lblPhone.setBounds(50, 150, 100, 30);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(150, 150, 200, 30);
        add(txtPhone);

        JLabel lblAddress = new JLabel("Địa chỉ:");
        lblAddress.setBounds(50, 200, 100, 30);
        add(lblAddress);

        txtAddress = new JTextField();
        txtAddress.setBounds(150, 200, 200, 30);
        add(txtAddress);

        btnSave = new JButton("Lưu");
        btnSave.setBounds(50, 300, 100, 30);
        add(btnSave);

        btnClear = new JButton("Xóa Trống");
        btnClear.setBounds(250, 300, 100, 30);
        add(btnClear);

        // Xử lý sự kiện
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveMember();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void saveMember() {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String address = txtAddress.getText();

        // Kiểm tra thông tin trước khi lưu
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kết nối cơ sở dữ liệu
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "Quang7864@")) {
            String sql = "INSERT INTO member (name, email, phone, address, joindate) VALUES (?, ?, ?, ?, NOW())";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.setString(4, address);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Thành viên đã được thêm thành công!");
                clearFields();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MemberForm form = new MemberForm();
            form.setVisible(true);
        });
    }
}
