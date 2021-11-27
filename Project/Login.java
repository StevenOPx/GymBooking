package Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private static JLabel usernameLabel;
    private static JTextField usernameText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel loggedIn;

    public static void main(String[] args) {

        /**
         * Adding JPanel, displaying the window
         */
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Login Page");
        frame.setLocation(800,300);
        frame.setSize(400,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50,30,80,30);
        panel.add(usernameLabel);

        usernameText = new JTextField(20);
        usernameText.setBounds(150,30,180,30);
        panel.add(usernameText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,80,80,30);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(150,80,180,30);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(50,130,80,30);
        button.addActionListener(new Login());
        panel.add(button);

        loggedIn = new JLabel("");
        loggedIn.setBounds(10,180,250,30);
        panel.add(loggedIn);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameText.getText();
        String password = passwordText.getText();

        if (user.equals("admin") && password.equals("admin"))
            JOptionPane.showMessageDialog(null, "Logged in as Admin successfully! ",
                    "Logged In", JOptionPane.INFORMATION_MESSAGE);

        else if (user.equals("member") && password.equals("member"))
            JOptionPane.showMessageDialog(null, "Logged in as Member successfully! ",
                    "Logged In", JOptionPane.INFORMATION_MESSAGE);

        else
            JOptionPane.showMessageDialog(null, "Not logged in... ",
                    "Error Message", JOptionPane.ERROR_MESSAGE);
    }
}
