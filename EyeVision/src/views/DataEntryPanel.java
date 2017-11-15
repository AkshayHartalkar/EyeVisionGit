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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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
	private final ButtonGroup btngrpEnqMade = new ButtonGroup();
	private final ButtonGroup btngrpCJ = new ButtonGroup();

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
		DataEntryFrame.setResizable(false);
		DataEntryFrame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		DataEntryFrame.getContentPane().setBackground(new Color(153, 204, 204));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		
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
		rdbtnEnquiry.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnCentre = new JRadioButton("Centre");
		btngrpCallType.add(rdbtnCentre);
		rdbtnCentre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCentre.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnWalkin = new JRadioButton("Walk-In");
		btngrpCallType.add(rdbtnWalkin);
		rdbtnWalkin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnWalkin.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppointmentMade = new JLabel("Appointment made?");
		lblAppointmentMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		btngrpAppointMade.add(rdbtnYes);
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnYes.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		btngrpAppointMade.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNo.setBackground(new Color(153, 204, 204));
		
		JPanel jpnlAppFup = new JPanel();
		jpnlAppFup.setBackground(new Color(153, 204, 204));
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox cbBranch = new JComboBox();
		cbBranch.setBackground(SystemColor.activeCaptionBorder);
		cbBranch.setModel(new DefaultComboBoxModel(new String[] {"Andheri", "Malad", "Goregoan", "Bandra", "Churchgate"}));
		cbBranch.setSelectedIndex(0);
		cbBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblAppointmentDateTime = new JLabel("Appointment Date and Appointment Time:");
		lblAppointmentDateTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppDate = new JTextField();
		txtfldAppDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppDate.setColumns(10);
		
		txtfldAppTime = new JTextField();
		txtfldAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppTime.setColumns(10);
		
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
		
		JLabel lblAppointmentReschedulereminderRemark = new JLabel("Appointment Reschedule/Reminder Remark:");
		lblAppointmentReschedulereminderRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpAppReRmk = new JScrollPane();
		
		JLabel lblEnquiryMade = new JLabel("Enquiry made?");
		lblEnquiryMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnEnquiryYes = new JRadioButton("Yes");
		btngrpEnqMade.add(rdbtnEnquiryYes);
		rdbtnEnquiryYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnquiryYes.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnEnquiryNo = new JRadioButton("No");
		btngrpEnqMade.add(rdbtnEnquiryNo);
		rdbtnEnquiryNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnquiryNo.setBackground(new Color(153, 204, 204));
		
		JPanel jpnlNoEnqFup = new JPanel();
		jpnlNoEnqFup.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox = new JCheckBox("Follow-up 3");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox.setBackground(new Color(153, 204, 204));
		
		JLabel lblNoEnquiryFollwups = new JLabel("No Enquiry Follw-ups");
		lblNoEnquiryFollwups.setBackground(new Color(153, 204, 204));
		lblNoEnquiryFollwups.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox checkBox_1 = new JCheckBox("Follow-up 1");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_1.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_2 = new JCheckBox("Follow-up 2");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_2.setBackground(new Color(153, 204, 204));
		GroupLayout gl_jpnlNoEnqFup = new GroupLayout(jpnlNoEnqFup);
		gl_jpnlNoEnqFup.setHorizontalGroup(
			gl_jpnlNoEnqFup.createParallelGroup(Alignment.LEADING)
				.addGap(0, 205, Short.MAX_VALUE)
				.addGroup(gl_jpnlNoEnqFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlNoEnqFup.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNoEnquiryFollwups, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(checkBox_1)
						.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_jpnlNoEnqFup.setVerticalGroup(
			gl_jpnlNoEnqFup.createParallelGroup(Alignment.LEADING)
				.addGap(0, 127, Short.MAX_VALUE)
				.addGroup(gl_jpnlNoEnqFup.createSequentialGroup()
					.addComponent(lblNoEnquiryFollwups, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlNoEnqFup.setLayout(gl_jpnlNoEnqFup);
		
		JLabel lblCourseJoin = new JLabel("Course Join?");
		lblCourseJoin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnCJNo = new JRadioButton("No");
		btngrpCJ.add(rdbtnCJNo);
		rdbtnCJNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJNo.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnCJYes = new JRadioButton("Yes");
		btngrpCJ.add(rdbtnCJYes);
		rdbtnCJYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJYes.setBackground(new Color(153, 204, 204));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 204));
		
		JLabel lblNoCourseJoin = new JLabel("No Course Join Follw-ups");
		lblNoCourseJoin.setBackground(new Color(153, 204, 204));
		lblNoCourseJoin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chckbxFollowup = new JCheckBox("Follow-up");
		chckbxFollowup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxFollowup.setBackground(new Color(153, 204, 204));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNoCourseJoin, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(chckbxFollowup))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblNoCourseJoin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxFollowup)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblRemark = new JLabel("Course Join Remark:");
		lblRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpCJRmk = new JScrollPane();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		GroupLayout groupLayout = new GroupLayout(DataEntryFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtfldContact, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCallType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnEnquiry, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblAppointmentMade))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnCentre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNo)
									.addGap(14)
									.addComponent(jpnlAppFup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnWalkin, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblBranch)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAppointmentDateTime))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 840, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(280)
							.addComponent(btnSubmit))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblRemark)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrpCJRmk))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(lblFirstName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblAppointmentReschedulereminderRemark)
												.addComponent(lblAppointmentReschedulereminder))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblCourseJoin)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(rdbtnCJYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
													.addComponent(rdbtnCJNo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblEnquiryMade)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(rdbtnEnquiryYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(rdbtnEnquiryNo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
											.addGap(98)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jpnlNoEnqFup, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
										.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
													.addGap(16)
													.addComponent(lblTime))
												.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblAppointmentMade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
							.addGap(106)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jpnlAppFup, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAppointmentDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(12))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAppointmentReschedulereminder, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAppointmentReschedulereminderRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblEnquiryMade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnEnquiryYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnEnquiryNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(109)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnCJYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCourseJoin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnCJNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(33))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jpnlNoEnqFup, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		
		JTextArea taCJRmk = new JTextArea();
		scrpCJRmk.setViewportView(taCJRmk);
		
		JTextArea txtaAppReRmk = new JTextArea();
		scrpAppReRmk.setViewportView(txtaAppReRmk);
		
		JLabel lblappointmentfollowup = new JLabel("No Appointment Follw-ups");
		lblappointmentfollowup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chbxFup1 = new JCheckBox("Follow-up 1");
		chbxFup1.setBackground(new Color(153, 204, 204));
		chbxFup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox chbxFup2 = new JCheckBox("Follow-up 2");
		chbxFup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chbxFup2.setBackground(new Color(153, 204, 204));
		
		JCheckBox chbxFup3 = new JCheckBox("Follow-up 3");
		chbxFup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chbxFup3.setBackground(new Color(153, 204, 204));
		GroupLayout gl_jpnlAppFup = new GroupLayout(jpnlAppFup);
		gl_jpnlAppFup.setHorizontalGroup(
			gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlAppFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
						.addComponent(chbxFup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblappointmentfollowup, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(chbxFup1)
						.addComponent(chbxFup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_jpnlAppFup.setVerticalGroup(
			gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlAppFup.createSequentialGroup()
					.addComponent(lblappointmentfollowup, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chbxFup1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chbxFup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chbxFup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		jpnlAppFup.setLayout(gl_jpnlAppFup);
		
		lblThisJpanelIs = new JLabel("this jpanel is for eyevision name and logo");
		lblThisJpanelIs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(109)
					.addComponent(lblThisJpanelIs, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(272, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblThisJpanelIs, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		DataEntryFrame.getContentPane().setLayout(groupLayout);
		DataEntryFrame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jpnlAppFup, panel, lblThisJpanelIs, lblFirstName, txtfldFirstName, lblLastName, textField, lblContact, txtfldContact, lblCallType, rdbtnEnquiry, rdbtnCentre, rdbtnWalkin, lblAppointmentMade, rdbtnYes, rdbtnNo}));
		DataEntryFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		DataEntryFrame.setTitle("Customer Data Entry Window");
		DataEntryFrame.setBounds(100, 100, 677, 965);
		DataEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	////////////////////////////////////////Initialize the Events.
	*/
	private void CreateEvents() {
		// TODO Auto-generated method stub
		
	}
}
