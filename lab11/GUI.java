package lab11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JLabel titleLabel;
	String[] roots = { "ورد", "حمر ", "حديقة", "فتح", "ألوان", "شرق", "عطي", "رائحة", "جميل", "سعد", "قلب", "حزن" };
	

	final JComboBox<String> root = new JComboBox<>(roots);

	public GUI() {
		setTitle("Poem Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		titleLabel = new JLabel("Poems");
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JPanel contentPane = new JPanel(new BorderLayout());
		contentPane.add(titleLabel, BorderLayout.NORTH);
		root.setPreferredSize(new Dimension(50, 1));
		contentPane.add(root, BorderLayout.EAST);

		add(contentPane);
		setVisible(true);
	}

}