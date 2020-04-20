package AR.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JPanel {
	private JPanel loginPage;
	private JTextField txtLoginID;
	private JLabel lblPasswor;
	private JTextField txtPassword;
	private JLabel lblAutoregSystem;
	private JButton btnLogin;
	 
	/**
	 * Create the panel.
	 */
	public LoginPage() {
		pageSetup() ;
	}
	private void pageSetup() {
		 
		 
		loginPage = new JPanel();
		loginPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		 

		JLabel lblLoginId = new JLabel("Login ID:");
		lblLoginId.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtLoginID = new JTextField();
		txtLoginID.setForeground(Color.LIGHT_GRAY);
		txtLoginID.setText(" Enter your id");
		txtLoginID.setColumns(10);

		lblPasswor = new JLabel("Password:");
		lblPasswor.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtPassword = new JTextField();
		txtPassword.setText(" Enter your password");
		txtPassword.setForeground(Color.LIGHT_GRAY);
		txtPassword.setColumns(10);

		lblAutoregSystem = new JLabel("AutoReg System");
		lblAutoregSystem.setFont(new Font("Tahoma", Font.PLAIN, 74));

		btnLogin = new JButton("Login");

		GroupLayout gl_loginPage = new GroupLayout(loginPage);
		gl_loginPage.setHorizontalGroup(gl_loginPage.createParallelGroup(Alignment.TRAILING).addGroup(gl_loginPage
				.createSequentialGroup()
				.addGroup(gl_loginPage.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPage.createSequentialGroup().addGap(159).addComponent(lblAutoregSystem))
						.addGroup(gl_loginPage.createSequentialGroup().addGap(205).addGroup(gl_loginPage
								.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_loginPage.createSequentialGroup()
										.addGroup(gl_loginPage.createParallelGroup(Alignment.LEADING)
												.addComponent(lblLoginId, Alignment.TRAILING)
												.addComponent(lblPasswor, Alignment.TRAILING))
										.addGroup(gl_loginPage.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_loginPage.createSequentialGroup().addGap(5).addComponent(
														txtLoginID, GroupLayout.PREFERRED_SIZE, 348,
														GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_loginPage.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 348,
																GroupLayout.PREFERRED_SIZE)))))))
				.addContainerGap(150, Short.MAX_VALUE)));
		gl_loginPage.setVerticalGroup(gl_loginPage.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_loginPage.createSequentialGroup().addGap(52).addComponent(lblAutoregSystem).addGap(52)
						.addGroup(gl_loginPage.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLoginId, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_loginPage.createSequentialGroup().addGap(15).addComponent(txtLoginID,
										GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_loginPage.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPasswor, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(127, Short.MAX_VALUE)));
		loginPage.setLayout(gl_loginPage);
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "ID:  " + txtLoginID.getText() + "\nPw:  " + txtPassword.getText());
			 
				new HomePage().setVisible(true);
			}
		});
	}
}
