import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cancel_events extends JFrame {

//	Declaring Variables

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JButton button;
	public JTable bookedEvent_lst;
	private JScrollPane scrollPane;
	private JButton btn_clkToCancel;
	private JLabel backimg;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancel_events frame = new cancel_events();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public cancel_events() {
		setResizable(false); //resizing window is disabled
		setTitle("Manage Bookings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 100, 783, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		backimg = new JLabel(""); //defining background image for this window
		backimg.setBounds(0, 0, 1032, 422);
		Image img = new ImageIcon(this.getClass().getResource("/download (1).jpg")).getImage();
		backimg.setIcon(new ImageIcon(img));
		contentPane.add(backimg);

		lblNewLabel = new JLabel("Own Bookings"); //own booking-label
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(310, 0, 162, 43);
		lblNewLabel.setForeground(new Color(144, 238, 144));
		backimg.add(lblNewLabel);

		separator = new JSeparator(); //sepatator (a horizontal line to separate components
		separator.setBounds(286, 41, 207, 2);
		backimg.add(separator);

		button = new JButton(""); //button with its actionListener
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				dashboard backDash = new dashboard();
				backDash.setVisible(true);
			}
		});
		button.setBounds(0, 10, 46, 43);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backimg.add(button);
		Image back = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		button.setIcon(new ImageIcon(back));
		button.setBackground(Color.WHITE);
		button.setOpaque(false);
		button.setBorder(null);

		scrollPane = new JScrollPane(); //scrollpane for the table
//		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(null);
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setBounds(0, 133, 783, 247);
		backimg.add(scrollPane);

		bookedEvent_lst = new JTable(); //table that contains all the booked events
		bookedEvent_lst.setBorder(null);

		bookedEvent_lst.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bookedEvent_lst.setName("");
		bookedEvent_lst.setRowHeight(25);
		bookedEvent_lst.setSelectionBackground(new Color(255, 0, 0));
		bookedEvent_lst.setSelectionForeground(new Color(245, 255, 250));
		bookedEvent_lst.setGridColor(new Color(160, 82, 45));
		bookedEvent_lst.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bookedEvent_lst.setForeground(new Color(0, 0, 0));
		bookedEvent_lst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		bookedEvent_lst.setBackground(Color.ORANGE);
		bookedEvent_lst.setModel(new DefaultTableModel(
				
				//Dummy data for the table (list of events) 
				
				new Object[][] { { new Integer(2), "music festival", "PCPS, room303", "2000/04/7", "06am-03am" },
						{ new Integer(4), "Dashain Event", "PCPS, room404", "2000/06/15", "11am-03pm" },
						{ new Integer(5), "Git Gather", "https://www.github.com", "2000/06/18", "11am-12pm" },
						{ new Integer(12), "A day trip to chitlang", "Chitlang", "2000/10/15", "06am-03am" },
						{ new Integer(16), "Educational Tour", "kathmandu", "2000/03/5", "06am-03am" },
						{ new Integer(17), "interEve3", "PCPS, room303", "2000/03/5", "11am-02pm" },
						{ new Integer(20), "onlineEve3", "https://www.onlineEve3.com", "2000/11/29", "01pm-02pm" },
						{ new Integer(21), "trek1", "solukhumbu", "2000/03/5", "06am-03am" },
						{ new Integer(22), "interEve4", "PCPS, room303", "2000/03/5", "11am-02pm" },
						{ new Integer(23), "interEve5", "PCPS, room303", "2000/03/5", "11am-02pm" },

				}, new String[] { "Event ID", "Name of event", "Vanue", "Date of event", "Time" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		bookedEvent_lst.getColumnModel().getColumn(0).setPreferredWidth(37);
		scrollPane.setViewportView(bookedEvent_lst);

		btn_clkToCancel = new JButton("Cancel Event"); //cancel button 
		btn_clkToCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) bookedEvent_lst.getModel();
				
				//creating cancel confirmation and some cases
				if (bookedEvent_lst.getSelectedRowCount() == 1) {

					int index = bookedEvent_lst.getSelectedRow();
				
					String cncl = tblModel.getValueAt(index, 1).toString();

					int result = JOptionPane.showConfirmDialog(contentPane,
							"Are you sure you want to Cancel the event booking?", "Confirmation",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (result == JOptionPane.YES_OPTION) {

						tblModel.removeRow(bookedEvent_lst.getSelectedRow());

						JOptionPane.showMessageDialog(null, "booking of '" + cncl + "' succesfully cancelled!");

					}

					else

					{
						contentPane.setVisible(true);
					}

				} else {

					if (bookedEvent_lst.getRowCount() == 0) {

						JOptionPane.showMessageDialog(null, "No Event has been booked to be cancel");

					} else {
						JOptionPane.showMessageDialog(new JFrame(), "Select the Event to Cancel booking", "Error!!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btn_clkToCancel.addMouseListener(new MouseAdapter() { //cancel button with its mouseListener
			@Override
			public void mouseEntered(MouseEvent e) {

				btn_clkToCancel.setForeground(new Color(0, 0, 0));
				btn_clkToCancel.setBackground(new Color(245, 245, 245));
			}

			@Override
			public void mouseExited(MouseEvent e) {

				btn_clkToCancel.setBackground(new Color(207, 58, 26));
				btn_clkToCancel.setForeground(new Color(204, 231, 232));
			}
		});
		btn_clkToCancel.setFocusPainted(false);
		btn_clkToCancel.setBorderPainted(false);

		btn_clkToCancel.setBackground(new Color(207, 58, 26));
		btn_clkToCancel.setForeground(new Color(204, 231, 232));
		btn_clkToCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_clkToCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_clkToCancel.setBounds(593, 88, 158, 35);
		backimg.add(btn_clkToCancel);

	}

}
