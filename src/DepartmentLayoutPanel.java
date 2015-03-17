import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class DepartmentLayoutPanel extends JPanel{
	JButton print = new JButton("Show Inventory");
	JButton addItem = new JButton("Add an Item");
	JLabel addItemLabel= new JLabel("Item Name");
	JTextField addItemText = new JTextField(20);
	JLabel brandLabel= new JLabel("Item Brand");
	JTextField brandText = new JTextField(20);
	JLabel priceLabel= new JLabel("Item Price");
	JTextField priceText= new JTextField(20);
	JLabel quantityLabel= new JLabel("Item Quantity");
	JTextField quantityText = new JTextField(20);
	JButton removeItem = new JButton("Remove an Item");
	JTextField removeItemText = new JTextField("Choose Item To Remove", 20);
	String name;
	String brand;
	String priceString;
	String quantityString;
	double price;
	int quantity;
	Department depar;

	public DepartmentLayoutPanel(Department depar){
		this.depar = depar;
		ButtonListener listener = new ButtonListener();
		addItemText.addActionListener(listener);
		priceText.addActionListener(listener);
		quantityText.addActionListener(listener);
		removeItem.addActionListener(listener);
		print.addActionListener(listener);
		this.add(print);
		this.add(addItem);
		this.add(addItemLabel);
		this.add(addItemText);
		this.add(brandLabel);
		this.add(brandText);
		this.add(priceLabel);
		this.add(priceText);
		this.add(quantityLabel);
		this.add(quantityText);
		this.add(removeItem);
		this.add(removeItemText);
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(275, 300));
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
				System.out.println(depar.inventory);
			}
		}
	}

	public void addThings(){
		double price = Double.parseDouble(priceString);
		int quantity = Integer.parseInt(quantityString);
		Items a = new Items(brand, name, price, quantity);
		depar.inventory.add(a);
	}
}
