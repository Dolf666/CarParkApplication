package comcarpark;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class MainScreen extends JFrame{
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblParkingApp = new JLabel("Parking App");
		lblParkingApp.setBounds(181, 16, 206, 62);
		lblParkingApp.setFont(new Font("Tahoma", Font.PLAIN, 36));
		contentPane.add(lblParkingApp);

		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(200, 300, 115, 29);
		contentPane.add(btnLogIn);

		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					LogInScreen frame1 = new LogInScreen();
					frame1.setVisible(true);
					setVisible(false);
					//setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(206, 382, 115, 29);
		contentPane.add(btnSignUp);
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Register frame1 = new Register();
					frame1.setVisible(true);
					setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
