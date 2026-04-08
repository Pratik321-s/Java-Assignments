import java.util.ArrayList;

class Order
{
	int orderId;
	String customerName;
	String []items;
	double []prices;
	
	Order(int orderId, String customerName, String []items, double []prices)
	{
		this.orderId = orderId;
		this.customerName = customerName;
		this.items = items;
		this.prices = prices;
	}
	
	double calculateTotal()
	{
		double total = 0;
		for(int i = 0; i < prices.length; i++){
			total = total + prices[i];
		}
		return total;
	}
	
	double calculateTotal(double gstPercent)
	{
		double total = calculateTotal();
		return total + (total * gstPercent / 100);
	}
	
	void displayOrder()
	{
		System.out.println("Order ID: " + orderId);
		System.out.println("Customer Name: " + customerName);
		
		System.out.println("Items: ");
		for(int i = 0; i < items.length; i++)
		{
			System.out.println(items[i] + " - " + prices[i]);
		}
		
		double total = calculateTotal();
		double finalTotal = calculateTotal(18);
		
		System.out.println("Total (without GST): " + total);
		System.out.println("Total (with GST 18%): " + finalTotal);
	}
}

class OnlineOrderSystem
{
	public static void main(String []args)
	{
		ArrayList<Order> orders = new ArrayList<>();
		
		String []items1 = {"Laptop", "Mouse"};
		double []prices1 = {50000, 500};
		Order o1 = new Order(1, "Rahul", items1, prices1);
		
		String []items2 = {"Phone", "Charger"};
		double []prices2 = {20000, 100};
		Order o2 = new Order(2, "Jainil", items2, prices2);
		
		orders.add(o1);
		orders.add(o2);
		
		for(Order o : orders){
			o.displayOrder();
		}
		
		System.out.println("Total Orders: " + orders.size());
	}
}