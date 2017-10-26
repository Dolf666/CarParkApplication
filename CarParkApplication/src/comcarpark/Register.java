package comcarpark;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Register extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setBackground(new Color(0, 255, 255));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		
		
		contentPane = new JPanel();
		contentPane.setForeground(Color.YELLOW);
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		
		JLabel lblDolfsParking = new JLabel(" PARKING APP");
		lblDolfsParking.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblDolfsParking.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDolfsParking.setBounds(1, 0, 244, 58);
		contentPane.setLayout(null);
		lblDolfsParking.setForeground(Color.BLACK);
		lblDolfsParking.setFont(new Font("Tahoma", Font.PLAIN, 36));
		contentPane.add(lblDolfsParking);
		//lblDolfsParking.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		
		JLabel lblNewUserRegistration = new JLabel("Please Register ");
		lblNewUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewUserRegistration.setBounds(15, 87, 378, 20);
		contentPane.add(lblNewUserRegistration);
		
		JLabel lblEnterYourfirstFull = new JLabel("Enter your first name: ");
		lblEnterYourfirstFull.setBounds(15, 123, 210, 20);
		contentPane.add(lblEnterYourfirstFull);
		
		JLabel lblEnterYourlastFull = new JLabel("Enter your last  name: ");
		lblEnterYourlastFull.setBounds(15, 201, 209, 20);
		contentPane.add(lblEnterYourlastFull);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(15, 159, 158, 26);
		contentPane.add(textPane);
		
		JLabel lblEnterYourAddress = new JLabel("Enter your address:");
		lblEnterYourAddress.setBounds(331, 123, 158, 20);
		contentPane.add(lblEnterYourAddress);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(304, 159, 259, 103);
		contentPane.add(textPane_1);
		
		JLabel lblEnterYourCar = new JLabel("Enter your vehicle registration:");
		lblEnterYourCar.setBounds(15, 368, 238, 20);
		contentPane.add(lblEnterYourCar);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(15, 404, 158, 26);
		contentPane.add(textPane_2);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(15, 508, 238, 44);
		contentPane.add(comboBox);
		comboBox.addItem("  ");
		comboBox.addItem("Audi");
		comboBox.addItem("Alfa Romeo");
		comboBox.addItem("Bentley");
		comboBox.addItem("BMW");
		comboBox.addItem("Chrysler");
		comboBox.addItem("Dachia");
		comboBox.addItem("Ford");
		comboBox.addItem("Fiat");
		comboBox.addItem("Jeep");
		comboBox.addItem("Kia");
		comboBox.addItem("Lexus");
		comboBox.addItem("Mercedes");
		comboBox.addItem("Nissan");
		comboBox.addItem("Opel");
		comboBox.addItem("Peugeot");
		comboBox.addItem("Renault");
		comboBox.addItem("SEAT");
		comboBox.addItem("Volkswagen");
		comboBox.addItem("Vauxhall");
		
		
		
		JLabel lblPleaseChooseYour = new JLabel("Please choose your vehicle make from the list:");
		lblPleaseChooseYour.setBounds(15, 470, 352, 20);
		contentPane.add(lblPleaseChooseYour);
		
		
		
		
		
		JButton btnRegister = new JButton("Register ");
		btnRegister.setBounds(388, 599, 115, 29);
		contentPane.add(btnRegister);
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserScreen frame1 = new UserScreen();
					frame1.setVisible(true);
					setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblEnterYourEmail = new JLabel("Enter your email address:");
		lblEnterYourEmail.setBounds(15, 290, 182, 20);
		contentPane.add(lblEnterYourEmail);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(15, 239, 158, 26);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(15, 326, 158, 26);
		contentPane.add(textPane_4);
		
		JLabel lblPleasePressUpdate = new JLabel("Please press update, to save changes.");
		lblPleasePressUpdate.setBounds(15, 603, 304, 20);
		contentPane.add(lblPleasePressUpdate);
		
	}

}
