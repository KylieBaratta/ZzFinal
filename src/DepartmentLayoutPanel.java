import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DepartmentLayoutPanel extends JPanel{
	private int count = 0;
	JButton print = new JButton("Show Inventory");
	JButton addItem = new JButton("Add an Item");
	JTextField addItemText = new JTextField("Add an Item", 30);
	JTextField brandText = new JTextField("Item Brand", 30);
	JTextField priceText= new JTextField("Change the Price", 30);
	JTextField quantityText = new JTextField("Change the Quantity", 30);
	JButton removeItem = new JButton("Remove an Item");
	JTextField removeItemText = new JTextField("Choose Item To Remove", 30);
	String name;
	String brand;
	double price;
	int quantity;
	
	
	
	public DepartmentLayoutPanel(){
		ButtonListener listener = new ButtonListener();
		addItemText.addActionListener(listener);
		priceText.addActionListener(listener);
		quantityText.addActionListener(listener);
		removeItem.addActionListener(listener);
		print.addActionListener(listener);
		this.add(print);
		this.add(addItem);
		this.add(addItemText);
		this.add(brandText);
		this.add(priceText);
		this.add(quantityText);
		this.add(removeItem);
		this.add(removeItemText);
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(375, 300));
	}

	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == addItem){
				addThings();
			}
			else if(e.getSource() == print){
				print();
			}
		}
	}
	
	public void addThings(){
		String brand = brandText.getText();
		String name = addItemText.getText();
		String priceString = priceText.getText();
		double price = Double.parseDouble(priceString);
		String quantityString = quantityText.getText();
		int quantity = Integer.parseInt(quantityString);
		Items a = new Items(brand, name, price, quantity);
	}
	
	public void print(){
		
	}
}
