import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;


public class DepartmentPage {
	public DepartmentPage(){
		JFrame frame = new JFrame("MouseDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d = new Dimension(960,540);
		frame.setPreferredSize(d);		
		frame.pack();
		frame.setLocation((1920/2)-(frame.getWidth()/2), (1080/2)-frame.getHeight()/2);
		frame.setVisible(true);
		
		JButton addItem = new JButton("Add an Item");
		frame.add(addItem);
	}
}
