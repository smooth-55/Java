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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class search_events extends JFrame {
//	Declaring Variables

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn_back;
	private JSeparator separator;
	protected JTable event_table;
	private JScrollPane scrollPane;
	private JTextField txtField_srch;
	private JButton btn_clkToBook;
	private JLabel lbl_srch;
	private JLabel lbl_filter;
	private JLabel backimg;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search_events frame = new search_events();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public search_events() {
		setResizable(false); //resizing window is disabled
		setTitle("Search/Book Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 100, 1022, 421);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		defining background image for this window
		backimg = new JLabel("");
		backimg.setBounds(0, 0, 1022, 392);
		Image img = new ImageIcon(this.getClass().getResource("/download (1).jpg")).getImage();
		backimg.setIcon(new ImageIcon(img));
		contentPane.add(backimg);

		btn_back = new JButton("");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
				dashboard backDash = new dashboard();
				backDash.setVisible(true);
//				if this button is clicked system gets user back to the dashboard

			}
		});
		btn_back.setOpaque(false);
		btn_back.setBounds(0, 10, 48, 42);
		btn_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		backimg.add(btn_back);
		Image back = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage(); //back-img for button
		btn_back.setIcon(new ImageIcon(back));
		btn_back.setBackground(Color.white);
		btn_back.setBorder(null);

		scrollPane = new JScrollPane(); //scrollpane for the table
		scrollPane.setBorder(null);
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setBounds(0, 144, 1022, 250);
		backimg.add(scrollPane);

		event_table = new JTable(); //table that contains all the events
		event_table.setBorder(null);
		event_table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		event_table.setName("");
		event_table.setRowHeight(25);
		event_table.setSelectionBackground(new Color(255, 0, 0));
		event_table.setSelectionForeground(new Color(245, 255, 250));
		event_table.setGridColor(new Color(160, 82, 45));
		event_table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		event_table.setForeground(new Color(0, 0, 0));
		event_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		event_table.setBackground(Color.ORANGE);
		event_table.setModel(new DefaultTableModel(
				new Object[][] {
					
					//Dummy data for the table (list of booked events) 
						{ new Integer(1), "concert1", "Internal event", "2000/03/5", "06am-03am", "PCPS, room303",
								new Integer(100), "<.....>" },
						{ new Integer(2), "music festival", "Internal event", "2000/04/7", "06am-03am", "PCPS, room201",
								new Integer(100), "<.....>" },
						{ new Integer(3), "Freshers Party", "Internal event", "2000/05/10", "04pm-08pm",
								"Tanglehood restrurant", new Integer(500), "<.....>" },
						{ new Integer(4), "Dashain Event", "Internal event", "2000/06/15", "11am-03pm", "PCPS, room404",
								new Integer(200), "<.....>" },
						{ new Integer(5), "Git Gather", "Online event", "2000/06/18", "11am-12pm",
								"https://www.github.com", new Integer(150), "<.....>" },
						{ new Integer(6), "Fun House", "Internal event", "2000/07/12", "09am-03am", "PCPS, room303",
								new Integer(500), "<.....>" },
						{ new Integer(7), "Holi Fest", "Internal event", "2000/08/04", "11am-02am", "PCPS, room303",
								new Integer(100), "<.....>" },
						{ new Integer(8), "Christmas Fest", "Internal event", "2000/11/24", "11am-02pm",
								"PCPS, room303", new Integer(200), "<.....>" },
						{ new Integer(9), "Valentines", "Internal event", "2000/02/13", "11am-02am", "PCPS, room303",
								new Integer(350), "<.....>" },
						{ new Integer(10), "Rose marry", "Internal event", "2000/09/23", "11am-02pm", "PCPS, room303",
								new Integer(500), "<.....>" },
						{ new Integer(11), "HipHop eve", "Internal event", "2000/10/09", "11am-02pm", "PCPS, room303",
								new Integer(500), "<.....>" },
						{ new Integer(12), "A day trip to chitlang", "External Excursion", "2000/10/15", "06am-03am",
								"Chitlang", new Integer(2500), "<.....>" },
						{ new Integer(13), "interEve1", "Internal event", "2000/11/27", "11am-02pm", "PCPS, room303",
								new Integer(700), "<.....>" },
						{ new Integer(14), "onlineEve1", "Online event", "2000/11/28", "11am-12pm",
								"https://www.onlineEve1.com", new Integer(150), "<.....>" },
						{ new Integer(15), "interEve2", "Internal event", "2000/03/5", "11am-02pm", "PCPS, room303",
								new Integer(700), "<.....>" },
						{ new Integer(16), "Educational Tour", "External Excursion", "2000/03/5", "06am-03am", "ktm",
								new Integer(5000), "<.....>" },
						{ new Integer(17), "interEve3", "Internal event", "2000/03/5", "11am-02pm", "PCPS, room303",
								new Integer(300), "<.....>" },
						{ new Integer(18), "Python Gather", "Online event", "2000/03/5", "11am-12pm",
								"https://www.ppp.com", new Integer(150), "<.....>" },
						{ new Integer(19), "onlineEve2", "Online event", "2000/11/29", "11am-12pm",
								"https://www.onlineEve2.com", new Integer(150), "<.....>" },
						{ new Integer(20), "onlineEve3", "Online event", "2000/11/29", "01pm-02pm",
								"https://www.onlineEve3.com", new Integer(150), "<.....>" },
						{ new Integer(21), "trek1", "External Excursion", "2000/03/5", "06am-03am", "solukhumbu",
								new Integer(2500), "<.....>" },
						{ new Integer(22), "interEve4", "Internal event", "2000/03/5", "11am-02pm", "PCPS, room303",
								new Integer(200), "<.....>" },
						{ new Integer(23), "interEve5", "Internal event", "2000/03/5", "11am-02pm", "PCPS, room303",
								new Integer(200), "<.....>" },
						{ new Integer(24), "onlineEve4", "Online event", "2000/11/29", "07pm-08pm",
								"https://www.onlineEve4.com", new Integer(150), "<.....>" },
						{ new Integer(25), "interEve6", "Internal event", "2000/02/7", "11-02pm", "PCPS, room303",
								new Integer(350), "<.....>" }, },
				new String[] { "Event ID", "Name of event", "Type of event", "Date of event", "Time", "Vanue",
						"Price(Rs.)", "Description of event" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		event_table.getColumnModel().getColumn(0).setPreferredWidth(37);
		event_table.getColumnModel().getColumn(1).setPreferredWidth(100);
		event_table.getColumnModel().getColumn(2).setPreferredWidth(103);
		event_table.getColumnModel().getColumn(3).setPreferredWidth(79);
		event_table.getColumnModel().getColumn(5).setPreferredWidth(109);
		scrollPane.setViewportView(event_table);

		txtField_srch = new JTextField();
		txtField_srch.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(128, 128, 128)));
		txtField_srch.setBackground(new Color(255, 240, 245));
		txtField_srch.setForeground(new Color(178, 34, 34));
		txtField_srch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				//for defining the logic for filtering the list of event with certain keywords
				
				DefaultTableModel table = (DefaultTableModel) event_table.getModel();
				String search = txtField_srch.getText().toString();
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
				event_table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(search));
			}
		});
		txtField_srch.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtField_srch.setBounds(135, 103, 280, 31);
		backimg.add(txtField_srch);
		txtField_srch.setColumns(10);

		lbl_filter = new JLabel("Filter Here:");
		lbl_filter.setForeground(new Color(60, 179, 113));
		lbl_filter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_filter.setBounds(25, 100, 100, 36);
		backimg.add(lbl_filter);

		lbl_srch = new JLabel("Search For Event");
		backimg.add(lbl_srch);
		lbl_srch.setForeground(new Color(144, 238, 144));
		lbl_srch.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lbl_srch.setBounds(431, 20, 270, 42);

		btn_clkToBook = new JButton("Make Bookings");
		btn_clkToBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_clkToBook.setBackground(new Color(207, 58, 26));
		btn_clkToBook.setForeground(new Color(204, 231, 232));
		btn_clkToBook.setFocusPainted(false);
		btn_clkToBook.setBorderPainted(false);
		btn_clkToBook.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_clkToBook.setBounds(810, 92, 190, 42);
		backimg.add(btn_clkToBook);
		btn_clkToBook.addMouseListener(new MouseAdapter() {
			//make booking button with its mouseListener
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_clkToBook.setForeground(new Color(0, 0, 0));
				btn_clkToBook.setBackground(new Color(245, 245, 245));

			}

			@Override
			public void mouseExited(MouseEvent e) {

				btn_clkToBook.setBackground(new Color(207, 58, 26));
				btn_clkToBook.setForeground(new Color(204, 231, 232));
			}
		});

		btn_clkToBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				logic to provide all the details of the selected window
//				to the next Frame in which booking process will be done

				int i = event_table.getSelectedRow();
				if (i >= 0) {

					dispose();

					booking_process ticket = new booking_process();

					int index = event_table.getSelectedRow();
					TableModel model = event_table.getModel();

					String zero = model.getValueAt(index, 0).toString();
					String one = model.getValueAt(index, 1).toString();
					String two = model.getValueAt(index, 5).toString();
					String three = model.getValueAt(index, 3).toString();
					String four = model.getValueAt(index, 4).toString();

					ticket.setVisible(true);
					ticket.setLocationRelativeTo(null);
					ticket.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ticket.textField.setText(zero);
					ticket.textField_1.setText(one);
					ticket.textField_2.setText(two);
					ticket.textField_3.setText(three);
					ticket.textField_4.setText(four);

				} else

				{

					JOptionPane.showMessageDialog(new JFrame(), "Select the Event to book", "Error!!",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		//some separator to decorate GUI or separating the components in GUI
		separator = new JSeparator();
		backimg.add(separator);
		separator.setBounds(429, 62, 262, 2);

	}

}
