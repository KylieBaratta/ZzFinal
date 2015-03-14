import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


@SuppressWarnings("serial")
public class DepartmentPage extends FlowLayout implements ActionListener{
	
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
		addItem.setPreferredSize(new Dimension(60,20));
		price.setPreferredSize(new Dimension(60,20));
		quantity.setPreferredSize(new Dimension(60,20));
		removeItem.setPreferredSize(new Dimension(60,20));
		frame.add(addItem);
		frame.add(price);
		frame.add(quantity);
		frame.add(removeItem);
		frame.pack();
		frame.setLocation((1920/2), 0);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
