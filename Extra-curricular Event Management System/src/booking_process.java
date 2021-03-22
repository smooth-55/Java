import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class booking_process extends JFrame {
	// Declaring Variables

	private JPanel contentPane;
	private JButton btn_back;
	private JLabel lbl_ticketNo;
	private JComboBox comboBox_ticketNo;
	private JLabel lbl_Actype;
	private JComboBox comboBox_actype;
	private JLabel lblAcno;
	private JLabel backImg;
	private JPanel panel;
	private JTextField textField_AcNo;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	private JLabel lblEventId;
	private JLabel lblNameOfEvent;
	private JLabel lblVanue;
	private JLabel lblDateOfEvent;
	private JLabel lblTime;
	private JLabel labelDetail;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private String evNAme;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booking_process frame = new booking_process();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public booking_process() {
		setResizable(false); //resizing window is disabled
		setTitle("Book your ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 100, 821, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		backImg = new JLabel(""); //defining background image for this window
		backImg.setBounds(0, 0, 821, 463);
		Image logoutimg = new ImageIcon(this.getClass().getResource("/musician.jpg")).getImage();
		backImg.setIcon(new ImageIcon(logoutimg));
		contentPane.add(backImg);

		btn_back = new JButton(""); //button with its actionListener
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				search_events bukEv = new search_events();
				bukEv.setVisible(true);

			}
		});
		btn_back.setOpaque(false);
		btn_back.setBounds(0, 10, 48, 42);
		btn_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backImg.add(btn_back);
		contentPane.setLayout(null);
		Image back = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btn_back.setIcon(new ImageIcon(back));
		btn_back.setBackground(new Color(0, 0, 0));
		btn_back.setBorder(null);

		panel = new JPanel();
		panel.setForeground(new Color(255, 160, 122));
		backImg.add(panel);
		panel.setBackground(new Color(0, 0, 0, 200));
//		panel.setBounds(460, 22, 345, 404);
		panel.setBounds(70, 28, 708, 404);
		panel.setLayout(null);

		comboBox_ticketNo = new JComboBox();
		comboBox_ticketNo.setForeground(new Color(128, 0, 0));
		panel.add(comboBox_ticketNo);
		comboBox_ticketNo.setBounds(new Rectangle(0, 0, 0, 32));
		comboBox_ticketNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_ticketNo.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "23", "27", "28", "29", "30" }));

		comboBox_ticketNo.setBounds(528, 117, 162, 26);

		comboBox_actype = new JComboBox();
		comboBox_actype.setForeground(new Color(128, 0, 0));
		panel.add(comboBox_actype);
		comboBox_actype.setModel(new DefaultComboBoxModel(new String[] { "Visa", "Paypal", "Credit Card" }));
		comboBox_actype.setBounds(528, 180, 162, 26);

		lbl_Actype = new JLabel("Account Type:");
		lbl_Actype.setForeground(new Color(255, 160, 122));
		lbl_Actype.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(lbl_Actype);
		lbl_Actype.setBounds(411, 178, 111, 26);

		lblAcno = new JLabel("A/c number:");
		lblAcno.setForeground(new Color(255, 160, 122));
		lblAcno.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(lblAcno);
		lblAcno.setBounds(411, 252, 97, 26);

		lbl_ticketNo = new JLabel("No. of Ticket:");
		lbl_ticketNo.setForeground(new Color(255, 160, 122));
		lbl_ticketNo.setFont(new Font("Dialog", Font.BOLD, 13));
		panel.add(lbl_ticketNo);
		lbl_ticketNo.setBounds(411, 117, 111, 26);

		lblNewLabel = new JLabel("Book your Ticket");
		lblNewLabel.setForeground(new Color(255, 160, 122));
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(458, 37, 184, 22);

		textField_AcNo = new JTextField();
		textField_AcNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_AcNo.setBorder(null);
		textField_AcNo.setBackground(new Color(255, 222, 173));
		textField_AcNo.setForeground(new Color(178, 34, 34));
		textField_AcNo.setBounds(528, 253, 162, 26);
		panel.add(textField_AcNo);
		textField_AcNo.setColumns(10);

		btnNewButton = new JButton("Book Now");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				btnNewButton.setForeground(new Color(0, 0, 0));
				btnNewButton.setBackground(new Color(245, 245, 245));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				btnNewButton.setBackground(new Color(207, 58, 26));
				btnNewButton.setForeground(new Color(204, 231, 232));
			}
		});
		btnNewButton.addActionListener(new ActionListener() { //button with its actionListener
			public void actionPerformed(ActionEvent e) {
				String tfld = textField_AcNo.getText();
				evNAme = textField_1.getText();
				//creating some cases for booking event
				if (tfld.contentEquals("")) {
					JOptionPane.showMessageDialog(new JFrame(), "Please Enter Your Account Number For payment",
							"Error Occured!", JOptionPane.ERROR_MESSAGE);
				}

				else if (tfld.contentEquals("0112233A")) {

					JOptionPane.showMessageDialog(null, "Event '" + evNAme + "' Booked Successfully");
					dispose();
					search_events srch = new search_events();

					srch.setVisible(true);

				} else if (tfld.contentEquals("789456S")) {

					JOptionPane.showMessageDialog(null, "Event '" + evNAme + "' Booked Successfully");
					dispose();
					search_events srch = new search_events();

					srch.setVisible(true);

				} else if (tfld.contentEquals("73287489BB")) {

					JOptionPane.showMessageDialog(null, " " + "Event '" + evNAme + "' Booked Successfully");
					dispose();
					search_events srch = new search_events();

					srch.setVisible(true);

				}

				else {

					JOptionPane.showMessageDialog(new JFrame(), "Please enter valid A/c no.", "Error Occured!",
							JOptionPane.ERROR_MESSAGE);
					textField_AcNo.setText("");

				}

			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(207, 58, 26));
		btnNewButton.setForeground(new Color(204, 231, 232));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(458, 324, 211, 32);
		panel.add(btnNewButton);

		separator = new JSeparator();
		separator.setBounds(437, 71, 211, 2);
		panel.add(separator);

		separator_1 = new JSeparator();
		separator_1.setBorder(new MatteBorder(5, 25, 25, 55, (Color) Color.CYAN));
		separator_1.setBounds(391, 81, 1, 300);
		panel.add(separator_1);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setForeground(new Color(178, 34, 34));
		textField.setBackground(new Color(255, 222, 173));
		textField.setBounds(125, 112, 244, 37);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setForeground(new Color(178, 34, 34));
		textField_1.setBackground(new Color(255, 222, 173));
		textField_1.setColumns(10);
		textField_1.setBounds(125, 165, 244, 37);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setForeground(new Color(178, 34, 34));
		textField_2.setBackground(new Color(255, 222, 173));
		textField_2.setColumns(10);
		textField_2.setBounds(125, 220, 244, 37);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_3.setForeground(new Color(178, 34, 34));
		textField_3.setBackground(new Color(255, 222, 173));
		textField_3.setColumns(10);
		textField_3.setBounds(125, 275, 244, 37);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setForeground(new Color(178, 34, 34));
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 222, 173));
		textField_4.setBounds(125, 330, 244, 37);
		panel.add(textField_4);

		labelDetail = new JLabel("Event:");
		labelDetail.setForeground(new Color(255, 160, 122));
		labelDetail.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelDetail.setBounds(171, 37, 82, 22);
		panel.add(labelDetail);

		separator_2 = new JSeparator();
		separator_2.setBounds(98, 71, 211, 2);
		panel.add(separator_2);

		lblEventId = new JLabel("Event Id.:");
		lblEventId.setForeground(new Color(255, 160, 122));
		lblEventId.setFont(new Font("Dialog", Font.BOLD, 13));
		lblEventId.setBounds(10, 117, 97, 26);
		panel.add(lblEventId);

		lblNameOfEvent = new JLabel("Name of Event:");
		lblNameOfEvent.setForeground(new Color(255, 160, 122));
		lblNameOfEvent.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNameOfEvent.setBounds(10, 170, 122, 26);
		panel.add(lblNameOfEvent);

		lblVanue = new JLabel("Vanue:");
		lblVanue.setForeground(new Color(255, 160, 122));
		lblVanue.setFont(new Font("Dialog", Font.BOLD, 13));
		lblVanue.setBounds(10, 225, 58, 26);
		panel.add(lblVanue);

		lblDateOfEvent = new JLabel("Date of event:");
		lblDateOfEvent.setForeground(new Color(255, 160, 122));
		lblDateOfEvent.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDateOfEvent.setBounds(10, 280, 111, 26);
		panel.add(lblDateOfEvent);

		lblTime = new JLabel("Time:");
		lblTime.setForeground(new Color(255, 160, 122));
		lblTime.setFont(new Font("Dialog", Font.BOLD, 13));
		lblTime.setBounds(10, 327, 46, 26);
		panel.add(lblTime);

	}
}
