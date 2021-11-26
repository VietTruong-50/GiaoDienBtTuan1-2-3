package BtTuanGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tuan1.*;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class BtTuan1DL extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	static BtTuan1DL dialog = new BtTuan1DL();
	JButton btnClose = new JButton("Close");
	private JTextArea bai1Tf;
	private JTextArea bai2Tf;
	private JTextArea bai3Tf;
	private JTextArea bai4Tf;
	private JTextArea bai5Tf;
	private JTextArea bai6Tf;
	private JTextArea bai7Tf;
	private JTextArea bai8Tf;
	private JTextArea bai9Tf;
	private JTextArea bai10Tf;
	private JTextArea bai11Tf;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		try {
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setTitle("Bai tap tuan 1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BtTuan1DL() {
		setBounds(300, 100, 900, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnClose.addActionListener(this);
			btnClose.setBounds(774, 452, 100, 28);
			contentPanel.add(btnClose);
		}

		JLabel lblNewLabel = new JLabel(
				"B\u00E0i 1: In ra m\u00E0n h\u00ECnh t\u1EA5t c\u1EA3 c\u00E1c h\u1EE3p s\u1ED1 nh\u1ECF h\u01A1n 100: ");
		lblNewLabel.setBounds(38, 25, 296, 14);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("B\u00E0i 2: In ra 20 s\u1ED1 nguy\u00EAn t\u1ED1 \u0111\u1EA7u ti\u00EAn: ");
		lblNewLabel_1.setBounds(38, 95, 241, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(
				"B\u00E0i 3: In ra m\u00E0n h\u00ECnh t\u1EA5t c\u1EA3 c\u00E1c s\u1ED1 nguy\u00EAn t\u1ED1 t\u1EEB 1000 \u0111\u1EBFn 2000:");
		lblNewLabel_2.setBounds(38, 164, 379, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(
				"B\u00E0i 4: In ra m\u00E0n h\u00ECnh c\u00E1c s\u1ED1 <100 v\u00E0 chia h\u1EBFt cho 3, 7:");
		lblNewLabel_3.setBounds(38, 234, 347, 14);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(
				"<HTML>B\u00E0i 5:  In ra m\u00E0n h\u00ECnh c\u00E1c s\u1ED1 n\u1EB1m gi\u1EEFa 1000 v\u00E0 2000 \u0111\u1ED3ng th\u1EDDi <br> chia h\u1EBFt cho 3, 5, 7: <HTML>");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(38, 294, 347, 36);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel(
				"B\u00E0i 6: In ra m\u00E0n h\u00ECnh 5 s\u1ED1 ho\u00E0n h\u1EA3o \u0111\u1EA7u ti\u00EAn:");
		lblNewLabel_5.setToolTipText("");
		lblNewLabel_5.setBounds(38, 374, 308, 14);
		contentPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel(
				"<HTML>B\u00E0i 7: Trong c\u00E1c s\u1ED1 t\u1EF1 nhi\u00EAn <=100 <br>h\u00E3y \u0111\u1EBFm xem c\u00F3 bao nhi\u00EAu s\u1ED1:<HTML>\r\n");
		lblNewLabel_6.setBounds(461, 11, 124, 59);
		contentPanel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel(
				"<HTML>B\u00E0i 8:  Cho s\u1ED1 t\u1EF1 nhi\u00EAn N b\u1EA5t k\u1EF3 (\u0111\u00E3 g\u00E1n tr\u01B0\u1EDBc \u0111\u00F3),<br> t\u00ECm v\u00E0 in ra \u01B0\u1EDBc s\u1ED1 nguy\u00EAn t\u1ED1 nh\u1ECF nh\u1EA5t c\u1EE7a N:</HTML>");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(461, 81, 308, 36);
		contentPanel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel(
				"<HTML>B\u00E0i 9: Cho s\u1ED1 t\u1EF1 nhi\u00EAn N>1 b\u1EA5t k\u1EF3 (\u0111\u00E3 g\u00E1n tr\u01B0\u1EDBc \u0111\u00F3). <br>In ra khai tri\u1EC3n th\u00E0nh t\u00EDch c\u00E1c s\u1ED1 nguy\u00EAn t\u1ED1 t\u00EDnh t\u1EEB nh\u1ECF \u0111\u1EBFn l\u1EDBn:</HTML>");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(461, 142, 347, 45);
		contentPanel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel(
				"<HTML>B\u00E0i 10: Cho tr\u01B0\u1EDBc s\u1ED1 t\u1EF1 nhi\u00EAn N b\u1EA5t k\u1EF3 (\u0111\u00E3 g\u00E1n tr\u01B0\u1EDBc \u0111\u00F3).  <br>In ra m\u00E0n h\u00ECnh t\u1EA5t c\u1EA3 c\u00E1c \u01B0\u1EDBc s\u1ED1 nguy\u00EAn t\u1ED1 kh\u00E1c nhau c\u1EE7a N: </HTML>");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setBounds(461, 208, 347, 45);
		contentPanel.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel(
				"<HTML>B\u00E0i 11: Vi\u1EBFt ch\u01B0\u01A1ng tr\u00ECnh tr\u00E1o \u0111\u1ED5i ng\u1EABu nhi\u00EAn v\u1ECB tr\u00ED m\u1ED9t d\u00E3y s\u1ED1 <br>cho tr\u01B0\u1EDBc:<HTML>");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setBounds(461, 294, 347, 32);
		contentPanel.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel(
				"<HTML>B\u00E0i 12: Vi\u1EBFt ch\u01B0\u01A1ng tr\u00ECnh nh\u1EADp chi\u1EC1u cao h t\u1EEB b\u00E0n ph\u00EDm, sau \u0111\u00F3 hi\u1EC3n th\u1ECB  <br>c\u00E1c tam gi\u00E1c h\u00ECnh sao c\u00F3 chi\u1EC1u cao h nh\u01B0 d\u01B0\u1EDBi \u0111\u00E2y.<br> (\u0110i\u1EC1u ki\u1EC7n c\u1EE7a h: 2<=h<=10) : </HTML>");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setBounds(461, 374, 160, 106);
		contentPanel.add(lblNewLabel_11);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 50, 347, 36);
		contentPanel.add(scrollPane);

		bai1Tf = new JTextArea();
		bai1Tf.setEditable(false);
		scrollPane.setViewportView(bai1Tf);
		bai1Tf.setColumns(10);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(38, 120, 347, 36);
		contentPanel.add(scrollPane_2);

		bai2Tf = new JTextArea();
		bai2Tf.setEditable(false);
		scrollPane_2.setViewportView(bai2Tf);
		bai2Tf.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 189, 347, 34);
		contentPanel.add(scrollPane_1);

		bai3Tf = new JTextArea();
		bai3Tf.setEditable(false);
		scrollPane_1.setViewportView(bai3Tf);
		bai3Tf.setColumns(10);

		bai4Tf = new JTextArea();
		bai4Tf.setEditable(false);
		bai4Tf.setBounds(38, 259, 347, 24);
		contentPanel.add(bai4Tf);
		bai4Tf.setColumns(10);

		bai5Tf = new JTextArea();
		bai5Tf.setEditable(false);
		bai5Tf.setBounds(38, 341, 347, 20);
		contentPanel.add(bai5Tf);
		bai5Tf.setColumns(10);

		bai6Tf = new JTextArea();
		bai6Tf.setEditable(false);
		bai6Tf.setBounds(38, 399, 347, 20);
		contentPanel.add(bai6Tf);
		bai6Tf.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S\u1ED1",
				TitledBorder.RIGHT, TitledBorder.BELOW_BOTTOM, null, new Color(2, 1, 99)));
		panel.setBounds(692, 36, 104, 50);
		contentPanel.add(panel);
		panel.setLayout(null);

		bai7Tf = new JTextArea();
		bai7Tf.setBounds(10, 11, 85, 17);
		panel.add(bai7Tf);
		bai7Tf.setFont(new Font("Monospaced", Font.PLAIN, 14));
		bai7Tf.setEditable(false);

		bai8Tf = new JTextArea();
		bai8Tf.setEditable(false);
		bai8Tf.setBounds(461, 120, 308, 20);
		contentPanel.add(bai8Tf);
		bai8Tf.setColumns(10);

		bai9Tf = new JTextArea();
		bai9Tf.setEditable(false);
		bai9Tf.setBounds(461, 189, 308, 20);
		contentPanel.add(bai9Tf);
		bai9Tf.setColumns(10);

		bai10Tf = new JTextArea();
		bai10Tf.setEditable(false);
		bai10Tf.setBounds(461, 259, 308, 20);
		contentPanel.add(bai10Tf);
		bai10Tf.setColumns(10);

		bai11Tf = new JTextArea();
		bai11Tf.setEditable(false);
		bai11Tf.setBounds(461, 337, 308, 20);
		contentPanel.add(bai11Tf);
		bai11Tf.setColumns(10);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(2, 2, 10, 1));
		spinner.setBounds(614, 456, 31, 20);
		contentPanel.add(spinner);

		JButton btnNewButton = new JButton("Xem k\u1EBFt qu\u1EA3\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai1Tf.setText(Arrays.toString(BaiTap1.kqBai1()));
				bai2Tf.setText(Arrays.toString(BaiTap2.kqBai2()));
				bai3Tf.setText(Arrays.toString(BaiTap3.kqBai3()));
				bai4Tf.setText(Arrays.toString(BaiTap4.kqBai4()));
				bai5Tf.setText(Arrays.toString(BaiTap5.kqBai5()));
				bai6Tf.setText(Arrays.toString(BaiTap6.kqBai6()));
				bai8Tf.setText(Integer.toString(BaiTap8.kqBai8()));
				bai9Tf.setText(Arrays.toString(BaiTap9.kqBai9()));
				bai10Tf.setText(Arrays.toString(BaiTap10.kqBai10()));
				bai11Tf.setText(Arrays.toString(BaiTap11.kqBai11()));
			}
		});
		btnNewButton.setBounds(261, 455, 124, 23);
		contentPanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Xem");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = (int) spinner.getValue();
				JOptionPane.showMessageDialog(BtTuan1DL.this, BaiTap12.kqBai12(x));
			}
		});
		btnNewButton_1.setBounds(674, 374, 63, 106);
		contentPanel.add(btnNewButton_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Chia h\u1EBFt cho 5");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai7Tf.setText(Integer.toString(BaiTap7.kqBai7a()));
			}
		});
		rdbtnNewRadioButton.setBounds(585, 8, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnChiaD = new JRadioButton("Chia 5 d\u01B0 1\r\n");
		rdbtnChiaD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai7Tf.setText(Integer.toString(BaiTap7.kqBai7b()));
			}
		});
		rdbtnChiaD.setBounds(585, 34, 109, 23);
		contentPanel.add(rdbtnChiaD);

		JRadioButton rdbtnChiaD_1 = new JRadioButton("Chia 5 d\u01B0 2\r\n");
		rdbtnChiaD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai7Tf.setText(Integer.toString(BaiTap7.kqBai7c()));
			}
		});
		rdbtnChiaD_1.setBounds(585, 60, 109, 23);
		contentPanel.add(rdbtnChiaD_1);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Chia 5 d\u01B0 3\r\n");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai7Tf.setText(Integer.toString(BaiTap7.kqBai7d()));
			}
		});
		rdbtnNewRadioButton_1.setBounds(699, 8, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_1);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnChiaD);
		group.add(rdbtnChiaD_1);

		JLabel lblNewLabel_12 = new JLabel("{2,5,9,1,0,8}");
		lblNewLabel_12.setBounds(645, 316, 124, 14);
		contentPanel.add(lblNewLabel_12);

		JTextArea txtrN = new JTextArea();
		txtrN.setEditable(false);
		txtrN.setText("N =12345");
		txtrN.setBounds(800, 259, 74, 22);
		contentPanel.add(txtrN);

		JTextArea txtrN_2 = new JTextArea();
		txtrN_2.setText("N =12");
		txtrN_2.setEditable(false);
		txtrN_2.setBounds(800, 189, 74, 22);
		contentPanel.add(txtrN_2);

		JTextArea txtrN_2_1 = new JTextArea();
		txtrN_2_1.setText("N =15");
		txtrN_2_1.setEditable(false);
		txtrN_2_1.setBounds(800, 121, 74, 22);
		contentPanel.add(txtrN_2_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();
		GiaoDienBtTuan trangChu = new GiaoDienBtTuan();
		trangChu.setVisible(true);
	}
}
