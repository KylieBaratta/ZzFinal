import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class StoreLayoutPanel extends JPanel{
	private JButton addDepartment = new JButton("Add a Department");
	private JTextField search = new JTextField("Enter Department Name:", 20);
	private JButton deli = new JButton("Deli");
	private JButton produce = new JButton("Produce");
	private JButton bakery = new JButton("Bakery");
	private JButton cleaning = new JButton("Cleaning");
	private JButton frozenFood = new JButton("Frozen Food");
	private JButton dryGoods = new JButton("Dry Foods");
	private JButton seasonal = new JButton("Seasonal");
	private JButton meat = new JButton("Meat");
	
	public boolean show = false;
	public StoreLayoutPanel(){
		ButtonListener listener = new ButtonListener();
		addDepartment.addActionListener(listener);
		search.addActionListener(listener);
		
		this.add(deli);
		this.add(produce);
		this.add(bakery);
		this.add(meat);
		this.add(cleaning);
		this.add(frozenFood);
		this.add(dryGoods);
		this.add(seasonal);
		
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(300, 200));
	}

	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== deli){
				new Department("Deli");
			}
			else if(e.getSource()==search){
				new Department(search.getText());
			}
		}
	}
}
