package comcarpark;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;


public class Booking  extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
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
	public Booking() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParkingApp = new JLabel("Booking");
		lblParkingApp.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblParkingApp.setBounds(208, -24, 272, 180);
		contentPane.add(lblParkingApp);
		
		JButton btnMyDetails = new JButton("My Details");
		btnMyDetails.setBounds(387, 16, 149, 29);
		contentPane.add(btnMyDetails);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(300, 171, -195, 116);
		contentPane.add(textArea);
		
		JLabel lblChooseCarPark = new JLabel("Choose car park:");
		lblChooseCarPark.setBounds(25, 70, 192, 45);
		contentPane.add(lblChooseCarPark);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(25, 131, 121, 26);
		contentPane.add(comboBox);
		comboBox.addItem("  ");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		
		JLabel lblStartDate = new JLabel("Start date:");
		lblStartDate.setBounds(25, 171, 121, 20);
		contentPane.add(lblStartDate);
		
		JLabel lblStartTime = new JLabel("Start time:");
		lblStartTime.setBounds(25, 353, 131, 20);
		contentPane.add(lblStartTime);
		
		JLabel lblEndTime = new JLabel("End time:");
		lblEndTime.setBounds(310, 353, 97, 20);
		contentPane.add(lblEndTime);
		
		JLabel lblThisWillBe_1 = new JLabel("This will be a time picker");
		lblThisWillBe_1.setBounds(36, 384, 205, 20);
		contentPane.add(lblThisWillBe_1);
		
		JLabel label_1 = new JLabel("This will be a time picker");
		label_1.setBounds(275, 384, 205, 20);
		contentPane.add(label_1);
		
		JLabel lblVehicleRegistration = new JLabel("Vehicle Registration:");
		lblVehicleRegistration.setBounds(71, 455, 146, 20);
		contentPane.add(lblVehicleRegistration);
		
		textField = new JTextField();
		textField.setBounds(71, 493, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBook = new JButton("Book");
		btnBook.setBounds(300, 548, 115, 29);
		contentPane.add(btnBook);
		
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					BookingConfirmed frame1 = new BookingConfirmed();
					frame1.setVisible(true);
					setVisible(false);
					//setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(0, 192, 198, 159);
		contentPane.add(calendar);
		
		JLabel lblEndDate = new JLabel("End date:");
		lblEndDate.setBounds(395, 172, 69, 20);
		contentPane.add(lblEndDate);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(310, 192, 198, 159);
		contentPane.add(calendar_1);
		
		JSpinField spinField = new JSpinField();
		spinField.setBounds(114, 572, 32, 26);
		contentPane.add(spinField);
	}
}
