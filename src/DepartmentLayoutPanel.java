import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class DepartmentLayoutPanel extends JPanel{
	Inventory inventory;
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
	String priceString;
	String quantityString;
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
			else if(e.getSource() == addItemText){
				name = addItemText.getText();
			}
			else if(e.getSource() == brandText){
				brand = brandText.getText();
			}
			else if(e.getSource() == priceText){
				priceString = priceText.getText();
			}
			else if(e.getSource() == quantityText){
				quantityString = quantityText.getText();
			}
			else if(e.getSource() == print){
				print();
			}
		}
	}

	public void addThings(){
		double price = Double.parseDouble(priceString);
		int quantity = Integer.parseInt(quantityString);
		Items a = new Items(brand, name, price, quantity);
		inventory.add(a);
	}

	public void print(){
		System.out.println(inventory);
	}
}
