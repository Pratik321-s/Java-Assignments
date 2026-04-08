class Inventory<T>
{
	private T product;
	
	void addProduct(T product)
	{
		this.product = product;
	}
	
	T getProduct()
	{
		return product;
	}
}

class Electronics
{
	private String name;
	private double price;
	private String brand;
	
	Electronics(String name, double price, String brand)
	{
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	public String toString()
	{
		return "Electronics [Name=" + name + ", Price=" + price + ", Brand" + brand + "]";
	}
}

class Clothing
{
	private String name;
	private double price;
	private String size;
	
	Clothing(String name, double price, String size)
	{
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	public String toString()
	{
		return "Clothing [Name=" + name + ", Price=" + price + ", Size=" + size + "]";
	}
}

class Main
{
	public static void main(String []args)
	{
		Inventory<Electronics> elecInventory = new Inventory<>();
		Electronics phone = new Electronics("Smartphone", 25000, "Samsung");
		elecInventory.addProduct(phone);
		
		Inventory<Clothing> cloInventory = new Inventory<>();
		Clothing shirt = new Clothing("T-shirt", 500, "L");
		cloInventory.addProduct(shirt);
		
		System.out.println("Electronics Product: ");
		System.out.println(elecInventory.getProduct());
		
		System.out.println("Clothing Product: ");
		System.out.println(cloInventory.getProduct());
	}
}