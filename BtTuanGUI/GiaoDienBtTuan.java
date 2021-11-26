package BtTuanGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiaoDienBtTuan extends JFrame{

	private JPanel contentPane;
	static GiaoDienBtTuan trangChu = new GiaoDienBtTuan();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trangChu.setVisible(true);
					trangChu.setTitle("Trang chu");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GiaoDienBtTuan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 625, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("BAI TAP CAC TUAN\r\n");
		title.setFont(new Font("Tahoma", Font.PLAIN, 22));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(146, 40, 309, 30);
		contentPane.add(title);
		

		JButton btnT1 = new JButton("TUAN 1");
		btnT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BtTuan1DL btTuan1 = new BtTuan1DL();
				btTuan1.setVisible(true);
			}
		});
		btnT1.setBounds(75, 121, 153, 40);
		contentPane.add(btnT1);
		
		JButton btnT2 = new JButton("TUAN 2");
		btnT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BtTuan2DL btTuan2 = new BtTuan2DL();
				btTuan2.setVisible(true);
			}
		});
		btnT2.setBounds(378, 121, 153, 40);
		contentPane.add(btnT2);
		
		JButton btnT3 = new JButton("TUAN 3");
		btnT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtTuan3DL btTuan3 = new BtTuan3DL();
				btTuan3.setVisible(true);
			}
		});
		btnT3.setBounds(227, 199, 153, 40);
		contentPane.add(btnT3);
	}

}
