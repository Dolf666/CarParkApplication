package comcarpark;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class LogInScreen extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInScreen frame = new LogInScreen();
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
	public LogInScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will close all aplication
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParkingApp = new JLabel("Parking App");
		lblParkingApp.setBounds(164, 16, 176, 20);
		contentPane.add(lblParkingApp);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your username:");
		lblPleaseEnterYour.setBounds(142, 182, 243, 20);
		contentPane.add(lblPleaseEnterYour);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(204, 218, 102, 26);
		contentPane.add(textPane);
		
		JLabel lblPleaseEnterYour_1 = new JLabel("Please enter your password:");
		lblPleaseEnterYour_1.setBounds(149, 323, 212, 20);
		contentPane.add(lblPleaseEnterYour_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(204, 373, 102, 26);
		contentPane.add(textPane_1);
		
		JButton btnNewButton = new JButton("Forgotten credentials?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(150, 509, 188, 29);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(205, 427, 89, 23);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserScreen frame = new UserScreen();
					frame.setVisible(true);
					setVisible(false);
					//setEnabled(false);
					System.out.println("tadaa");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnSubmit);
	}
}