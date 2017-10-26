package comcarpark;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ManageScreen extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ManageScreen() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 200, 600, 700);
		getContentPane().setLayout(null);
		
		WindowListener exitListener = new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		    	UserScreen frame = new UserScreen();
				frame.setVisible(true);
		    //System.out.println("sdssd");
		    }
		};
		
		this.addWindowListener(exitListener);
		
		
		JLabel lblMyBookings = new JLabel("My Bookings");
		lblMyBookings.setBounds(158, 11, 118, 29);
		getContentPane().add(lblMyBookings);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 57, 299, 141);
		textArea.setEditable(false);
		getContentPane().add(textArea);
	}

}
