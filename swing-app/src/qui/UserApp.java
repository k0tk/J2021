package qui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserApp extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTextField;
	private JTextField userLastNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					UserApp frame = new UserApp();
					frame.setVisible(true);
				
				}
			
		
	

	/**
	 * Create the frame.
	 */
	public UserApp() {
		setTitle("My APP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton mainButton = new JButton("GO!");
		
		mainButton.setBounds(30, 187, 102, 52);
		contentPane.add(mainButton);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(30, 92, 138, 32);
		contentPane.add(userNameLabel);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(30, 121, 86, 20);
		contentPane.add(userNameTextField);
		userNameTextField.setColumns(10);
		
		JLabel usserLastNameLabel = new JLabel("Last name");
		usserLastNameLabel.setBounds(191, 101, 73, 14);
		contentPane.add(usserLastNameLabel);
		
		userLastNameField = new JTextField();
		userLastNameField.setBounds(178, 121, 86, 20);
		contentPane.add(userLastNameField);
		userLastNameField.setColumns(10);
		
		mainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String txt =userNameTextField.getText(); 
			System.out.print(txt);
			String vtv =userLastNameField.getText(); 
			System.out.print(" "+ vtv);
			
			}
		});
	}
}
