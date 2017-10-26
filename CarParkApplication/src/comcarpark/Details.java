package comcarpark;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Details extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
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
	public Details() {
		setBackground(new Color(0, 255, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		    	UserScreen frame = new UserScreen();
				frame.setVisible(true);
		    //System.out.println("sdssd");
		    }
		};
		
		this.addWindowListener(exitListener);
		
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
		
		JLabel lblNewUserRegistration = new JLabel("My details: ");
		lblNewUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewUserRegistration.setBounds(15, 87, 378, 20);
		contentPane.add(lblNewUserRegistration);
		
		JLabel lblEnterYourfirstFull = new JLabel("First name: ");
		lblEnterYourfirstFull.setBounds(15, 123, 210, 20);
		contentPane.add(lblEnterYourfirstFull);
		
		JLabel lblEnterYourlastFull = new JLabel("Last  name: ");
		lblEnterYourlastFull.setBounds(15, 201, 209, 20);
		contentPane.add(lblEnterYourlastFull);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(15, 159, 158, 26);
		contentPane.add(textPane);
		
		JLabel lblEnterYourAddress = new JLabel("Your address:");
		lblEnterYourAddress.setBounds(331, 123, 158, 20);
		contentPane.add(lblEnterYourAddress);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(304, 159, 259, 103);
		contentPane.add(textPane_1);
		
		JLabel lblEnterYourCar = new JLabel("Vehicle registration:");
		lblEnterYourCar.setBounds(15, 368, 238, 20);
		contentPane.add(lblEnterYourCar);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(15, 404, 158, 26);
		contentPane.add(textPane_2);
		
		
		
		
		
		JButton btnRegister = new JButton("Edit details");
		btnRegister.setBounds(388, 599, 115, 29);
		contentPane.add(btnRegister);
		
		JLabel lblEnterYourEmail = new JLabel("Email address:");
		lblEnterYourEmail.setBounds(15, 290, 182, 20);
		contentPane.add(lblEnterYourEmail);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(15, 239, 158, 26);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(15, 326, 158, 26);
		contentPane.add(textPane_4);
		
		JLabel lblReservations = new JLabel("Reservations:");
		lblReservations.setBounds(331, 332, 115, 20);
		contentPane.add(lblReservations);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(331, 365, 115, 26);
		contentPane.add(comboBox);
		comboBox.addItem("  ");
		comboBox.addItem("10/08/2016");
		comboBox.addItem("24/03/2017");
		comboBox.addItem("01/09/2017");
		
	}

}
