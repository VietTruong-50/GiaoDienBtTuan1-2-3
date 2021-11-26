package BtTuanGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tuan3.*;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class BtTuan3DL extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BtTuan3DL dialog = new BtTuan3DL();
			dialog.setTitle("Bai tap tuan 3");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BtTuan3DL() {
		setBounds(300, 100, 900, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnClose.addActionListener(this);
			btnClose.setBounds(749, 452, 100, 28);
			contentPanel.add(btnClose);
		}

		JLabel lblNewLabel = new JLabel(
				"<HTML>B\u00E0i 1: Cho m\u1ED9t d\u00E3y s\u1ED1 t\u1EF1 nhi\u00EAn,<br> vi\u1EBFt ch\u01B0\u01A1ng tr\u00ECnh s\u1EAFp x\u1EBFp d\u00E3y n\u00E0y theo th\u1EE9 t\u1EF1 gi\u1EA3m d\u1EA7n.<HTML>\r\n\r\n");
		lblNewLabel.setBounds(39, 52, 363, 42);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(" {6,3,9,6,1}");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(338, 111, 81, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(
				"<HTML>B\u00E0i 2: Cho d\u00E3y s\u1ED1 t\u1EF1 nhi\u00EAn, <br>in ra m\u00E0n h\u00ECnh t\u1EA5t c\u1EA3 c\u00E1c s\u1ED1 nguy\u00EAn t\u1ED1 c\u1EE7a d\u00E3y n\u00E0y.<HTML>");
		lblNewLabel_2.setBounds(39, 139, 363, 36);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(
				"<HTML>B\u00E0i 3: Cho m\u1ED9t d\u00E3y c\u00E1c s\u1ED1 t\u1EF1 nhi\u00EAn, t\u00ECm v\u00E0 in ra 1 gi\u00E1 tr\u1ECB min <br>c\u1EE7a d\u00E3y n\u00E0y v\u00E0 t\u1EA5t c\u1EA3 c\u00E1c ch\u1EC9 s\u1ED1 \u1EE9ng v\u1EDBi gi\u00E1 tr\u1ECB min n\u00E0y.<HTML>");
		lblNewLabel_3.setBounds(39, 230, 335, 42);
		contentPanel.add(lblNewLabel_3);

		JTextArea bai1Ta = new JTextArea();
		bai1Ta.setEditable(false);
		bai1Ta.setBounds(39, 106, 290, 22);
		contentPanel.add(bai1Ta);

		JTextArea bai2Ta = new JTextArea();
		bai2Ta.setEditable(false);
		bai2Ta.setBounds(39, 186, 144, 22);
		contentPanel.add(bai2Ta);

		JTextArea bai3Ta = new JTextArea();
		bai3Ta.setEditable(false);
		bai3Ta.setBounds(39, 283, 144, 22);
		contentPanel.add(bai3Ta);

		JTextArea bai4Ta = new JTextArea();
		bai4Ta.setEditable(false);
		bai4Ta.setBounds(39, 378, 144, 22);
		contentPanel.add(bai4Ta);
		
		JTextArea bai7Ta = new JTextArea();
		bai7Ta.setEditable(false);
		bai7Ta.setBounds(442, 283, 60, 22);
		contentPanel.add(bai7Ta);

		JTextArea bai8Ta = new JTextArea();
		bai8Ta.setEditable(false);
		bai8Ta.setBounds(442, 378, 202, 22);
		contentPanel.add(bai8Ta);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S\u1ED1",
				TitledBorder.RIGHT, TitledBorder.BELOW_BOTTOM, null, new Color(0, 0, 0)));
		panel.setBounds(665, 94, 81, 50);
		contentPanel.add(panel);
		panel.setLayout(null);

		JTextArea bai5Ta = new JTextArea();
		bai5Ta.setEditable(false);
		bai5Ta.setBounds(10, 11, 61, 22);
		panel.add(bai5Ta);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(442, 197, 244, 22);
		contentPanel.add(scrollPane);
		
		JTextArea bai6Ta = new JTextArea();
		bai6Ta.setEditable(false);
		scrollPane.setViewportView(bai6Ta);

		JButton btnNewButton = new JButton("Xem k\u1EBFt qu\u1EA3\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai1Ta.setText(Arrays.toString(BaiTap1.kqBai1()));
				bai2Ta.setText(Arrays.toString(BaiTap2.kqBai2()));
				bai3Ta.setText(Integer.toString(BaiTap3.kqBai3()));
				bai4Ta.setText(Integer.toString(BaiTap4.kqBai4()));
				bai6Ta.setText(BaiTap6.kqBai6());
				bai7Ta.setText(Integer.toString(BaiTap7.kqBai7()));
				bai8Ta.setText(Arrays.toString(BaiTap8.kqBai8()));
			}
		});
		btnNewButton.setBounds(261, 455, 124, 23);
		contentPanel.add(btnNewButton);

		JLabel lblNewLabel_3_1 = new JLabel(
				"<HTML>B\u00E0i 4: Cho m\u1ED9t d\u00E3y c\u00E1c s\u1ED1 t\u1EF1 nhi\u00EAn, t\u00ECm v\u00E0 in ra 1 gi\u00E1 tr\u1ECB max<br> c\u1EE7a d\u00E3y n\u00E0y v\u00E0 t\u1EA5t c\u1EA3 c\u00E1c ch\u1EC9 s\u1ED1 \u1EE9ng v\u1EDBi gi\u00E1 tr\u1ECB max n\u00E0y :<HTML>");
		lblNewLabel_3_1.setBounds(39, 316, 356, 53);
		contentPanel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_4 = new JLabel(
				"<HTML>B\u00E0i 5:  Cho m\u1ED9t d\u00E3y s\u1ED1 t\u1EF1 nhi\u00EAn, h\u00E3y \u0111\u1EBFm xem trong d\u00E3y s\u1ED1 tr\u00EAn<br> c\u00F3 bao nhi\u00EAu s\u1ED1 nguy\u00EAn t\u1ED1, c\u00F3 bao nhi\u00EAu h\u1EE3p s\u1ED1 :<HTML>");
		lblNewLabel_4.setBounds(442, 54, 356, 38);
		contentPanel.add(lblNewLabel_4);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("H\u1EE3p s\u1ED1\r\n");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai5Ta.setText(Integer.toString(BaiTap5.kqBai5(1)));
			}
		});
		rdbtnNewRadioButton.setBounds(471, 107, 81, 23);
		contentPanel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("S\u1ED1 nguy\u00EAn t\u1ED1\r\n");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai5Ta.setText(Integer.toString(BaiTap5.kqBai5(0)));
			}
		});
		rdbtnNewRadioButton_1.setBounds(554, 107, 105, 23);
		contentPanel.add(rdbtnNewRadioButton_1);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("<HTML>B\u00E0i 6: Cho m\u1ED9t d\u00E3y s\u1ED1 t\u1EF1 nhi\u00EAn, h\u00E3y in ra t\u1EA5t c\u1EA3 c\u00E1c s\u1ED1 h\u1EA1ng c\u1EE7a d\u00E3y tr\u00EAn <br>th\u1ECFa m\u00E3n: s\u1ED1 n\u00E0y l\u00E0 \u01B0\u1EDBc s\u1ED1 th\u1EF1c s\u1EF1 c\u1EE7a 1 s\u1ED1 h\u1EA1ng kh\u00E1c trong d\u00E3y tr\u00EAn.<HTML>\r\n");
		lblNewLabel_5.setBounds(442, 143, 407, 50);
		contentPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("<HTML>B\u00E0i 7: Cho m\u1ED9t d\u00E3y s\u1ED1 t\u1EF1 nhi\u00EAn, h\u00E3y t\u00ECm 1 s\u1ED1 t\u1EF1 nhi\u00EAn nh\u1ECF nh\u1EA5t c<br> kh\u00F4ng b\u1EB1ng b\u1EA5t c\u1EE9 s\u1ED1 n\u00E0o trong d\u00E3y tr\u00EAn.<HTML>");
		lblNewLabel_6.setBounds(442, 230, 356, 42);
		contentPanel.add(lblNewLabel_6);
		

		
		JLabel lblNewLabel_7 = new JLabel("{ 2, 5, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0}");
		lblNewLabel_7.setBounds(527, 288, 219, 14);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("<HTML>B\u00E0i 8: Cho m\u1ED9t d\u00E3y s\u1ED1 nguy\u00EAn b\u1EA5t k\u1EF3, h\u00E3y x\u00F3a \u0111i trong d\u00E3y n\u00E0y<br> c\u00E1c s\u1ED1 h\u1EA1ng =0 v\u00E0 in ra m\u00E0n h\u00ECnh c\u00E1c s\u1ED1 c\u00F2n l\u1EA1i.<HTML>");
		lblNewLabel_8.setBounds(442, 327, 432, 42);
		contentPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("{ 5, 2, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0 }");
		lblNewLabel_9.setBounds(654, 383, 220, 14);
		contentPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("{ 5, 2, 8, 3, 9 }");
		lblNewLabel_10.setBounds(205, 283, 124, 14);
		contentPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("{ 5, 2, 8, 3, 9 }");
		lblNewLabel_11.setBounds(205, 383, 105, 14);
		contentPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("{ 5, 2, 8, 3, 9 }");
		lblNewLabel_12.setBounds(205, 191, 105, 14);
		contentPanel.add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("Ph\u1EA7n 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtT3DLsub phan2 = new BtT3DLsub();
				phan2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(395, 455, 107, 23);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_13 = new JLabel(" { 5, 2, 8, 3, 9, 12, 17, 22, 95, 11 }");
		lblNewLabel_13.setBounds(696, 203, 178, 14);
		contentPanel.add(lblNewLabel_13);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
		GiaoDienBtTuan trangChu = new GiaoDienBtTuan();
		trangChu.setVisible(true);
	}
}
