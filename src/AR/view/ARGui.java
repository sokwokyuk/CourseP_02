package AR.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.CardLayout;

public class ARGui extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ARGui MainFrame = new ARGui();
					MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ARGui() {
		guiSetup();
		eventCreate();

	}

	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	private void guiSetup() {
		setTitle("AutoReg GUI");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ARGui.class.getResource("/AR/resourses/community_image_1426844184.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 563);
		getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		LoginPage log = new LoginPage();
		
		//getContentPane().add(log, "login");
		
//		JPanel panel_1 = new JPanel();
//		getContentPane().add(panel_1, "name_500208833879838");
	}

	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	private void eventCreate() {

	}
}
