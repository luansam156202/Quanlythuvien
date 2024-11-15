package library;

import javax.swing.*;

public class AdminLoginFrame extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public AdminLoginFrame() {
        setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(150, 100, 80, 25);
        add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(230, 100, 150, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(150, 140, 80, 25);
        add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(230, 140, 150, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(230, 180, 80, 25);
        add(loginButton);
    }
}
