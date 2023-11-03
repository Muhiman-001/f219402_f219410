package lab11;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JLabel titleLabel;
	String[] roots= {"ورد","حمر ","حديقة","فتح","ألوان","شرق","عطي","رائحة","جميل","سعد","قلب","حزن"};
	final JComboBox<String> root = new JComboBox<String>(roots);
public GUI()
{
	JFrame frame=new JFrame("poem");
	frame.setVisible(true);
	setTitle("Poem Editor");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400, 300);
	setLocationRelativeTo(null);
	titleLabel = new JLabel("Poems");
	titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	JPanel contentPane = new JPanel(new GridLayout(10, 0));
	titleLabel.setVisible(true);
	contentPane.add(titleLabel);
	root.setVisible(true);
	contentPane.add(root);
	add(contentPane);

}
}
