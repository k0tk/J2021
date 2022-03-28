package qui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Contact;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactsManagerApp extends JFrame {

    
    private static Contact contacts[] = new Contact[100];
    
    static {
        
        contacts[0] = new Contact(1, "Alex", "Ivanov", "+37515124");
        contacts[1] = new Contact(23, "Mike", "Tyson", "+37515155");
        contacts[2] = new Contact(55, "Bob", "Dylan", "+3751512346");
        contacts[3] = new Contact(2, "Misha", "Ivanov", "+375151245");
        contacts[4] = new Contact(235, "John", "Johnson", "+375234676");
        contacts[5] = new Contact(122, "Max", "Maximov", "+375154757");
    }
    
    private JPanel contentPane;
    private JTextField idTextField;
    private JTextField nameTextField;
    private JTextField lastNameTextField;
    private JTextField phoneTextField;
    
    private static int currentPos; // index

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        ContactsManagerApp frame = new ContactsManagerApp();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public ContactsManagerApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 519, 327);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton prevButton = new JButton("<");
        
        prevButton.setBounds(53, 247, 46, 25);
        contentPane.add(prevButton);
        
        JButton nextButton = new JButton(">");
        nextButton.setBounds(111, 247, 46, 25);
        contentPane.add(nextButton);
        
        JButton updateButton = new JButton("UPDATE");
        updateButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        updateButton.setBounds(169, 247, 85, 25);
        contentPane.add(updateButton);
        
        JButton removeButton = new JButton("DELETE");
        removeButton.setBounds(266, 247, 97, 25);
        contentPane.add(removeButton);
        
        JButton createButton = new JButton("ADD NEW");
        createButton.setBounds(375, 247, 97, 25);
        contentPane.add(createButton);
        
        JLabel lblId = new JLabel("ID");
        lblId.setBounds(53, 39, 56, 16);
        contentPane.add(lblId);
        
        idTextField = new JTextField();
        idTextField.setBounds(141, 39, 75, 22);
        contentPane.add(idTextField);
        idTextField.setColumns(10);
        
        JLabel lblName = new JLabel("NAME");
        lblName.setBounds(53, 71, 56, 16);
        contentPane.add(lblName);
        
        nameTextField = new JTextField();
        nameTextField.setColumns(10);
        nameTextField.setBounds(141, 71, 123, 22);
        contentPane.add(nameTextField);
        
        JLabel lblLastName = new JLabel("LAST NAME");
        lblLastName.setBounds(53, 108, 85, 16);
        contentPane.add(lblLastName);
        
        lastNameTextField = new JTextField();
        lastNameTextField.setColumns(10);
        lastNameTextField.setBounds(141, 108, 123, 22);
        contentPane.add(lastNameTextField);
        
        JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
        lblPhoneNumber.setBounds(53, 145, 85, 16);
        contentPane.add(lblPhoneNumber);
        
        phoneTextField = new JTextField();
        phoneTextField.setColumns(10);
        phoneTextField.setBounds(141, 145, 123, 22);
        contentPane.add(phoneTextField);
        
        //load first contact
        loadContact();
        

       //disabele previos 
            prevButton.setEnabled(false);
    
        // actions
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentPos == 0 && contacts.length > 0) 
                    prevButton.setEnabled(true);
                currentPos++; // move to the next contact
                if(!loadContact())
                    nextButton.setEnabled(false);
            }
        });
        
        
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextButton.setEnabled(true);
                if(currentPos > 0)
                    currentPos--;
                if(currentPos == 0 && contacts.length > 0)
                    prevButton.setEnabled(false);
                loadContact();
            }
        });
        updateButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Contact updatedContact = new Contact();
        		updatedContact.setId(Integer.parseInt(idTextField.getText()));
        		
				updatedContact.setName(nameTextField.getText());
				updatedContact.setLastName(lastNameTextField.getText());
				updatedContact.setPhone(phoneTextField.getText());
        	}
        });
    }
    
    private boolean loadContact() {
        Contact contact = contacts[currentPos];
        if(contact != null) {
            idTextField.setText(contact.getId() + "");
            nameTextField.setText(contact.getName());
            lastNameTextField.setText(contact.getLastName());
            phoneTextField.setText(contact.getPhone());
            return true;
        } else {
            return false;
        }
      
    }
}