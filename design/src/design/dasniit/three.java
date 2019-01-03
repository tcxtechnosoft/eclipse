package design.dasniit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class three extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					three frame = new three();
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
	public three() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment = new JLabel("Secure Payment ");
		lblPayment.setForeground(Color.GREEN);
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPayment.setBounds(191, 13, 195, 31);
		contentPane.add(lblPayment);
		
		JLabel lblPaymentMethod = new JLabel("payment method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPaymentMethod.setBounds(12, 105, 189, 31);
		contentPane.add(lblPaymentMethod);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"card", "cash on delivery"}));
		comboBox.setBounds(268, 112, 135, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("< back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton)
					new Two().setVisible(true);
			}
		});
		btnNewButton.setBounds(82, 244, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("confirm");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton_1)
					new five().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(234, 244, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//	if(arg0.stopMethod()==btnNewButton_2) {
					//stopMethod();
				}
		/*	public void close()
			{
				windowEvent as=new windowEvent(this.windowEvent.WINDOW_CLOSING);
				Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(as);
			}
			*/
		});
		btnNewButton_2.setBounds(393, 244, 97, 25);
		contentPane.add(btnNewButton_2);
	}
}
