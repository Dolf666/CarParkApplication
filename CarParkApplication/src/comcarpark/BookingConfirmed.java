package comcarpark;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;

public class BookingConfirmed extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingConfirmed frame = new BookingConfirmed();
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
	public BookingConfirmed() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		    	UserScreen frame = new UserScreen();
				frame.setVisible(true);
		    //System.out.println("sdssd");
		    }
		};
		
		this.addWindowListener(exitListener);
		
		
		JLabel lblBookingSuccessful = new JLabel("Booking Successful!");
		lblBookingSuccessful.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBookingSuccessful.setBounds(194, 199, 178, 28);
		contentPane.add(lblBookingSuccessful);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(233, 461, 72, 28);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					UserScreen frame1 = new UserScreen();
					frame1.setVisible(true);
					setVisible(false);
					//setEnabled(false);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		contentPane.add(btnBack);
	}

}
