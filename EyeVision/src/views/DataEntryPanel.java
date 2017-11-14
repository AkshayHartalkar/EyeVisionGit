package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class DataEntryPanel {

	private JFrame DataEntryFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntryPanel window = new DataEntryPanel();
					window.DataEntryFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application .
	 */
	public DataEntryPanel() {
		initialize();
		CreateEvents();
	}

	
	/**
	 * ///////////////////////////////////////Initialize the contents of the frame.
	 */
	private void initialize() {
		DataEntryFrame = new JFrame();
		DataEntryFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		DataEntryFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		DataEntryFrame.setTitle("Customer Data Entry Window");
		DataEntryFrame.setBounds(100, 100, 1167, 606);
		DataEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	////////////////////////////////////////Initialize the Events.
	*/
	private void CreateEvents() {
		// TODO Auto-generated method stub
		
	}

}
