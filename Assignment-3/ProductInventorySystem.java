import java.util.ArrayList;

class Product
{
	int productId;
	String name;
	double price;
	int quantity;
	
	Product(int productId, String name, double price, int quantity)
	{
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	double calculateStockValue()
	{
		return price * quantity;
	}
	
	void updateQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	void updatePrice(double newPrice)
	{
		this.price = newPrice;
	}
	
	void updatePrice(double discount, boolean isDiscount)
	{
		if(isDiscount)
		{
			this.price = price - (price * discount / 100);
		}
	}
	
	void displayProduct()
	{
		System.out.println("Product ID: " + productId);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Stock Value: " + calculateStockValue());
	}
}

class InventorySystem
{
	public static void main(String []args)
	{
		ArrayList<Product> products = new ArrayList<>();
		
		Product p1 = new Product(101, "Laptop", 50000, 5);
		Product p2 = new Product(102, "Phone", 20000, 10);
		Product p3 = new Product(103, "Headphones", 2000, 15);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		p1.updatePrice(45000);
		p2.updatePrice(10, true);
		p3.updateQuantity(20);
		
		double totalInventoryValue = 0;
		
		for(Product p : products)
		{
			p.displayProduct();
			totalInventoryValue = totalInventoryValue + p.calculateStockValue();
		}
		
		System.out.println("Total Inventory Value: " + totalInventoryValue);
	}
}