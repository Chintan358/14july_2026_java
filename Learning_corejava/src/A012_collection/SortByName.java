package A012_collection;

import java.util.Comparator;

public class SortByName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		
		String exist_name = o2.name;  //12
		String new_name = o1.name; //10
		
		
		return -exist_name.compareTo(new_name);
	}

}
