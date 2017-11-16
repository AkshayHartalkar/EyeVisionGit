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
import javax.swing.JOptionPane;
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
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataEntryPanel {

	private JFrame DataEntryFrame;
	private JTextField txtfldFirstName;
	private JTextField txtfldLastName;
	private JLabel lblLogo;
	private JLabel lblContact;
	private JTextField txtfldContact;
	private JLabel lblCallType;
	private final ButtonGroup btngrpCallType = new ButtonGroup();
	private final ButtonGroup btngrpAppointMade = new ButtonGroup();
	private JTextField txtfldAppTime;
	private JTextField txtfldAppReTime;
	private JTextField txtfldAppReDate;
	private final ButtonGroup btngrpEnqMade = new ButtonGroup();
	private final ButtonGroup btngrpCJ = new ButtonGroup();
	private JRadioButton rdbtnAppMadeNo;
	private JPanel jpnlAppFup;
	private JRadioButton rdbtnAppMadeYes;
	private JCheckBox cbAppFup1;
	private JCheckBox cbAppFup2;
	private JCheckBox cbAppFup3;
	private JCheckBox cbEnqFup1;
	private JCheckBox cbEnqFup2;
	private JCheckBox cbEnqFup3;
	private JCheckBox cbCJFup;
	private JRadioButton rdbtnCJYes;
	private JRadioButton rdbtnCJNo;
	private JRadioButton rdbtnEnqMadeYes;
	private JRadioButton rdbtnEnqMadeNo;
	private JCheckBox cbAppFupDnd;
	private JCheckBox cbEnqFupDnd;
	private JPanel jpnlEnqFup;
	private JPanel jpnlCJFup;
	private JCheckBox cbCJFupDnd;
	private JButton btnSubmit;

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
		
		btnSubmit = new JButton("Sumit");
		
		
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel jpnlAppMade = new JPanel();
		jpnlAppMade.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jpnlAppMade.setBackground(new Color(153, 204, 204));
		
		JPanel jpnlEnqMade = new JPanel();
		jpnlEnqMade.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jpnlEnqMade.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppTime = new JLabel("Date:");
		lblAppTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel pnlCJ = new JPanel();
		pnlCJ.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlCJ.setBackground(new Color(153, 204, 204));
		
		JLabel lblCJ = new JLabel("Course Join?");
		lblCJ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnCJYes = new JRadioButton("Yes");
		btngrpCJ.add(rdbtnCJYes);
		rdbtnCJYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJYes.setBackground(new Color(153, 204, 204));
		
		rdbtnCJNo = new JRadioButton("No");
		btngrpCJ.add(rdbtnCJNo);
		rdbtnCJNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCJNo.setBackground(new Color(153, 204, 204));
		
		jpnlCJFup = new JPanel();
		jpnlCJFup.setVisible(false);
		jpnlCJFup.setBackground(new Color(153, 204, 204));
		
		JLabel label_5 = new JLabel("No Course Join Follw-ups");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBackground(new Color(153, 204, 204));
		
		JLabel lblEnquiryMade = new JLabel("Enquiry made?");
		lblEnquiryMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnEnqMadeYes = new JRadioButton("Yes");
		btngrpEnqMade.add(rdbtnEnqMadeYes);
		rdbtnEnqMadeYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnqMadeYes.setBackground(new Color(153, 204, 204));
		
		rdbtnEnqMadeNo = new JRadioButton("No");
		
		btngrpEnqMade.add(rdbtnEnqMadeNo);
		rdbtnEnqMadeNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnEnqMadeNo.setBackground(new Color(153, 204, 204));
		
		jpnlEnqFup = new JPanel();
		jpnlEnqFup.setVisible(false);
		jpnlEnqFup.setBackground(new Color(153, 204, 204));
		
		cbEnqFup3 = new JCheckBox("Follow-up 3");
		cbEnqFup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup3.setBackground(new Color(153, 204, 204));
		
		JLabel label_3 = new JLabel("No Enquiry Follw-ups");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBackground(new Color(153, 204, 204));
		
		cbEnqFup1 = new JCheckBox("Follow-up 1");
		cbEnqFup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup1.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppointmentMade = new JLabel("Appointment made?");
		lblAppointmentMade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		rdbtnAppMadeYes = new JRadioButton("Yes");
		
		btngrpAppointMade.add(rdbtnAppMadeYes);
		rdbtnAppMadeYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnAppMadeYes.setBackground(new Color(153, 204, 204));
		
		rdbtnAppMadeNo = new JRadioButton("No");
		
		btngrpAppointMade.add(rdbtnAppMadeNo);
		rdbtnAppMadeNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnAppMadeNo.setBackground(new Color(153, 204, 204));
		
		jpnlAppFup = new JPanel();
		jpnlAppFup.setVisible(false);
		jpnlAppFup.setBackground(new Color(153, 204, 204));
		
		cbAppFup3 = new JCheckBox("Follow-up 3");
		cbAppFup3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup3.setBackground(new Color(153, 204, 204));
		
		JLabel lblAppFup = new JLabel("No Appointment Follw-ups");
		lblAppFup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		cbAppFup1 = new JCheckBox("Follow-up 1");
		cbAppFup1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup1.setBackground(new Color(153, 204, 204));
		
		JTextArea taCJRmk = new JTextArea();
		taCJRmk.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrpCJRmk.setViewportView(taCJRmk);
		
		JTextArea txtaAppReRmk = new JTextArea();
		txtaAppReRmk.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrpAppReRmk.setViewportView(txtaAppReRmk);
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		cbCJFup = new JCheckBox("Follow-up");
		cbCJFup.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbCJFup.setBackground(new Color(153, 204, 204));
		
		cbCJFupDnd = new JCheckBox("Dnd");
		
		cbCJFupDnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbCJFupDnd.setBackground(new Color(153, 204, 204));
		
		JComboBox cbCourse = new JComboBox();
		cbCourse.setModel(new DefaultComboBoxModel(new String[] {"ABC", "XYZ", "PQR"}));
		cbCourse.setSelectedIndex(0);
		cbCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbCourse.setBackground(SystemColor.activeCaptionBorder);
		
		JDateChooser JdatechoserAppDate = new JDateChooser();
		JdatechoserAppDate.setDateFormatString("dd-MM-yyyy");
		JdatechoserAppDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JDateChooser jdatechoserAppReDate = new JDateChooser();
		jdatechoserAppReDate.setDateFormatString("dd-MM-yyyy");
		jdatechoserAppReDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		
		cbEnqFup2 = new JCheckBox("Follow-up 2");
		cbEnqFup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFup2.setBackground(new Color(153, 204, 204));
		
		cbEnqFupDnd = new JCheckBox("Dnd");
		cbEnqFupDnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbEnqFupDnd.setBackground(new Color(153, 204, 204));
		
		cbAppFup2 = new JCheckBox("Follow-up 2");
		cbAppFup2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFup2.setBackground(new Color(153, 204, 204));
		
		cbAppFupDnd = new JCheckBox("Dnd");
		
		cbAppFupDnd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbAppFupDnd.setBackground(new Color(153, 204, 204));
		
		lblLogo = new JLabel("this jpanel is for eyevision name and logo");
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		GroupLayout groupLayout = new GroupLayout(DataEntryFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
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
									.addComponent(txtfldAppReDate, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(jdatechoserAppReDate, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
										.addComponent(JdatechoserAppDate, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
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
								.addComponent(pnlCJ, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCourse)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbCourse, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSubmit)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCJRemark)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE))))
						.addComponent(jpnlLogo, GroupLayout.PREFERRED_SIZE, 662, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
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
								.addComponent(txtfldAppTime, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
								.addComponent(JdatechoserAppDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(jdatechoserAppReDate, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtfldAppReDate, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
									.addComponent(lblAppReRmkDat, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtfldAppReTime, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAppointmentReschedulereminderRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpAppReRmk, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jpnlEnqMade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnlCJ, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbCourse, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCJRemark, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrpCJRmk, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		
		
		GroupLayout gl_jpnlCJFup = new GroupLayout(jpnlCJFup);
		gl_jpnlCJFup.setHorizontalGroup(
			gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlCJFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnlCJFup.createSequentialGroup()
							.addComponent(cbCJFup)
							.addGap(18)
							.addComponent(cbCJFupDnd, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_jpnlCJFup.setVerticalGroup(
			gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlCJFup.createSequentialGroup()
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpnlCJFup.createParallelGroup(Alignment.LEADING)
						.addComponent(cbCJFup)
						.addComponent(cbCJFupDnd, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(27, Short.MAX_VALUE))
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
		
		
		
		
		GroupLayout gl_jpnlEnqFup = new GroupLayout(jpnlEnqFup);
		gl_jpnlEnqFup.setHorizontalGroup(
			gl_jpnlEnqFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlEnqFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlEnqFup.createParallelGroup(Alignment.LEADING)
						.addComponent(cbEnqFup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_jpnlEnqFup.createSequentialGroup()
							.addComponent(cbEnqFup1)
							.addGap(18)
							.addComponent(cbEnqFupDnd, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addComponent(cbEnqFup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(81, Short.MAX_VALUE))
		);
		gl_jpnlEnqFup.setVerticalGroup(
			gl_jpnlEnqFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlEnqFup.createSequentialGroup()
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_jpnlEnqFup.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnlEnqFup.createSequentialGroup()
							.addComponent(cbEnqFup1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cbEnqFup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cbEnqFup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(cbEnqFupDnd, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlEnqFup.setLayout(gl_jpnlEnqFup);
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
					.addComponent(jpnlEnqFup, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(jpnlEnqFup, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlEnqMade.setLayout(gl_jpnlEnqMade);
		
		
		
		
		GroupLayout gl_jpnlAppFup = new GroupLayout(jpnlAppFup);
		gl_jpnlAppFup.setHorizontalGroup(
			gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlAppFup.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpnlAppFup.createSequentialGroup()
							.addComponent(cbAppFup1)
							.addGap(18)
							.addComponent(cbAppFupDnd)
							.addContainerGap())
						.addGroup(gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_jpnlAppFup.createSequentialGroup()
								.addComponent(lblAppFup, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_jpnlAppFup.createSequentialGroup()
								.addGroup(gl_jpnlAppFup.createParallelGroup(Alignment.LEADING, false)
									.addComponent(cbAppFup3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
									.addComponent(cbAppFup2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
								.addGap(111)))))
		);
		gl_jpnlAppFup.setVerticalGroup(
			gl_jpnlAppFup.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlAppFup.createSequentialGroup()
					.addComponent(lblAppFup, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpnlAppFup.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbAppFup1)
						.addComponent(cbAppFupDnd, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addComponent(cbAppFup2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbAppFup3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlAppFup.setLayout(gl_jpnlAppFup);
		GroupLayout gl_jpnlAppMade = new GroupLayout(jpnlAppMade);
		gl_jpnlAppMade.setHorizontalGroup(
			gl_jpnlAppMade.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_jpnlAppMade.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAppointmentMade, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(rdbtnAppMadeYes, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(rdbtnAppMadeNo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jpnlAppFup, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
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
									.addComponent(lblAppointmentMade, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnAppMadeNo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jpnlAppFup, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jpnlAppMade.setLayout(gl_jpnlAppMade);
		
		

		GroupLayout gl_jpnlLogo = new GroupLayout(jpnlLogo);
		gl_jpnlLogo.setHorizontalGroup(
			gl_jpnlLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jpnlLogo.createSequentialGroup()
					.addContainerGap(99, Short.MAX_VALUE)
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addGap(93))
		);
		gl_jpnlLogo.setVerticalGroup(
			gl_jpnlLogo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpnlLogo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogo, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
					.addGap(5))
		);
		jpnlLogo.setLayout(gl_jpnlLogo);
		DataEntryFrame.getContentPane().setLayout(groupLayout);
		DataEntryFrame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jpnlLogo, lblLogo, lblFirstName, txtfldFirstName, lblLastName, txtfldLastName, lblContact, txtfldContact, lblCallType, rdbtnEnquiry, rdbtnCentre, rdbtnWalkin}));
		DataEntryFrame.setFont(new Font("Dialog", Font.BOLD, 12));
		DataEntryFrame.setTitle("Customer Data Entry Window");
		DataEntryFrame.setBounds(100, 100, 669, 1020);
		DataEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	////////////////////////////////////////Initialize the Events.
	*/
	private void CreateEvents() {
								//######### Appointment Follow up and Dnd########
		
		
		rdbtnAppMadeNo.addActionListener(new ActionListener() {			//sets all followup panel visible
			public void actionPerformed(ActionEvent arg0) {				//on selecting appointment as No
				if(rdbtnAppMadeNo.isSelected())
					jpnlAppFup.setVisible(true);							
				
			}
			
		});
		rdbtnAppMadeYes.addActionListener(new ActionListener() {		//sets all followup panel Invisible
			public void actionPerformed(ActionEvent e) {				//on selecting appointment as Yes
				if(rdbtnAppMadeYes.isSelected())
					jpnlAppFup.setVisible(false);
			}
		});
		
		cbAppFupDnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbAppFupDnd.isSelected())							//sets all followups as selected
				{														//on selecting Dnd
					cbAppFup1.setSelected(true);
				    cbAppFup2.setSelected(true);
				    cbAppFup3.setSelected(true);
				}
				    else{
				    	cbAppFup1.setSelected(false);					//sets all followups as unselected
						cbAppFup2.setSelected(false);					//on unselecting Dnd
						cbAppFup3.setSelected(false);
				    }
			}
		});
		
								//######### Enquiry Follow up and Dnd########
						
						//Enquiry followup panel stays visible on both conditions(yes/no)
		
		
		rdbtnEnqMadeNo.addActionListener(new ActionListener() {			//sets followup panel visible
			public void actionPerformed(ActionEvent e) {				//on selecting Enquiry as No
				if(rdbtnEnqMadeNo.isSelected())
					jpnlEnqFup.setVisible(true);
			}
		});
		
		rdbtnEnqMadeYes.addActionListener(new ActionListener() {		//sets followup panel visible
			public void actionPerformed(ActionEvent e) {				//on selecting Enquiry as Yes
				if(rdbtnEnqMadeYes.isSelected())
					jpnlEnqFup.setVisible(true);
			}
		});
		
		cbEnqFupDnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbEnqFupDnd.isSelected())							//sets all followups as selected
				{														//on selecting Dnd
					cbEnqFup1.setSelected(true);
				    cbEnqFup2.setSelected(true);
				    cbEnqFup3.setSelected(true);
				}
				else{													//sets all followups as unselected
			    	cbEnqFup1.setSelected(false);						//on unselecting Dnd
					cbEnqFup2.setSelected(false);
					cbEnqFup3.setSelected(false);
			    }
			}
		});
		
								//######### Course Join Follow up and Dnd########
		
		rdbtnCJYes.addActionListener(new ActionListener() {				//sets followup panel Invisible
			public void actionPerformed(ActionEvent e) {				//on selecting Course as Yes
				if(rdbtnCJYes.isSelected())
					jpnlCJFup.setVisible(false);
			}
		});
		
		rdbtnCJNo.addActionListener(new ActionListener() {				//sets followup panel visible
			public void actionPerformed(ActionEvent e) {				//on selecting Course as No
				if(rdbtnCJNo.isSelected())
					jpnlCJFup.setVisible(true);
			}
		});
		
		cbCJFupDnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbCJFupDnd.isSelected())								//sets followups as selected
				{														//on selecting Dnd
					cbCJFup.setSelected(true);
				    
				}
				else{													//sets followups as unselected
			    	cbCJFup.setSelected(false);							//on unselecting Dnd	
			    }
			}
		});
		
								//######### Submit Button Event Handler########
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sumit Bhosdika");
			}
		});
		
		// TODO Auto-generated method stub lavda lasun
		
	}
}
