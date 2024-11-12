package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPage() {
        // Thiết lập cửa sổ đăng nhập
        setTitle("Library Management System");
        setSize(400, 300);  // Kích thước cửa sổ nhỏ gọn
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Bo cong viền cửa sổ
        setUndecorated(true);  // Tắt viền mặc định của cửa sổ
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20)); // Bo cong viền cửa sổ

        // Sử dụng BackgroundPanel làm nền
        BackgroundPanel panel = new BackgroundPanel("brg_login.png"); // Thay "path_to_your_image.jpg" bằng đường dẫn thực tế của ảnh nền
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Dọc theo chiều dọc

        // Tạo các thành phần giao diện
        JLabel titleLabel = new JLabel("Login to Library");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Tên đăng nhập
        JLabel usernameLabel = new JLabel("Username");
        usernameField = new JTextField(20);
        usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        usernameField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Mật khẩu
        JLabel passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(20);
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Nút Đăng nhập
        JButton loginButton = new JButton("Login");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setBackground(new Color(30, 144, 255));  // Màu xanh đẹp
        loginButton.setForeground(Color.WHITE);

        // Liên kết "Tạo tài khoản" và "Quên mật khẩu"
        JPanel linkPanel = new JPanel();
        linkPanel.setLayout(new FlowLayout());
        JLabel createAccountLabel = new JLabel("Create Account");
        createAccountLabel.setForeground(Color.BLUE);
        JLabel forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordLabel.setForeground(Color.BLUE);

        linkPanel.add(createAccountLabel);
        linkPanel.add(forgotPasswordLabel);

        // Thêm các thành phần vào panel
        panel.add(Box.createRigidArea(new Dimension(0, 15)));  // Thu nhỏ khoảng cách trên cùng
        panel.add(titleLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Thu nhỏ khoảng cách giữa các thành phần
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));  // Thu nhỏ khoảng cách giữa tên và mật khẩu
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));  // Thu nhỏ khoảng cách giữa mật khẩu và nút đăng nhập
        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));  // Khoảng cách giữa nút và liên kết
        panel.add(linkPanel);

        // Thêm panel vào cửa sổ
        add(panel);

        // Action listener cho nút Đăng nhập
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (validateLogin(username, password)) {
                    // Nếu đăng nhập thành công, mở cửa sổ LibraryApp
                    JOptionPane.showMessageDialog(LoginPage.this, "Login Successful!");
                    dispose();  // Đóng cửa sổ đăng nhập
                    LibraryApp libraryApp = new LibraryApp();
                    libraryApp.setVisible(true);
                } else {
                    // Nếu đăng nhập thất bại
                    JOptionPane.showMessageDialog(LoginPage.this, "Invalid username or password!", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action listener cho liên kết "Create Account" và "Forgot Password"
        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(LoginPage.this, "Account creation feature coming soon!");
            }
        });

        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(LoginPage.this, "Password recovery feature coming soon!");
            }
        });
    }

    // Phương thức kiểm tra tên đăng nhập và mật khẩu
    private boolean validateLogin(String username, String password) {
        return "luan1506".equals(username) && "1506".equals(password);  // Đơn giản, kiểm tra thông tin cố định
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            }
        });
    }
}
