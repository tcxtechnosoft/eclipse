package design.dasniit;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;

public class Two extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Two frame = new Two();
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
	public Two() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 410);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(Color.DARK_GRAY);
		lblFrom.setFont(new Font("Vani", Font.PLAIN, 23));
		lblFrom.setBounds(59, 37, 64, 33);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.DARK_GRAY);
		lblTo.setFont(new Font("Vani", Font.PLAIN, 23));
		lblTo.setBounds(59, 126, 75, 33);
		contentPane.add(lblTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ariyalur", "Nagapattinam", "Perambalur", "Pudukkottai", "Thanjavur", "Tiruchirappalli", "Karur", "Tiruvarur", "Chennai", "Cuddalore", "Kanchipuram", "Tiruvallur", "Tiruvannamalai", "Vellore", "Viluppuram", "Dharmapuri", "Krishnagiri", "Namakkal", "Salem", "Erode", "Tiruppur", "Coimbatore", "Nilgiri", "Madurai", "Theni", "Dindigul", "Sivagangai", "Virudunagar", "Ramanathapuram", "Tirunelveli", "Thoothukudi", "Kanyakumari", "Pudukkottai"}));
		comboBox.setBounds(350, 39, 118, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ariyalur", "Nagapattinam", "Perambalur", "Pudukkottai", "Thanjavur", "Tiruchirappalli", "Karur", "Tiruvarur", "Chennai", "Cuddalore", "Kanchipuram", "Tiruvallur", "Tiruvannamalai", "Vellore", "Viluppuram", "Dharmapuri", "Krishnagiri", "Namakkal", "Salem", "Erode", "Tiruppur", "Coimbatore", "Nilgiri", "Madurai", "Theni", "Dindigul", "Sivagangai", "Virudunagar", "Ramanathapuram", "Tirunelveli", "Thoothukudi", "Kanyakumari", "Pudukkottai"}));
		comboBox_1.setBounds(350, 128, 118, 22);
		contentPane.add(comboBox_1);
		
		JButton btnProceed = new JButton("> Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnProceed)
					new three().setVisible(true);
				
			}
		});
		btnProceed.setBounds(177, 237, 97, 25);
		contentPane.add(btnProceed);
		
		JButton btnCancel = new JButton("X Cancel");
		btnCancel.setBounds(342, 237, 97, 25);
		contentPane.add(btnCancel);
		
		JButton button = new JButton("< Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==button)
					new das().setVisible(true);
			}
		});
		button.setBounds(26, 237, 97, 25);
		contentPane.add(button);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
