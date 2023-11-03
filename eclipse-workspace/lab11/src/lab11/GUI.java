package lab11;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JLabel titleLabel;
	
public GUI()
{
	setTitle("Poem Editor");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400, 300);
	setLocationRelativeTo(null);
	titleLabel = new JLabel("Poems");
	titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	JPanel contentPane = new JPanel(new GridLayout(5, 1));
	contentPane.add(titleLabel);

}
}
