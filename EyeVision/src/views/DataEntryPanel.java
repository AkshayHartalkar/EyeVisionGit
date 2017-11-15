package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DataEntryPanel {

	private JFrame DataEntryFrame;
	private JTextField txtfldFirstName;
	private JTextField textField;
	private JLabel lblThisJpanelIs;
	private JLabel lblContact;
	private JTextField txtfldContact;
	private JLabel lblCallType;
	private final ButtonGroup btngrpCallType = new ButtonGroup();
	private final ButtonGroup btngrpAppointMade = new ButtonGroup();
	private JTextField txtfldAppDate;
	private JTextField txtfldAppTime;
	private JTextField txtfldAppReDate;
	private JTextField txtfldAppReTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
	 * Create the application
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
		DataEntryFrame.getContentPane().setBackground(SystemColor.controlHighlight);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldFirstName = new JTextField();
		txtfldFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		
		lblContact = new JLabel("Contact:");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldContact = new JTextField();
		txtfldContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldContact.setColumns(10);
		
		lblCallType = new JLabel("Call Type:");
		lblCallType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnEnquiry = new JRadioButton("Enquiry");
		btngrpCallType.add(rdbtnEnquiry);
		rdbtnEnquiry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnquiry.setBackground(SystemColor.controlHighlight);
		
		JRadioButton rdbtnCentre = new JRadioButton("Centre");
		btngrpCallType.add(rdbtnCentre);
		rdbtnCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCentre.setBackground(SystemColor.controlHighlight);
		
		JRadioButton rdbtnWalkin = new JRadioButton("Walk-In");
		btngrpCallType.add(rdbtnWalkin);
		rdbtnWalkin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnWalkin.setBackground(SystemColor.controlHighlight);
		
		JLabel lblAppointmentMade = new JLabel("Appointment made?");
		lblAppointmentMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		btngrpAppointMade.add(rdbtnYes);
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnYes.setBackground(SystemColor.controlHighlight);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		btngrpAppointMade.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNo.setBackground(SystemColor.controlHighlight);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox cbBranch = new JComboBox();
		cbBranch.setModel(new DefaultComboBoxModel(new String[] {"Andheri", "Malad", "Goregoan", "Bandra", "Churchgate"}));
		cbBranch.setSelectedIndex(0);
		cbBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblAppointmentDate = new JLabel("Appointment Date:");
		lblAppointmentDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppDate = new JTextField();
		txtfldAppDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppDate.setColumns(10);
		
		txtfldAppTime = new JTextField();
		txtfldAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppTime.setColumns(10);
		
		JLabel lblAppointmentTime = new JLabel("Appointment Time:");
		lblAppointmentTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblAppointmentReschedulereminder = new JLabel("Appointment Reschedule/Reminder date:");
		lblAppointmentReschedulereminder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppReDate = new JTextField();
		txtfldAppReDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppReDate.setColumns(10);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppReTime = new JTextField();
		txtfldAppReTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppReTime.setColumns(10);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		GroupLayout groupLayout = new GroupLayout(DataEntryFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFirstName)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(103, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtfldContact, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(566, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAppointmentMade)
							.addGap(18)
							.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCallType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnEnquiry, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnCentre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(rdbtnWalkin, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(283, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBranch)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(661, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAppointmentDate)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtfldAppDate, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAppointmentTime)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(334))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAppointmentReschedulereminder)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblTime)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(274, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfldContact, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCallType, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(rdbtnEnquiry))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnCentre, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(rdbtnWalkin, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblAppointmentMade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblAppointmentDate, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAppointmentTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblAppointmentReschedulereminder, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(312, Short.MAX_VALUE))
		);
		
		JLabel lblappointmentfollowup = new JLabel("Appointment Follw-ups");
		lblappointmentfollowup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chbxfup1 = new JCheckBox("Follow-up 1");
		chbxfup1.setBackground(SystemColor.controlHighlight);
		chbxfup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chbxfup2 = new JCheckBox("Follow-up 2");
		chbxfup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chbxfup2.setBackground(SystemColor.controlHighlight);
		
		JCheckBox chbxfup3 = new JCheckBox("Follow-up 3");
		chbxfup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chbxfup3.setBackground(SystemColor.controlHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(chbxfup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblappointmentfollowup, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(chbxfup1)
						.addComponent(chbxfup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblappointmentfollowup, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chbxfup1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chbxfup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chbxfup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		lblThisJpanelIs = new JLabel("this jpanel is for eyevision name and logo");
		lblThisJpanelIs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(203, Short.MAX_VALUE)
					.addComponent(lblThisJpanelIs, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addGap(179))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThisJpanelIs, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(5))
		);
		panel.setLayout(gl_panel);
		DataEntryFrame.getContentPane().setLayout(groupLayout);
		DataEntryFrame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_1, panel, lblThisJpanelIs, lblFirstName, txtfldFirstName, lblLastName, textField, lblContact, txtfldContact, lblCallType, rdbtnEnquiry, rdbtnCentre, rdbtnWalkin, lblAppointmentMade, rdbtnYes, rdbtnNo}));
		DataEntryFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		DataEntryFrame.setTitle("Customer Data Entry Window");
		DataEntryFrame.setBounds(100, 100, 857, 799);
		DataEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	////////////////////////////////////////Initialize the Events.
	*/
	private void CreateEvents() {
		// TODO Auto-generated method stub
		
	}
}
