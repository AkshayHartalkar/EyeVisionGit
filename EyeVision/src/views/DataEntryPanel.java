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
	private JTextField txtfldLastName;
	private JLabel lblThisJpanelIs;
	private JLabel lblContact;
	private JTextField txtfldContact;
	private JLabel lblCallType;
	private final ButtonGroup btngrpCallType = new ButtonGroup();
	private final ButtonGroup btngrpAppointMade = new ButtonGroup();
	private JTextField txtfldAppTime;
	private JTextField txtfldAppDate;
	private JTextField txtfldAppReTime;
	private JTextField txtfldAppReDate;
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
		DataEntryFrame.getContentPane().setBackground(new Color(102, 204, 204));
		
		JPanel jpnlLogo = new JPanel();
		jpnlLogo.setBackground(SystemColor.activeCaptionBorder);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldFirstName = new JTextField();
		txtfldFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldLastName = new JTextField();
		txtfldLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldLastName.setColumns(10);
		
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
		
		txtfldAppTime = new JTextField();
		txtfldAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppTime.setColumns(10);
		
		txtfldAppDate = new JTextField();
		txtfldAppDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppDate.setColumns(10);
		
		JLabel lblAppointmentReschedulereminder = new JLabel("Appointment Reschedule/Reminder date:");
		lblAppointmentReschedulereminder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppReTime = new JTextField();
		txtfldAppReTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppReTime.setColumns(10);
		
		JLabel lblAppReRmkDat = new JLabel("Date:");
		lblAppReRmkDat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtfldAppReDate = new JTextField();
		txtfldAppReDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtfldAppReDate.setColumns(10);
		
		JLabel lblAppointmentReschedulereminderRemark = new JLabel("Appointment Reschedule/Reminder Remark:");
		lblAppointmentReschedulereminderRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpAppReRmk = new JScrollPane();
		
		JLabel lblCJRemark = new JLabel("Course Join Remark:");
		lblCJRemark.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JScrollPane scrpCJRmk = new JScrollPane();
		
		JButton btnSubmit = new JButton("Sumit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel jpnlAppMade = new JPanel();
		jpnlAppMade.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jpnlAppMade.setBackground(new Color(153, 204, 204));
		
		JPanel jpnlEnqMade = new JPanel();
		jpnlEnqMade.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		jpnlEnqMade.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppTime = new JLabel("Date:");
		lblAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel pnlCJ = new JPanel();
		pnlCJ.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		pnlCJ.setBackground(new Color(153, 204, 204));
		
		JLabel lblCJ = new JLabel("Course Join?");
		lblCJ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnCJYes = new JRadioButton("Yes");
		btngrpCJ.add(rdbtnCJYes);
		rdbtnCJYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJYes.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnCJNo = new JRadioButton("No");
		btngrpCJ.add(rdbtnCJNo);
		rdbtnCJNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJNo.setBackground(new Color(153, 204, 204));
		
		JPanel jpnlCJFup = new JPanel();
		jpnlCJFup.setBackground(new Color(153, 204, 204));
		
		JLabel label_5 = new JLabel("No Course Join Follw-ups");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBackground(new Color(153, 204, 204));
		
		JLabel lblEnquiryMade = new JLabel("Enquiry made?");
		lblEnquiryMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnEnqMadeYes = new JRadioButton("Yes");
		btngrpEnqMade.add(rdbtnEnqMadeYes);
		rdbtnEnqMadeYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnqMadeYes.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnEnqMadeNo = new JRadioButton("No");
		btngrpEnqMade.add(rdbtnEnqMadeNo);
		rdbtnEnqMadeNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnqMadeNo.setBackground(new Color(153, 204, 204));
		
		JPanel pnlEnqFup = new JPanel();
		pnlEnqFup.setBackground(new Color(153, 204, 204));
		
		JCheckBox cbEnqFup3 = new JCheckBox("Follow-up 3");
		cbEnqFup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup3.setBackground(new Color(153, 204, 204));
		
		JLabel label_3 = new JLabel("No Enquiry Follw-ups");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBackground(new Color(153, 204, 204));
		
		JCheckBox cbEnqFup1 = new JCheckBox("Follow-up 1");
		cbEnqFup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup1.setBackground(new Color(153, 204, 204));
		
		JLabel label = new JLabel("Appointment made?");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnAppMadeYes = new JRadioButton("Yes");
		btngrpAppointMade.add(rdbtnAppMadeYes);
		rdbtnAppMadeYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnAppMadeYes.setBackground(new Color(153, 204, 204));
		
		JRadioButton rdbtnAppMadeNo = new JRadioButton("No");
		btngrpAppointMade.add(rdbtnAppMadeNo);
		rdbtnAppMadeNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnAppMadeNo.setBackground(new Color(153, 204, 204));
		
		JPanel JpnlAppFup = new JPanel();
		JpnlAppFup.setBackground(new Color(153, 204, 204));
		
		JCheckBox cbAppFup3 = new JCheckBox("Follow-up 3");
		cbAppFup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup3.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppFup = new JLabel("No Appointment Follw-ups");
		lblAppFup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JCheckBox cbAppFup1 = new JCheckBox("Follow-up 1");
		cbAppFup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup1.setBackground(new Color(153, 204, 204));
		
		JTextArea taCJRmk = new JTextArea();
		taCJRmk.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrpCJRmk.setViewportView(taCJRmk);
		
		JTextArea txtaAppReRmk = new JTextArea();
		txtaAppReRmk.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrpAppReRmk.setViewportView(txtaAppReRmk);
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		GroupLayout groupLayout = new GroupLayout(DataEntryFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(jpnlEnqMade, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAppointmentReschedulereminder)
								.addComponent(lblAppointmentDateTime))
							.addGap(16)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAppReRmkDat))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAppTime, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppReDate, 0, 0, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCallType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnEnquiry, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnCentre, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(rdbtnWalkin, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addComponent(jpnlAppMade, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblBranch)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAppointmentReschedulereminderRemark)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblContact, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtfldContact))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFirstName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtfldLastName, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addComponent(pnlCJ, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnSubmit)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblCJRemark)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jpnlLogo, GroupLayout.PREFERRED_SIZE, 661, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpnlLogo, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfldFirstName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtfldLastName, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
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
					.addComponent(jpnlAppMade, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
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
								.addComponent(lblAppTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAppReRmkDat, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfldAppReTime, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAppointmentReschedulereminderRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpnlEnqMade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnlCJ, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCJRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		
		JCheckBox CbCJFup = new JCheckBox("Follow-up");
		CbCJFup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CbCJFup.setBackground(new Color(153, 204, 204));
		GroupLayout gl_jpnlCJFup = new GroupLayout(jpnlCJFup);
		gl_jpnlCJFup.setHorizontalGroup(
			gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
				.addGap(0, 237, Short.MAX_VALUE)
				.addGroup(gl_jpnlCJFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
						.addComponent(CbCJFup)
						.addComponent(label_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_jpnlCJFup.setVerticalGroup(
			gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlCJFup.createSequentialGroup()
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(CbCJFup)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		jpnlCJFup.setLayout(gl_jpnlCJFup);
		GroupLayout gl_pnlCJ = new GroupLayout(pnlCJ);
		gl_pnlCJ.setHorizontalGroup(
			gl_pnlCJ.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCJ.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCJ, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(rdbtnCJYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnCJNo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
					.addComponent(jpnlCJFup, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
		);
		gl_pnlCJ.setVerticalGroup(
			gl_pnlCJ.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCJ.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCJ.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCJ.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCJ, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCJ.createSequentialGroup()
							.addGap(1)
							.addComponent(rdbtnCJYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCJ.createSequentialGroup()
							.addGap(1)
							.addComponent(rdbtnCJNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
				.addComponent(jpnlCJFup, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
		);
		pnlCJ.setLayout(gl_pnlCJ);
		
		
		
		JCheckBox cbEnqFup2 = new JCheckBox("Follow-up 2");
		cbEnqFup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup2.setBackground(new Color(153, 204, 204));
		GroupLayout gl_pnlEnqFup = new GroupLayout(pnlEnqFup);
		gl_pnlEnqFup.setHorizontalGroup(
			gl_pnlEnqFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlEnqFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlEnqFup.createParallelGroup(Alignment.LEADING)
						.addComponent(cbEnqFup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbEnqFup1)
						.addComponent(cbEnqFup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_pnlEnqFup.setVerticalGroup(
			gl_pnlEnqFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlEnqFup.createSequentialGroup()
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(cbEnqFup1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cbEnqFup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbEnqFup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlEnqFup.setLayout(gl_pnlEnqFup);
		GroupLayout gl_jpnlEnqMade = new GroupLayout(jpnlEnqMade);
		gl_jpnlEnqMade.setHorizontalGroup(
			gl_jpnlEnqMade.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_jpnlEnqMade.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEnquiryMade, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(rdbtnEnqMadeYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addComponent(rdbtnEnqMadeNo, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addComponent(pnlEnqFup, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
		);
		gl_jpnlEnqMade.setVerticalGroup(
			gl_jpnlEnqMade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlEnqMade.createSequentialGroup()
					.addGroup(gl_jpnlEnqMade.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnlEnqMade.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_jpnlEnqMade.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpnlEnqMade.createSequentialGroup()
									.addGap(2)
									.addComponent(lblEnquiryMade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnEnqMadeYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnEnqMadeNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(pnlEnqFup, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlEnqMade.setLayout(gl_jpnlEnqMade);
		
		
		
		JCheckBox cbAppFup2 = new JCheckBox("Follow-up 2");
		cbAppFup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup2.setBackground(new Color(153, 204, 204));
		GroupLayout gl_JpnlAppFup = new GroupLayout(JpnlAppFup);
		gl_JpnlAppFup.setHorizontalGroup(
			gl_JpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JpnlAppFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_JpnlAppFup.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_JpnlAppFup.createSequentialGroup()
							.addComponent(cbAppFup1)
							.addContainerGap())
						.addGroup(gl_JpnlAppFup.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_JpnlAppFup.createSequentialGroup()
								.addComponent(lblAppFup, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_JpnlAppFup.createSequentialGroup()
								.addGroup(gl_JpnlAppFup.createParallelGroup(Alignment.LEADING, false)
									.addComponent(cbAppFup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
									.addComponent(cbAppFup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addGap(111)))))
		);
		gl_JpnlAppFup.setVerticalGroup(
			gl_JpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JpnlAppFup.createSequentialGroup()
					.addComponent(lblAppFup, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cbAppFup1)
					.addGap(3)
					.addComponent(cbAppFup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbAppFup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		JpnlAppFup.setLayout(gl_JpnlAppFup);
		GroupLayout gl_jpnlAppMade = new GroupLayout(jpnlAppMade);
		gl_jpnlAppMade.setHorizontalGroup(
			gl_jpnlAppMade.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_jpnlAppMade.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(rdbtnAppMadeYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(rdbtnAppMadeNo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(JpnlAppFup, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
		);
		gl_jpnlAppMade.setVerticalGroup(
			gl_jpnlAppMade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlAppMade.createSequentialGroup()
					.addGroup(gl_jpnlAppMade.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnlAppMade.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_jpnlAppMade.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpnlAppMade.createParallelGroup(Alignment.BASELINE)
									.addComponent(rdbtnAppMadeYes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnAppMadeNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(JpnlAppFup, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlAppMade.setLayout(gl_jpnlAppMade);
		
		
		
		lblThisJpanelIs = new JLabel("this jpanel is for eyevision name and logo");
		lblThisJpanelIs.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_jpnlLogo = new GroupLayout(jpnlLogo);
		gl_jpnlLogo.setHorizontalGroup(
			gl_jpnlLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jpnlLogo.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addComponent(lblThisJpanelIs, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
		);
		gl_jpnlLogo.setVerticalGroup(
			gl_jpnlLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlLogo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThisJpanelIs, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(5))
		);
		jpnlLogo.setLayout(gl_jpnlLogo);
		DataEntryFrame.getContentPane().setLayout(groupLayout);
		DataEntryFrame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jpnlLogo, lblThisJpanelIs, lblFirstName, txtfldFirstName, lblLastName, txtfldLastName, lblContact, txtfldContact, lblCallType, rdbtnEnquiry, rdbtnCentre, rdbtnWalkin}));
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
