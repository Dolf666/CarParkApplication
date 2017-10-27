package comcarpark;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Color;

public class ResetCredentialsScreen  extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	public ResetCredentialsScreen() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		getContentPane().setLayout(null);
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		    	LogInScreen frame = new LogInScreen();
				frame.setVisible(true);
		    
		    }
		};
		
		this.addWindowListener(exitListener);
		
		JLabel lblResetPassword = new JLabel("Request Reset Password code");
		lblResetPassword.setBounds(184, 49, 176, 23);
		getContentPane().add(lblResetPassword);
		
		textField = new JTextField();
		textField.setBounds(177, 111, 156, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourEmail = new JLabel("Enter Your email");
		lblEnterYourEmail.setBounds(213, 86, 97, 14);
		getContentPane().add(lblEnterYourEmail);
		
		JLabel lblNewLabel = new JLabel("Enter code");
		lblNewLabel.setBounds(237, 213, 89, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lblResetPassword_1 = new JLabel("Reset Password");
		lblResetPassword_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResetPassword_1.setBounds(184, 11, 176, 23);
		getContentPane().add(lblResetPassword_1);
		
		JButton btnRequestCode = new JButton("Request code");
		btnRequestCode.setBounds(197, 158, 136, 23);
		getContentPane().add(btnRequestCode);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 249, 113, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTypeNewPassword = new JLabel("Type New Password");
		lblTypeNewPassword.setBounds(213, 308, 117, 14);
		getContentPane().add(lblTypeNewPassword);
		
		JLabel lblReenterNewPassword = new JLabel("Re-enter New Password");
		lblReenterNewPassword.setBounds(213, 383, 147, 14);
		getContentPane().add(lblReenterNewPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 336, 113, 20);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(213, 423, 108, 20);
		getContentPane().add(passwordField_1);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setBackground(Color.BLUE);
		btnResetPassword.setBounds(213, 475, 113, 23);
		getContentPane().add(btnResetPassword);
	}
}
