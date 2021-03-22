
//importing required libraries;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class reg_frame extends JFrame {

//	Declaring Variables

	private JPanel contentPane;
	private JTextField Rtext_stdName;
	private JTextField Rtext_ID;
	private JPasswordField Rtext_pwd;
	private JPasswordField Rtext_rePwd;
	private JTextField Rtxt_contact;
	private JLabel Rlbl_Form;
	private JLabel Rlbl_stdname;
	private JLabel Rlbl_ID;
	private JLabel Rlbl_pwd;
	private JLabel Rlbl_contact;
	private JLabel Rlbl_address;
	private JButton Rbtn_signUp;
	private JLabel Rlbl_gend;
	private JLabel Rinfo_Img;
	private JLabel already_signup;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private ButtonGroup RbuttonGroup;
	private JRadioButton radiobtn_male;
	private JRadioButton radiobtn_female;
	private JRadioButton radiobtn_other;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg_frame frame = new reg_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public reg_frame() {
		setVisible(true);
		setTitle("Register");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(530, 60, 459, 710);
		
//		Labels and required components installation

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 106, 145));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Rlbl_Form = new JLabel("Registration Form");
		Rlbl_Form.setForeground(new Color(255, 140, 0));
		Rlbl_Form.setFont(new Font("Yu Gothic Medium", Font.BOLD, 26));
		Rlbl_Form.setBounds(113, 3, 275, 44);
		contentPane.add(Rlbl_Form);

		Rlbl_stdname = new JLabel("Student Name");
		Rlbl_stdname.setForeground(new Color(255, 165, 0));
		Rlbl_stdname.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_stdname.setBounds(29, 64, 153, 25);
		contentPane.add(Rlbl_stdname);

		Rtext_stdName = new JTextField(15);
		Rtext_stdName.setBackground(new Color(255, 235, 205));
		Rtext_stdName.setFont(new Font("Tahoma", Font.BOLD, 16));
		Rtext_stdName.setBorder(null);
		Rtext_stdName.setBounds(29, 99, 213, 34);
		contentPane.add(Rtext_stdName);
		Rtext_stdName.setColumns(10);
		Rtext_stdName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// for making textfield which only accepts string values

				char c = e.getKeyChar();
				if ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {

					e.consume();
				}
			}
		});

		Rlbl_ID = new JLabel("Student ID");
		Rlbl_ID.setForeground(new Color(255, 165, 0));
		Rlbl_ID.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_ID.setBounds(29, 160, 96, 25);
		contentPane.add(Rlbl_ID);

		Rtext_ID = new JTextField(5);
		Rtext_ID.setBackground(new Color(255, 235, 205));
		Rtext_ID.setFont(new Font("Tahoma", Font.BOLD, 16));
		Rtext_ID.setBorder(null);
		Rtext_ID.setBounds(29, 195, 213, 34);
		contentPane.add(Rtext_ID);
		Rtext_ID.setColumns(10);

		Rlbl_pwd = new JLabel("Password");
		Rlbl_pwd.setForeground(new Color(255, 165, 0));
		Rlbl_pwd.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_pwd.setBounds(29, 247, 153, 34);
		contentPane.add(Rlbl_pwd);

		Rtext_pwd = new JPasswordField(5);
		Rtext_pwd.setBackground(new Color(255, 235, 205));
		Rtext_pwd.setFont(new Font("Tahoma", Font.BOLD, 16));
		Rtext_pwd.setBorder(null);
		Rtext_pwd.setBounds(29, 290, 213, 34);
		contentPane.add(Rtext_pwd);
		Rtext_pwd.setColumns(10);

		Rlbl_contact = new JLabel("Re-Password");

		Rlbl_contact.setForeground(new Color(255, 165, 0));
		Rlbl_contact.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_contact.setBounds(29, 341, 116, 34);
		contentPane.add(Rlbl_contact);

		Rtext_rePwd = new JPasswordField(10);

		Rtext_rePwd.setBackground(new Color(255, 235, 205));
		Rtext_rePwd.setFont(new Font("Tahoma", Font.BOLD, 16));
		Rtext_rePwd.setBorder(null);
		Rtext_rePwd.setBounds(29, 374, 213, 34);
		contentPane.add(Rtext_rePwd);
		Rtext_rePwd.setColumns(10);

		Rlbl_address = new JLabel("Contact No.");

		Rlbl_address.setForeground(new Color(255, 165, 0));
		Rlbl_address.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_address.setBounds(29, 432, 116, 25);
		contentPane.add(Rlbl_address);

		Rtxt_contact = new JTextField(25);
		Rtxt_contact.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// for making textfield which only accepts string values

				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {

					e.consume();
				}
			}
		});
		Rtxt_contact.setBackground(new Color(255, 235, 205));
		Rtxt_contact.setFont(new Font("Tahoma", Font.BOLD, 16));
		Rtxt_contact.setBorder(null);
		Rtxt_contact.setBounds(29, 467, 213, 34);
		contentPane.add(Rtxt_contact);
		Rtxt_contact.setColumns(10);

		RbuttonGroup = new ButtonGroup();

		radiobtn_male = new JRadioButton("Male");
		radiobtn_male.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		radiobtn_male.setBackground(new Color(0, 106, 145));
		radiobtn_male.setBounds(29, 557, 66, 21);
		contentPane.add(radiobtn_male);

		radiobtn_female = new JRadioButton("Female");
		radiobtn_female.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		radiobtn_female.setBackground(new Color(0, 106, 145));
		radiobtn_female.setBounds(105, 557, 87, 21);
		contentPane.add(radiobtn_female);

		radiobtn_other = new JRadioButton("Others");
		radiobtn_other.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		radiobtn_other.setBackground(new Color(0, 106, 145));
		radiobtn_other.setBounds(211, 557, 87, 21);
		contentPane.add(radiobtn_other);

		RbuttonGroup.add(radiobtn_male);
		RbuttonGroup.add(radiobtn_female);
		RbuttonGroup.add(radiobtn_other);

	//		Register Button with its MouseListener 

		Rbtn_signUp = new JButton("Register");
		Rbtn_signUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				Rbtn_signUp.setForeground(new Color(0, 0, 0));
				Rbtn_signUp.setBackground(new Color(245, 245, 245));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Rbtn_signUp.setBackground(new Color(207, 58, 26));
				Rbtn_signUp.setForeground(new Color(204, 231, 232));
			}

		});
		
		//		Register Button with its Action Listener 

		Rbtn_signUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Rbtn_signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String stnm = Rtext_stdName.getText();
				String stID = Rtext_ID.getText();
				String pwd = String.valueOf(Rtext_pwd.getPassword());
				String repwd = String.valueOf(Rtext_rePwd.getPassword());
				String cntct = Rtxt_contact.getText();
				
				//some cases that makes dynamic registration

				if (stnm.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Student name is mandatory");
					Rtext_stdName.setText("");

				}

				

				else if (stID.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Student ID is mandatory!");

				}

				else if (pwd.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Please enter secure password");

					Rtext_pwd.setText("");

				}

				else if (repwd.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter password!");
					Rtext_rePwd.setText("");
				}

				

				else if (!pwd.contentEquals(repwd)) {

					JOptionPane.showMessageDialog(new JFrame(), "Please enter same password!", "Error!!",
							JOptionPane.ERROR_MESSAGE);

					Rtext_pwd.setText("");
					Rtext_rePwd.setText("");

				}
				
				else if (cntct.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Contact is mandatory!");

					Rtxt_contact.setText("");
				}
				
				else if (RbuttonGroup.isSelected(null)) {
					JOptionPane.showMessageDialog(null, "please select the gender");

				}

				else {
					JOptionPane.showMessageDialog(null, "Registration Succesful :)");
					contentPane.setVisible(false);
					dispose();
					Login.main(null);

				}
				;

			}
		});
		Rbtn_signUp.setFont(new Font("Tahoma", Font.BOLD, 14));
		Rbtn_signUp.setBounds(29, 596, 222, 34);
		Rbtn_signUp.setBackground(new Color(207, 58, 26));
		Rbtn_signUp.setForeground(new Color(204, 231, 232));
		Rbtn_signUp.setFocusPainted(false);
		Rbtn_signUp.setBorderPainted(false);
		contentPane.add(Rbtn_signUp);

		already_signup = new JLabel("Already have an account?");
		already_signup.addMouseListener(new MouseAdapter() {
			@Override
			
			//		Register Button with its MouseListener 
			public void mouseEntered(MouseEvent e) {
				already_signup.setForeground(new Color(255, 140, 0));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				already_signup.setForeground(new Color(204, 231, 232));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				contentPane.setVisible(false);
				dispose();
				Login.main(null);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				already_signup.setForeground(Color.GRAY);

			}

		});

		already_signup.setForeground(new Color(204, 231, 232));
		already_signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		already_signup.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		already_signup.setBounds(29, 632, 230, 34);
		contentPane.add(already_signup);

		Rlbl_gend = new JLabel("Gender");
		Rlbl_gend.setForeground(new Color(255, 165, 0));
		Rlbl_gend.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		Rlbl_gend.setBounds(29, 526, 66, 25);
		contentPane.add(Rlbl_gend);
		
//		Background-image

		Rinfo_Img = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ReflectedGuitar.jpg")).getImage();
		Rinfo_Img.setIcon(new ImageIcon(img));
		Rinfo_Img.setBounds(259, 86, 169, 531);
		contentPane.add(Rinfo_Img);
		
		//some separator to decorate GUI or separating the components in GUI

		separator = new JSeparator();
		separator.setBounds(105, 39, 290, 2);
		contentPane.add(separator);

		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(216, 191, 216));
		separator_1.setBounds(28, 143, 230, 2);
		contentPane.add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBounds(28, 239, 230, 2);
		contentPane.add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setBounds(28, 334, 230, 2);
		contentPane.add(separator_3);

		separator_4 = new JSeparator();
		separator_4.setBounds(28, 418, 230, 2);
		contentPane.add(separator_4);

		separator_5 = new JSeparator();
		separator_5.setBounds(28, 509, 230, 2);
		contentPane.add(separator_5);

		separator_6 = new JSeparator();
		separator_6.setBounds(29, 584, 230, 2);
		contentPane.add(separator_6);

	}
}
