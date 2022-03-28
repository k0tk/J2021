package qui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFraim extends JFrame {
	
	private static final String SU_ID = "root";
	private static final String SU_PWD = "123";

	private JPanel contentPane;
	private JTextField userIDField;
	private JPasswordField passwordField;
	private static LoginFraim thisFrame;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFraim frame = new LoginFraim();
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
	public LoginFraim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton LoginButton = new JButton("login");
		
		LoginButton.setBounds(171, 227, 89, 23);
		contentPane.add(LoginButton);
		
		userIDField = new JTextField();
		userIDField.setBounds(171, 93, 89, 20);
		contentPane.add(userIDField);
		userIDField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 143, 89, 20);
		contentPane.add(passwordField);
		
		JLabel UserIdLabel = new JLabel("Email and login");
		UserIdLabel.setBounds(171, 68, 77, 14);
		contentPane.add(UserIdLabel);
		
		JLabel PwdLabel_1 = new JLabel("Pasword");
		PwdLabel_1.setBounds(171, 124, 46, 14);
		contentPane.add(PwdLabel_1);
		
		JLabel statusLabel = new JLabel("");
		statusLabel.setBounds(39, 22, 345, 14);
		contentPane.add(statusLabel);
		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String userId =	userIDField.getText();
			String userPwd =	passwordField.getText();
			if(userId.equalsIgnoreCase(SU_ID)) {
				if(userPwd.equals(SU_PWD)) {
					// show main page
					MainFraim main = new MainFraim();
					main.setTitle("Main APP PAGE");
					main.setVisible(true);
					//hide login page
					thisFrame.setVisible(false);
					
					System.out.println("Hello, "+ userId);
				}else {
					statusLabel.setText("Incorret password");
				}
				
			}else {
				statusLabel.setText("Incorret id");
			}
			}
		});
	}
}
