
public class FrozenFoodDepartment extends Department{
	Inventory inventory = new Inventory();
	public static void main(String[] args){
		new FrozenFoodDepartment();
	}
	
	public FrozenFoodDepartment() {
		super("deli");
		Items someHam = new Items("Some", "Ham", 1.99, 20);
		Items bestRoastBeef = new Items("Best", "Roast Beef", 2.99, 15);
		Items girTurkey = new Items("Gir's", "Turkey", 3.99, 10);
		Items zimChicken = new Items("Zim's", "Chicken", 4.99, 5);
		Items nanPotatoSalad = new Items("Nan's", "Potato Salad", 5.99, 25);
		Items italianPastaSalad = new Items("Italian", "Pasta Salad", 6.99, 30);
		inventory.add(someHam);
		inventory.add(bestRoastBeef);
		inventory.add(girTurkey);
		inventory.add(zimChicken);
		inventory.add(nanPotatoSalad);
		inventory.add(italianPastaSalad);
	}
}
