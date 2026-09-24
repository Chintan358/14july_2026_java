package A012_collection;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		
		double exist_id = o2.price;  //12
		double new_id = o1.price; //10
		
		
		int i=0;
		if(new_id>exist_id)
		{
			i = 1;
		}
		else if(new_id<exist_id)
		{
			i = -1;
		}
		else
		{
			i = 0;
		}
		return i;
	}

}
