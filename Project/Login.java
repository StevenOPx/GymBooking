package Project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/***
 * Gym Booking System Mini-Project
 * Created on 15/11/2021
 * @author Steven Oprisan
 * @version 1.0
 */

/*** Global object references created ***/
public class Login  {
    JTextField usernameField;
    JPasswordField passwordField;

    public Login() {
        JFrame jFrameWindow = new JFrame("Gym Login Page");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(500, 150);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username: ");

        jFrameWindow.add(usernameLabel);

        usernameField = new JTextField(10);

        jFrameWindow.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");

        jFrameWindow.add(passwordLabel);

        passwordField = new JPasswordField(10);

        jFrameWindow.add(passwordField);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        /*** ActionListener is assigned to each field ***/
        usernameField.addActionListener(handler);
        passwordField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String[] args) {
        Login guiApp = new Login();
    }

    private class TextFieldEventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            /*** Text-field triggers the event ***/
            if(e.getSource() == usernameField)
            {
                /*** Password field is next in line and prioritized ***/
                passwordField.requestFocus();
            }

            /*** Password field triggers the event handler ***/
            if(e.getSource() == passwordField)
            {
                /*** The accessor getPassword() returns a char[] array ***/
                char[] passwordCharacters = passwordField.getPassword();

                /*** The char[] array os converted to a String ***/
                String passwordText = new String(passwordCharacters);

                /*** Validation takes place to in-sure both Member and Staff can securely login ***/
                if(usernameField.getText().equals(usernameField) && passwordText.equals(passwordField))

                    JOptionPane.showMessageDialog(null, "Welcome to the Gym Booking System " +
                            usernameField.getText(), "Logged In", JOptionPane.INFORMATION_MESSAGE);

                else
                    JOptionPane.showMessageDialog(null, "An invalid combination was entered",
                            "Try logging in", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}








