import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DepartmentLayoutPanel extends JPanel{
	private int count = 0;
	JButton addItem = new JButton("Add an Item");
	JTextField addItemText = new JTextField("", 40);
	JButton price = new JButton("Change the Price");
	JTextField priceText= new JTextField("", 40);
	JButton quantity = new JButton("Change the Price");
	JTextField quantityText = new JTextField("", 40);
	JButton removeItem = new JButton("Remove an Item");
	JTextField removeText = new JTextField("", 40);

	public DepartmentLayoutPanel(){
		ButtonListener listener = new ButtonListener();
		addItem.addActionListener(listener);
		price.addActionListener(listener);
		quantity.addActionListener(listener);
		removeItem.addActionListener(listener);
		addItemText.addActionListener(listener);
		priceText.addActionListener(listener);
		quantityText.addActionListener(listener);
		removeText.addActionListener(listener);
		
		this.add(addItem);
		this.add(addItemText);
		this.add(price);
		this.add(priceText);
		this.add(quantity);
		this.add(quantityText);
		this.add(removeItem);
		this.add(removeText);
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(600, 300));
	}

	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== addItem){
				
			}
		}
	}
}
