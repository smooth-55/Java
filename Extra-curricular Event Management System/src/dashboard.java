import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Cursor;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Font;

public class dashboard extends JFrame {
	
//	Declaring Variables

	private JPanel contentPane;
	private JLabel backImg;

	private JButton Search;
	private JButton ViewBooking;
	private JButton logout;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private JLabel lbl_srchEvnt;
	private JLabel lbl_manageBooking;
	private JLabel lbl_logout;
	private Image logoutimg;
	private Image booking;
	private Image srchimg;
	private Image img;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public dashboard() {
		setTitle("Extra-Curricular Event Management System");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(170, 100, 797, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Background-image

		backImg = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/2.jpg")).getImage();
		backImg.setIcon(new ImageIcon(img));
		backImg.setBounds(0, -38, 800, 471);
		contentPane.add(backImg);

		Search = new JButton(""); //Button with image
		Search.setAction(action_2);
		Search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		srchimg = new ImageIcon(this.getClass().getResource("/searchEvent.png")).getImage();
		Search.setIcon(new ImageIcon(srchimg));
		backImg.add(Search);
		Search.setBackground(Color.WHITE);
		Search.setOpaque(false);
		Search.setBorder(null);
		Search.setBounds(105, 140, 128, 128);

		ViewBooking = new JButton("");//Button with image
		ViewBooking.setAction(action_1);
		ViewBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		booking = new ImageIcon(this.getClass().getResource("/BookedEvent.png")).getImage();
		ViewBooking.setIcon(new ImageIcon(booking));
		backImg.add(ViewBooking);
		ViewBooking.setBackground(Color.WHITE);
		ViewBooking.setOpaque(false);
		ViewBooking.setBorder(null);
		ViewBooking.setBounds(330, 140, 128, 128);

		logout = new JButton("");//Button with image
		logout.setAction(action);
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutimg = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		logout.setIcon(new ImageIcon(logoutimg));
		logout.setBounds(561, 140, 128, 128);
		logout.setBackground(Color.WHITE);
		logout.setOpaque(false);
		logout.setBorder(null);
		backImg.add(logout);

		lbl_srchEvnt = new JLabel("Search Event"); //Label for search event
		backImg.add(lbl_srchEvnt);
		lbl_srchEvnt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_srchEvnt.setForeground(Color.CYAN);
		lbl_srchEvnt.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_srchEvnt.setBounds(96, 265, 149, 32);

		lbl_manageBooking = new JLabel("Manage Bookings"); //Label for Manage bookings 
		backImg.add(lbl_manageBooking);
		lbl_manageBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_manageBooking.setForeground(Color.CYAN);
		lbl_manageBooking.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_manageBooking.setBounds(304, 265, 189, 31);

		lbl_logout = new JLabel("Log Out");//Label for Logout
		backImg.add(lbl_logout);
		lbl_logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_logout.setFont(new Font("Dialog", Font.BOLD, 18));
		lbl_logout.setForeground(Color.CYAN);
		lbl_logout.setBounds(589, 265, 89, 31);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Log out");
		}

		public void actionPerformed(ActionEvent e) {
//			actionPerformed for logout button with its confirmation message
			int result = JOptionPane.showConfirmDialog(contentPane, "Are you sure you want to Log out?", "Confirmation",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {

				contentPane.setVisible(false);
				dispose();
				Login.main(null);
				JOptionPane.showMessageDialog(null, "Succesfully logged out");
			}

			else

			{
				contentPane.setVisible(true);
			}
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			
			
			putValue(NAME, "view booking");
			putValue(SHORT_DESCRIPTION, "View/Cancel Own Bookings");
		}

		public void actionPerformed(ActionEvent e) {
			dispose(); //closing this window
//			actionPerformed for view booking button 
			cancel_events bookingWindow = new cancel_events();
			bookingWindow.setVisible(true);

		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "search booking");
			putValue(SHORT_DESCRIPTION, "Search/Book event");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();//closing this window
			search_events srchWindow = new search_events(); //opening search_events window
			srchWindow.setVisible(true);
		}
	}
}
