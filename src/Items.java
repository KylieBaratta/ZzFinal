
public class Items {

	private String brand;
	private String type;
	private double price;
	private int quantity;

	public Items(String brand, String type, double price, int quantity){
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String name) {
		this.brand = name;
	}

	public String getType() {
		return brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append(this.brand);
		builder.append(" ");
		builder.append(this.type);
		builder.append(" | Price: ");
		builder.append(this.price);
		builder.append(" | Quantity: ");
		builder.append(this.quantity);
		builder.append("\n");
		return builder.toString();
	}
}
