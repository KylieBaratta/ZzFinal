
public class ProduceDepartment extends Department{
	Inventory inventory = new Inventory();
	
	public static void main(String[] args){
		new ProduceDepartment();
	}
	
	public ProduceDepartment(){
		super("Produce");
		Items apple = new Items("AppleHill", "fuji", 0.69, 1);
		Items grape = new Items("Grape", "Andre", 4.99, 100);
		Items lettuce = new Items("LetIs ", "regular", 3.99, 20);
		Items peaches = new Items("WildValley", "Freestone", 5.99, 12);
		Items cantaloupe = new Items("CanAnOpe", "Orange", 3.99, 2);
		Items strawberries = new Items("FreshProduce", "Summer", 5.99, 50);
		
		inventory.add(apple);
		inventory.add(grape);
		inventory.add(lettuce);
		inventory.add(peaches);
		inventory.add(cantaloupe);
		inventory.add(strawberries);
		print();
		
	}
	
	public void print (){
		System.out.println(inventory);
	}

}
