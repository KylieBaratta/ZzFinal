import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.*;


public class Department {
	
	public Department(String name){
		Hashtable<String, Integer> items = new Hashtable<String, Integer>();
		DepartmentPage page = new DepartmentPage(name);
		//main screen\\
			//buttons along bottom
				//add, change Price, change Amount, remove Item, search
	
	Inventory cleaning = new Inventory();
	Items tideSoap = new Items("Tide", "Soap", 1.99, 25);
	cleaning.addItem(tideSoap);
	System.out.println(cleaning);
	}
	
	public void addItem(String name){
		
	}
	
	public void changePrice(){
		
	}
	
	public void changeQuantity(){
		
	}
	
	public void removeItem(){
		
	}
	
	public void search(){
		
	}
}
