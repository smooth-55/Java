import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
	
//	Declaring Variables

	private JFrame login_frame;
	private JLabel backimg;
	private JLabel lbl_credential;
	private JLabel lbl_stdID;
	private JTextField txt_stdName;
	private JLabel lbl_pwd;
	private JPasswordField text_stdID;
	private JButton btn_login;
	private JLabel btn_ClkToReg;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.login_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login_frame = new JFrame();
		login_frame.setTitle("Login");
		login_frame.setResizable(false);

//		login_frame.setBounds(170, 100, 728, 455); 
		login_frame.setBounds(170, 100, 714, 455); 
		login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login_frame.getContentPane().setLayout(null);
		backimg = new JLabel("");

//			Background-image
		Image img = new ImageIcon(this.getClass().getResource("/disk.png")).getImage();
		backimg.setIcon(new ImageIcon(img));
		backimg.setBounds(-14, -19, 879, 482);
		login_frame.getContentPane().add(backimg);
		
//		Labels and required components installation

		lbl_credential = new JLabel("Enter Your Credentials");
		lbl_credential.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_credential.setForeground(Color.CYAN);
		lbl_credential.setBounds(67, 10, 233, 51);
		backimg.add(lbl_credential);

		lbl_stdID = new JLabel("Student ID");
		lbl_stdID.setForeground(new Color(173, 216, 230));
		lbl_stdID.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_stdID.setBounds(45, 72, 175, 31);
		backimg.add(lbl_stdID);

		txt_stdName = new JTextField();
		txt_stdName.setBackground(new Color(255, 235, 205));
		txt_stdName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txt_stdName.setBounds(45, 110, 276, 37);
		backimg.add(txt_stdName);
		txt_stdName.setColumns(10);

		lbl_pwd = new JLabel("Password");
		lbl_pwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_pwd.setForeground(new Color(173, 216, 230));
		lbl_pwd.setBounds(45, 180, 175, 31);
		backimg.add(lbl_pwd);

		text_stdID = new JPasswordField();
		text_stdID.setBackground(new Color(255, 235, 205));
		text_stdID.setFont(new Font("Tahoma", Font.BOLD, 16));
		text_stdID.setBounds(45, 223, 276, 37);
		backimg.add(text_stdID);
		text_stdID.setColumns(10);
		
//		Login Button with its action listener

		btn_login = new JButton("Log In");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				// ***************************//

				btn_login.setForeground(new Color(0, 0, 0));
				btn_login.setBackground(new Color(245, 245, 245));

				// ***************************//
//				btn_login.setForeground(new Color(204, 231, 232));
//				btn_login.setBackground(new Color(230, 115, 0));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_login.setBackground(new Color(207, 58, 26));
				btn_login.setForeground(new Color(204, 231, 232));
			}

		});
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				To be logged in to the system , 
//				creating the cases for user beacause this app is not based on database

				String stdId = txt_stdName.getText();
				String pwd = String.valueOf(text_stdID.getPassword());

				if (stdId.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Student ID is mandatory!");
					txt_stdName.setText("");

				}

				else if (pwd.contentEquals("")) {
					JOptionPane.showMessageDialog(null, " Password is mandatory!");
					text_stdID.setText("");

				} else if (stdId.contentEquals("1918650") && (pwd.contentEquals("ashish"))) {

					JOptionPane.showMessageDialog(null, "Logged in as student");
					for_reg_std();

				}

				else if (stdId.contentEquals("1918605") && (pwd.contentEquals("supen"))) {

					JOptionPane.showMessageDialog(null, "Logged in as student");

					for_reg_std();

				}

				else {

					JOptionPane.showMessageDialog(new JFrame(), "Please enter valid student Id and password:(",
							"Failed to login to the system!", JOptionPane.ERROR_MESSAGE);

					txt_stdName.setText("");
					text_stdID.setText("");
				}
				;

				//// till here #login cases////

			}
		});
		backimg.add(btn_login);
		btn_login.setFocusPainted(false);
		btn_login.setBorderPainted(false);
		btn_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		;
		btn_login.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_login.setBounds(45, 290, 175, 37);
		btn_login.setBackground(new Color(207, 58, 26));
		btn_login.setForeground(new Color(204, 231, 232));

		separator = new JSeparator();
		separator.setBounds(45, 157, 324, 2);
		backimg.add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(45, 270, 324, 2);
		backimg.add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBounds(45, 50, 273, 2);
		backimg.add(separator_2);

//		Register Button (label) with its action listener
		
		btn_ClkToReg = new JLabel("Click here to Register");  
		backimg.add(btn_ClkToReg);
		btn_ClkToReg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_ClkToReg.setForeground(new Color(255, 140, 0));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_ClkToReg.setForeground(Color.WHITE);
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				login_frame.dispose();
				reg_frame frame2 = new reg_frame();
				frame2.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btn_ClkToReg.setForeground(Color.GRAY);

			}

		});
		btn_ClkToReg.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_ClkToReg.setForeground(Color.WHITE);
		btn_ClkToReg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ClkToReg.setBounds(45, 340, 175, 28);

	}
	 
//	method for disposing the entire login frame and opening the dashboard

	public void for_reg_std() {
		login_frame.dispose();
		dashboard newWindow = new dashboard();
		newWindow.setVisible(true);

	}
}
