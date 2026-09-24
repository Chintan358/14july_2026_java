package A012_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Product
{
	int id;
	String name;
	double price;
	int qty;
	
	
	
	public Product(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}

public class C012_Productcollection
{
	public static void main(String[] args) 
	{
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Pen", 500, 10));
		products.add(new Product(2, "Fan", 40, 20));
		products.add(new Product(3, "Table", 5000, 2));
		
//		Collections.sort(products,new SortById());
//		Collections.sort(products,new SortByName());
		Collections.sort(products,new SortByPrice());
		
		Iterator<Product> iter = products.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
			
	}
}
