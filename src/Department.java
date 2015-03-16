import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Department {
	
	public Department(String name){
		JFrame frame = new JFrame(name+" Department");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DepartmentLayoutPanel panel = new DepartmentLayoutPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}
}