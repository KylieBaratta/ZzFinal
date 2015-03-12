import java.util.HashMap;


public class Inventory {

	private HashMap<String, Items> inventory = new HashMap<String, Items>();
	
	public void addItem(Items item){
		if (inventory.containsKey(item.getName()))
			throw new Error("Item already exists");
		inventory.put(item.getName(), item);
	}
	public void removeItem(String item){
		inventory.remove(item);
	}
	public Items findItem(String item){
		return inventory.get(item);
	}


}


