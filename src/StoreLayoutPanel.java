import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class StoreLayoutPanel extends JPanel{
	private JButton addDepartment = new JButton("Add a Department");
	private JTextField search = new JTextField("Enter Department Name:", 20);

	
	public boolean show = false;
	public StoreLayoutPanel(){
		ButtonListener listener = new ButtonListener();
		addDepartment.addActionListener(listener);
		search.addActionListener(listener);
		this.add(addDepartment);
		this.add(search);
				
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(600, 300));
	}

	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== addDepartment){
				search.setText("Enter Department Name");
			}
			else if(e.getSource()==search){
				new Department(search.getText());
			}
		}
	}
}
