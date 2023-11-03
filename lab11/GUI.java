package lab11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JLabel titleLabel;

	private Label lb1;
	private TextField txt1;

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

		lb1 = new Label("Verse : ");

		txt1 = new TextField(16);

		btn1 = new Button("add");

		add(lb1);
		add(txt1);

		add(btn1);

		setSize(500, 500);
		setTitle("Login Application");
		setLayout(new FlowLayout());

	}
	
	  public Button get_btn1 ()
	  {
		  return btn1;
	  }
	  public String getVerse()
	  {
		  return txt1.getText();
	  }
	  public void setActionListener(ActionListener a)
	  {
		  this.btn1.addActionListener(a);
	  }

	  

}
