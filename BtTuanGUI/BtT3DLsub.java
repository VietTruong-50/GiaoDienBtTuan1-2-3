package BtTuanGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.tuan3.*;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;

public class BtT3DLsub extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BtT3DLsub dialog = new BtT3DLsub();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BtT3DLsub() {
		setBounds(100, 100, 842, 431);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(
					"<HTML>B\u00E0i 9: Cho m\u1ED9t d\u00E3y s\u1ED1 nguy\u00EAn b\u1EA5t k\u1EF3, cho tr\u01B0\u1EDBc 1 s\u1ED1 c. <br>H\u00E3y \u0111\u1EBFm c\u00F3 bao nhi\u00EAu s\u1ED1 c\u1EE7a d\u00E3y tr\u00EAn =c; >c; <c.<HTML>");
			lblNewLabel.setBounds(47, 25, 323, 33);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel(
					"<HTML>B\u00E0i 10: Cho m\u1ED9t d\u00E3y s\u1ED1 nguy\u00EAn b\u1EA5t k\u1EF3, h\u00E3y t\u00ECm ra 1 m\u1ED9t d\u00E3y s\u1ED1 li\u1EC1n <br>nhau d\u00E0i nh\u1EA5t bao g\u1ED3m c\u00E1c s\u1ED1 b\u1EB1ng nhau. H\u00E3y in ra s\u1ED1 l\u01B0\u1EE3ng v\u00E0 c\u00E1c ch\u1EC9 s\u1ED1 \u0111\u1EA7u ti\u00EAn c\u1EE7a d\u00E3y con n\u00E0y.<HTML>");
			lblNewLabel_1.setBounds(47, 126, 372, 51);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel(
					"<HTML>B\u00E0i 11: : Cho m\u1ED9t d\u00E3y s\u1ED1 nguy\u00EAn b\u1EA5t k\u1EF3. H\u00E3y t\u00ECm 1 m\u1ED9t d\u00E3y con<br> li\u00EAn t\u1EE5c \u0111\u01A1n \u0111i\u1EC7u t\u0103ng d\u00E0i nh\u1EA5t c\u1EE7a d\u00E3y tr\u00EAn<HTML>.");
			lblNewLabel_2.setBounds(47, 259, 346, 33);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel(
					"<HTML>B\u00E0i 13: Nh\u1EADp v\u00E0o k\u00EDch th\u01B0\u1EDBc \u00F4 vu\u00F4ng n*n, ki\u1EC3m tra 3<=n<= 8. <br>Hi\u1EC3n th\u1ECB ra m\u00E0n h\u00ECnh k\u1EBFt qu\u1EA3 nh\u01B0 m\u00E0n h\u00ECnh<HTML>");
			lblNewLabel_3.setBounds(443, 137, 346, 43);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel(
					"<HTML>B\u00E0i 12: D\u00E3y s\u1ED1 a[ ] \u0111\u01B0\u1EE3c g\u1ECDi l\u00E0 d\u00E3y con c\u1EE7a b[ ] n\u1EBFu t\u1EEB b [ ] x\u00F3a \u0111i<br> 1 v\u00E0i s\u1ED1 s\u1EBD thu \u0111\u01B0\u1EE3c   a[ ]. Cho tr\u01B0\u1EDBc 2 d\u00E3y s\u1ED1 nguy\u00EAn a[ ]; b[ ]. H\u00E3y ki\u1EC3m tra xem a[ ] c\u00F3 l\u00E0 d\u00E3y con c\u1EE7a b[ ] hay kh\u00F4ng?.<HTML>");
			lblNewLabel_4.setBounds(443, 27, 363, 43);
			contentPanel.add(lblNewLabel_4);
		}

		JTextArea bai9Ta = new JTextArea();
		bai9Ta.setBounds(57, 95, 51, 22);
		contentPanel.add(bai9Ta);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("B\u1EB1ng c\r\n");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai9Ta.setText(BaiTap9.kqBai9(0));
			}
		});
		rdbtnNewRadioButton.setBounds(47, 65, 109, 23);
		contentPanel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("L\u1EDBn h\u01A1n c\r\n");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai9Ta.setText(BaiTap9.kqBai9(2));
			}
		});
		rdbtnNewRadioButton_1.setBounds(272, 65, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nh\u1ECF h\u01A1n c");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai9Ta.setText(BaiTap9.kqBai9(1));
			}
		});
		rdbtnNewRadioButton_2.setBounds(161, 65, 109, 23);
		contentPanel.add(rdbtnNewRadioButton_2);

		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		JTextArea bai10Ta = new JTextArea();
		bai10Ta.setBounds(58, 213, 335, 43);
		contentPanel.add(bai10Ta);

		JLabel lblNewLabel_5 = new JLabel("{1,5,3,3,6,6,6,9,9,3,4,5,6,6,7,7,7,7,7,8,8,9}");
		lblNewLabel_5.setBounds(172, 188, 247, 14);
		contentPanel.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, 214, 323, 147);
		contentPanel.add(scrollPane);

		JTextArea bai13Ta = new JTextArea();
		scrollPane.setViewportView(bai13Ta);
		bai13Ta.setEditable(false);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(443, 185, 69, 20);
		contentPanel.add(spinner);

		JButton btnNewButton = new JButton("K\u1EBFt qu\u1EA3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[][] a =new int[50][50];
				if(x<3){
					JOptionPane.showMessageDialog(null, "x phải lớn hơn hoặc bằng 3");
				}else if(x>8) {
					JOptionPane.showMessageDialog(null, "x phải nhỏ hơn hoặc bằng 8");
				}else {
					bai13Ta.setText(BaiTap13.inkq(a , x));
				}
			}
		});
		btnNewButton.setBounds(539, 184, 89, 23);
		contentPanel.add(btnNewButton);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Ki\u1EC3m tra\r\n");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai10Ta.setText(BaiTap10.kqBai10());
			}
		});
		chckbxNewCheckBox.setBounds(57, 184, 109, 23);
		contentPanel.add(chckbxNewCheckBox);

		JLabel lblNewLabel_6 = new JLabel("{ 5, 2, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0 }");
		lblNewLabel_6.setBounds(128, 100, 253, 14);
		contentPanel.add(lblNewLabel_6);

		JTextArea bai11Ta = new JTextArea();
		bai11Ta.setEditable(false);
		bai11Ta.setBounds(57, 303, 167, 33);
		contentPanel.add(bai11Ta);

		JTextArea bai12Ta = new JTextArea();
		bai12Ta.setBounds(443, 81, 159, 45);
		contentPanel.add(bai12Ta);

		JButton btnNewButton_1 = new JButton("K\u1EBFt qu\u1EA3 b\u00E0i 11 v\u00E0 12\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bai11Ta.setText(BaiTap11.kqBai11());
				bai12Ta.setText(BaiTap12.kqBai12());
			}
		});
		btnNewButton_1.setBounds(234, 344, 159, 23);
		contentPanel.add(btnNewButton_1);

		JLabel lblNewLabel_7 = new JLabel("\"1533666993456677777889\"");
		lblNewLabel_7.setBounds(234, 308, 173, 14);
		contentPanel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("A[] = { 1, -2, 5, 6, 8, -9, 4, 29, 11, -7 }");
		lblNewLabel_8.setBounds(614, 81, 202, 19);
		contentPanel.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("B[] = { 6, 8, -9, 4 }");
		lblNewLabel_9.setBounds(612, 112, 194, 14);
		contentPanel.add(lblNewLabel_9);
	
	}
}
