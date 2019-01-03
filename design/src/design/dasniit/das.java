package design.dasniit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class das extends JFrame {

//	private static final String windowEvent = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					das frame = new das();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("program successfully failed");
					e.printStackTrace();
				}
			}
		});
	}

	
	public void close()
	{
		WindowEvent as=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(as);
	}
	/**
	 * Create the frame.
	 */
	public das() {
		setBounds(100, 100, 659, 382);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblEmail.setBounds(209, 72, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPassword.setBounds(175, 130, 90, 21);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(357, 66, 222, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		textField_1.setBounds(357, 131, 222, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBusReservationSystem = new JLabel("Bus Reservation system");
		lblBusReservationSystem.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 20));
		lblBusReservationSystem.setBounds(168, 13, 269, 26);
		contentPane.add(lblBusReservationSystem);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setForeground(Color.BLUE);
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String e1=textField.getText();
				String p=textField_1.getText();
				String str="select * from das1 where email='"+e1+"' OR password='"+p+"'";
				Class.forName("org.h2.Driver");
				Connection c=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery(str);
				rs.next();
				String email=rs.getString(1);
				String pass=rs.getString(2);
				if(e1.equals(email)&&p.equals(pass))
				{
					JOptionPane.showMessageDialog(btnConfirm,"login jeiho");
					new Two().setVisible(true);
					close();
				}
				
				
				}
				catch (Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnConfirm.setBounds(239, 220, 97, 35);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(244, 236, 64, -5);
		contentPane.add(btnCancel);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel_1.setBounds(399, 220, 110, 35);
		contentPane.add(btnCancel_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
			String email= textField.getText();
			String password= textField_1.getText();
			String a= "insert into das1 values('"+email+"','"+password+"')";
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			Statement st=con.createStatement();
			st.executeUpdate(a);
			JOptionPane.showMessageDialog(btnNewButton,"ramya loosu");
			
				}
				catch(Exception r)
				{
					System.out.print(r);
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(118, 220, 89, 35);
		contentPane.add(btnNewButton);
	}
}
