package qui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainFraim extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MainFraim frame = new MainFraim();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MainFraim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 137, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Number2Label = new JLabel("numb 2");
		Number2Label.setBounds(153, 115, 46, 14);
		contentPane.add(Number2Label);
		
		JLabel Number1Label_1 = new JLabel("numb 1");
		Number1Label_1.setBounds(153, 59, 46, 14);
		contentPane.add(Number1Label_1);
		
		JButton calculeteButton = new JButton("Calculete");
		calculeteButton.setBounds(150, 196, 89, 23);
		contentPane.add(calculeteButton);
	}

}
