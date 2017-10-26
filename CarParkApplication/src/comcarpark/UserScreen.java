package comcarpark;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class UserScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserScreen frame = new UserScreen();
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
	public UserScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUser = new JButton("User");
		btnUser.setBounds(32, 49, 71, 57);
		contentPane.add(btnUser);
		
		
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Details frame1 = new Details();
					frame1.setVisible(true);
					setVisible(false);
					//setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setBounds(10, 578, 232, 38);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Booking frame = new Booking();
					frame.setVisible(true);
					setVisible(false);
					//setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Manage");
		btnNewButton_1.setBounds(274, 578, 250, 38);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ManageScreen frame1 = new ManageScreen();
					frame1.setVisible(true);
					setVisible(false);
					//setEnabled(false);
					System.out.println("booking screen ");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Greetings");
		lblNewLabel.setBounds(224, 54, 152, 28);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(134, 240, 266, 146);
		contentPane.add(textArea);
	}
}
