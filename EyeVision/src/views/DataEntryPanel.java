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
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;

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
		
		JLabel lblAppReRmkTime = new JLabel("Time:");
		lblAppReRmkTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppReTime = new JTextField();
		txtfldAppReTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppReTime.setColumns(10);
		
		JLabel lblAppointmentReschedulereminderRemark = new JLabel("Appointment Reschedule/Reminder Remark:");
		lblAppointmentReschedulereminderRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpAppReRmk = new JScrollPane();
		
		JLabel lblRemark = new JLabel("Course Join Remark:");
		lblRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpCJRmk = new JScrollPane();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBackground(new Color(153, 204, 204));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppTime = new JLabel("Time:");
		lblAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(153, 204, 204));
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		GroupLayout groupLayout = new GroupLayout(DataEntryFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAppointmentReschedulereminder)
										.addComponent(lblAppointmentDateTime))
									.addGap(16)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblAppReRmkTime)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblAppTime, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCallType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnEnquiry, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnCentre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(rdbtnWalkin, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblBranch)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAppointmentReschedulereminderRemark)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtfldContact))
										.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
											.addComponent(lblFirstName)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSubmit)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblRemark)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)))))
					.addGap(24))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
					.addGap(11)
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
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBranch, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAppointmentDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblAppointmentReschedulereminder, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAppTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAppReRmkTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAppointmentReschedulereminderRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		
		JLabel label_4 = new JLabel("Course Join?");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton radioButton_4 = new JRadioButton("Yes");
		btngrpCJ.add(radioButton_4);
		radioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_4.setBackground(new Color(153, 204, 204));
		
		JRadioButton radioButton_5 = new JRadioButton("No");
		btngrpCJ.add(radioButton_5);
		radioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_5.setBackground(new Color(153, 204, 204));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(153, 204, 204));
		
		JLabel label_5 = new JLabel("No Course Join Follw-ups");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_6 = new JCheckBox("Follow-up");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_6.setBackground(new Color(153, 204, 204));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGap(0, 237, Short.MAX_VALUE)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox_6)
						.addComponent(label_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox_6)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(radioButton_4, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addComponent(radioButton_5, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(radioButton_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(radioButton_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
				.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label_2 = new JLabel("Enquiry made?");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton radioButton_2 = new JRadioButton("Yes");
		btngrpEnqMade.add(radioButton_2);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_2.setBackground(new Color(153, 204, 204));
		
		JRadioButton radioButton_3 = new JRadioButton("No");
		btngrpEnqMade.add(radioButton_3);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_3.setBackground(new Color(153, 204, 204));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox = new JCheckBox("Follow-up 3");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox.setBackground(new Color(153, 204, 204));
		
		JLabel label_3 = new JLabel("No Enquiry Follw-ups");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_1 = new JCheckBox("Follow-up 1");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_1.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_2 = new JCheckBox("Follow-up 2");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_2.setBackground(new Color(153, 204, 204));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_1)
						.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(checkBox_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addComponent(radioButton_3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
				.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(2)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(radioButton_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label = new JLabel("Appointment made?");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton radioButton = new JRadioButton("Yes");
		btngrpAppointMade.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton.setBackground(new Color(153, 204, 204));
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		btngrpAppointMade.add(radioButton_1);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_1.setBackground(new Color(153, 204, 204));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_3 = new JCheckBox("Follow-up 3");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_3.setBackground(new Color(153, 204, 204));
		
		JLabel label_1 = new JLabel("No Appointment Follw-ups");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox checkBox_4 = new JCheckBox("Follow-up 1");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_4.setBackground(new Color(153, 204, 204));
		
		JCheckBox checkBox_5 = new JCheckBox("Follow-up 2");
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_5.setBackground(new Color(153, 204, 204));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(checkBox_4)
							.addContainerGap())
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_3.createSequentialGroup()
								.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_panel_3.createSequentialGroup()
								.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
									.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
									.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addGap(111)))))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(checkBox_4)
					.addGap(3)
					.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
									.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JTextArea taCJRmk = new JTextArea();
		scrpCJRmk.setViewportView(taCJRmk);
		
		JTextArea txtaAppReRmk = new JTextArea();
		scrpAppReRmk.setViewportView(txtaAppReRmk);
		
		lblThisJpanelIs = new JLabel("this jpanel is for eyevision name and logo");
		lblThisJpanelIs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addComponent(lblThisJpanelIs, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
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
		DataEntryFrame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, lblThisJpanelIs, lblFirstName, txtfldFirstName, lblLastName, textField, lblContact, txtfldContact, lblCallType, rdbtnEnquiry, rdbtnCentre, rdbtnWalkin}));
		DataEntryFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		DataEntryFrame.setTitle("Customer Data Entry Window");
		DataEntryFrame.setBounds(100, 100, 669, 993);
		DataEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	////////////////////////////////////////Initialize the Events.
	*/
	private void CreateEvents() {
		// TODO Auto-generated method stub
		
	}
}
