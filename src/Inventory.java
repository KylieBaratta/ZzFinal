import java.util.HashMap;
import java.util.Map.Entry;


public class Inventory {

	public HashMap<String, Items> inventory = new HashMap<String, Items>();
	
	public void addItem(Items item){
		if (inventory.containsKey(item.getBrand()))
			throw new Error("Item already exists");
		inventory.put(item.getBrand(), item);
	}
	public void removeItem(String item){
		inventory.remove(item);
	}
	public Items findItem(String item){
		return inventory.get(item);
	}

	@Override
	public String toString()
	{
	    final StringBuilder builder = new StringBuilder();
	    for (final Entry<String, Items> entry : inventory.entrySet())
	    {
	        builder.append(entry.getKey());
	        builder.append(" =>");
	        builder.append(entry.getValue());
	        builder.append("\n");
	    }
	    return builder.toString();
	}
}


