import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class warden_page {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					warden_page window = new warden_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public warden_page() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 731, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(10, 10, 697, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Warden Form");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(10, 70, 624, 436);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(28, 26, 89, 24);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField.setBounds(334, 26, 211, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(28, 69, 116, 24);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(334, 69, 211, 28);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Campus");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(28, 114, 130, 24);
		panel_1.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Campus", "Bhubaneswar", "Paralakhemundi", "Balangir", "Rayagada"}));
		comboBox.setBounds(334, 113, 211, 28);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Enter Contact Number");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(28, 165, 211, 24);
		panel_1.add(lblNewLabel_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(334, 165, 211, 28);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Enter Hostel Number");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2_1.setBounds(28, 228, 211, 24);
		panel_1.add(lblNewLabel_1_1_2_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Hostel Number", "Boys 1", "Boys 2", "Girls 1", "Girls 2"}));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1.setBounds(334, 227, 211, 28);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter Gender");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(28, 287, 130, 24);
		panel_1.add(lblNewLabel_1_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		comboBox_1_1.setBounds(334, 286, 211, 28);
		panel_1.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter Email");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(28, 344, 116, 24);
		panel_1.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(334, 344, 211, 28);
		panel_1.add(textField_3);
		
		JButton btnNewButton = new JButton("Back To Login");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(161, 391, 139, 35);
		panel_1.add(btnNewButton);
	}
}
