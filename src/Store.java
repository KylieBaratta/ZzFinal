import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Store extends FlowLayout{
	static ArrayList<JButton> buttons = new ArrayList<JButton>();
	static JButton addStore = new JButton("Add a Store");
	JTextField search = new JTextField();
	Dimension d = new Dimension(960,540);
	Dimension bd = new Dimension(60, 20);
	
	public static void main(String[] args){
		new Store(1);
	}
	
	public Store(int indentifier){
		ArrayList<Department> depArray = new ArrayList<Department>();
		addStore("Deli");
		buttons.add(addStore);
		JFrame frame = new JFrame("Store #"+indentifier);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(d);
		for(JButton b : buttons){
			b.setPreferredSize(bd);
			frame.add(b);
		}
		frame.pack();
		frame.setLocation((1920/2)-(frame.getWidth()/2), (1080/2)-frame.getHeight()/2);
		frame.setVisible(true);
	}

	public static void addStore(String name){
		Department a = new Department(name);
	}
}