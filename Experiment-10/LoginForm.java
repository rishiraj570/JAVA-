package experiment10;
import javax.swing.*;  // <--- This line is required
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel message = new JLabel();

        frame.setLayout(null);

        userLabel.setBounds(50, 50, 100, 30);
        passLabel.setBounds(50, 100, 100, 30);
        userField.setBounds(150, 50, 150, 30);
        passField.setBounds(150, 100, 150, 30);
        loginButton.setBounds(150, 150, 100, 30);
        message.setBounds(150, 200, 200, 30);

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                message.setText("Login successful!");
            } else {
                message.setText("Invalid credentials!");
            }
        });

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(message);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
