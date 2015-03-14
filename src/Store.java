import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Store implements ActionListener{
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	JButton addStore = new JButton("Add a Store");
	JTextField search = new JTextField();
	Dimension d = new Dimension(960,540);
	Dimension bd = new Dimension(60, 20);

	public static void main(String[] args){
		new Store(1);
	}

	public Store(int indentifier){
		ArrayList<Department> depArray = new ArrayList<Department>();
		buttons.add(addStore);
		JFrame frame = new JFrame("Store #"+indentifier);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(d);
		addStore.setPreferredSize(bd);
		addStore.addActionListener(this);
		frame.add(addStore);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

	public static void addStore(String name){
		new Department(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addStore){
			addStore("Deli");
		}
	}
}