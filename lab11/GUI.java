package lab11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JLabel titleLabel;

String[] verse = { "ردة حمراء في الحديقة", "تفتحت بألوان مشرقة", "تعطي رائحة جميلة", "تسعد القلب الحزين" };
	final JComboBox<String> verses = new JComboBox<>(verse);
	String[] roots= {"ورد","حمر ","حديقة","فتح","ألوان","شرق","عطي","رائحة","جميل","سعد","قلب","حزن"};
	final JComboBox<String> root = new JComboBox<String>(roots);
	private Button btn1;
	public GUI() {

		

		setTitle("Poem Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		titleLabel = new JLabel("Poems");
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JPanel contentPane = new JPanel(new GridLayout(5, 1));
		contentPane.add(titleLabel);
		 root.setPreferredSize(new Dimension(100, 30)); 

	        contentPane.add(root, BorderLayout.EAST);

verses.setPreferredSize(new Dimension(50, 1));
		contentPane.add(verses, BorderLayout.WEST);
		titleLabel.setVisible(true);
		contentPane.add(titleLabel);
		verses.setVisible(true);
		contentPane.add(verses);
		add(contentPane);
		 }
}
