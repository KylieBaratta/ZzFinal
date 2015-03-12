import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;


public class DepartmentPage extends FlowLayout{
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	JButton addItem = new JButton("Add an Item");
	JButton price = new JButton("Change the Price");
	JButton quantity = new JButton("Change the Price");
	JButton removeItem = new JButton("Remove an Item");
	JTextField search = new JTextField();
	Dimension d = new Dimension(960,540);

	public DepartmentPage(String name){
		JFrame frame = new JFrame(name + " Department:");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(d);
		buttons.add(addItem);
		buttons.add(price);
		buttons.add(quantity);
		buttons.add(removeItem);
		for(JButton b : buttons){
			b.setPreferredSize(new Dimension(60,20));
			frame.add(b);
		}
		frame.pack();
		frame.setLocation((1920/2)-(frame.getWidth()/2), (1080/2)-frame.getHeight()/2);
		frame.setVisible(true);
	}
}
