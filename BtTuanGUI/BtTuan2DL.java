package BtTuanGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tuan2.*;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class BtTuan2DL extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	JTextArea bai1Tf = new JTextArea();
	JTextArea bai2Tf = new JTextArea();
	JTextArea bai3Tf = new JTextArea();
	JTextArea bai4Tf = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BtTuan2DL dialog = new BtTuan2DL();
			dialog.setTitle("Bai tap tuan 2");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BtTuan2DL() {
		setBounds(300, 100, 901, 364);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		contentPanel.add(btnClose);
		{
			btnClose.addActionListener(this);
			btnClose.setBounds(775, 286, 100, 28);
			contentPanel.add(btnClose);
		}
		
		JLabel lblNewLabel = new JLabel("B\u00E0i 1: Cho N b\u1EA5t k\u1EF3. T\u00EDnh t\u1ED5ng S=1+1/(1+2) + 1/(1+2+3) +\u2026+ 1/(1+2+3+..+N):");
		lblNewLabel.setBounds(30, 49, 440, 37);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B\u00E0i 2: Cho s\u1ED1 t\u1EF1 nhi\u00EAn N b\u1EA5t k\u1EF3, t\u00EDnh t\u1ED5ng S= 1+ 1/2! + 1/3! + \u2026 + 1/N! :");
		lblNewLabel_1.setBounds(30, 168, 440, 28);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nh\u1EADp s\u1ED1 n:");
		lblNewLabel_2.setBounds(30, 103, 77, 28);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<HTML>B\u00E0i 3: Cho s\u1ED1 t\u1EF1 nhi\u00EAn N b\u1EA5t k\u1EF3,<br> t\u00EDnh t\u1ED5ng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!):<HTML>");
		lblNewLabel_3.setBounds(466, 39, 409, 47);
		contentPanel.add(lblNewLabel_3);
		
		JSpinner bai1Sp = new JSpinner();
		bai1Sp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bai1Sp.setBounds(117, 97, 55, 37);
		contentPanel.add(bai1Sp);
		
		JButton bai1Btn = new JButton("KQ\r\n");
		bai1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) bai1Sp.getValue();
				bai1Tf.setText(Double.toString(BaiTap1.kqBai1(x)));
			}
		});
		bai1Btn.setFont(new Font("Tahoma", Font.BOLD, 8));
		bai1Btn.setBounds(182, 99, 46, 37);
		contentPanel.add(bai1Btn);
		

		bai1Tf.setEditable(false);
		bai1Tf.setBounds(238, 105, 186, 22);
		contentPanel.add(bai1Tf);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nh\u1EADp s\u1ED1 n:");
		lblNewLabel_2_1.setBounds(30, 223, 77, 28);
		contentPanel.add(lblNewLabel_2_1);
		
		JSpinner bai2Sp = new JSpinner();
		bai2Sp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bai2Sp.setBounds(117, 217, 55, 37);
		contentPanel.add(bai2Sp);
		
		JButton bai2Btn = new JButton("KQ\r\n");
		bai2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) bai2Sp.getValue();
				bai2Tf.setText(Double.toString(BaiTap2.kqBai2(x)));
			}
		});
		bai2Btn.setFont(new Font("Tahoma", Font.BOLD, 8));
		bai2Btn.setBounds(182, 219, 46, 37);
		contentPanel.add(bai2Btn);
		

		bai2Tf.setEditable(false);
		bai2Tf.setBounds(238, 225, 186, 22);
		contentPanel.add(bai2Tf);
		
		JLabel lblNewLabel_4 = new JLabel("B\u00E0i 4: D\u00E3y Fibonaxi 1, 2, 3, \u2026 F(k) = F(k-1) + F(k-2). T\u00EDnh s\u1ED1 Fibonaxi th\u1EE9 N:");
		lblNewLabel_4.setBounds(466, 164, 409, 37);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nh\u1EADp s\u1ED1 n:");
		lblNewLabel_2_2.setBounds(466, 223, 77, 28);
		contentPanel.add(lblNewLabel_2_2);
		
		JSpinner bai4Sp = new JSpinner();
		bai4Sp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bai4Sp.setBounds(553, 217, 55, 37);
		contentPanel.add(bai4Sp);
		
		JButton bai4Btn = new JButton("KQ\r\n");
		bai4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) bai4Sp.getValue();
				bai4Tf.setText(Arrays.toString(BaiTap4.kqBai4(x)));
			}
		});
		bai4Btn.setFont(new Font("Tahoma", Font.BOLD, 8));
		bai4Btn.setBounds(618, 217, 46, 37);
		contentPanel.add(bai4Btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(674, 217, 186, 34);
		contentPanel.add(scrollPane);
		scrollPane.setViewportView(bai4Tf);
		

		bai4Tf.setEditable(false);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Nh\u1EADp s\u1ED1 n:");
		lblNewLabel_2_2_1.setBounds(466, 103, 77, 28);
		contentPanel.add(lblNewLabel_2_2_1);
		
		JSpinner bai3Sp = new JSpinner();
		bai3Sp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bai3Sp.setBounds(553, 97, 55, 37);
		contentPanel.add(bai3Sp);
		
		JButton bai3Btn = new JButton("KQ\r\n");
		bai3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) bai3Sp.getValue();
				bai3Tf.setText(Double.toString(BaiTap3.kqBai3(x)));
			}
		});
		bai3Btn.setFont(new Font("Tahoma", Font.BOLD, 8));
		bai3Btn.setBounds(618, 100, 46, 37);
		contentPanel.add(bai3Btn);
		
		
		bai3Tf.setEditable(false);
		bai3Tf.setBounds(674, 105, 186, 22);
		contentPanel.add(bai3Tf);
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
		GiaoDienBtTuan trangChu = new GiaoDienBtTuan();
		trangChu.setVisible(true);
	}
}
