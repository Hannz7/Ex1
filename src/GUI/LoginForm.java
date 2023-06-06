package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(215, 30, 129, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(82, 117, 88, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(82, 217, 88, 34);
		contentPane.add(lblNewLabel_2);
		
		textName = new JTextField();
		textName.setBounds(250, 132, 115, 19);
		contentPane.add(textName);
		textName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		passwordField.setBounds(250, 227, 115, 19);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
		        String pass = passwordField.getText();
		        if(name.equals("Hannz")&& pass.equals("123")){
		          JOptionPane.showMessageDialog(null, "Log in Success!");
		           Calculator Cal = new Calculator();
		                      Cal.setVisible(true);
		                      dispose(); 
		        }
		        else if(name.equals("Hannz")) {
		          JOptionPane.showMessageDialog(null, "Incorrect Password");
		        }
		        else if(pass.equals("123")) {
		          JOptionPane.showMessageDialog(null, "Incorrect UserName");
		        }
		        else if(name.equals("")&& pass.equals("")) {
		          JOptionPane.showMessageDialog(null, "Please fill all the required data!!");
		        }
		        else if(name.equals("")) {
		          JOptionPane.showMessageDialog(null, "Please fill Username!!");
		        }
		        else if(pass.equals("")) {
		          JOptionPane.showMessageDialog(null, "Please fill Password!!");
		        }
		        else {
		          JOptionPane.showMessageDialog(null, "Username and Password are not correct");
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(110, 298, 88, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(264, 298, 88, 27);
		contentPane.add(btnNewButton_1);
	}
}
