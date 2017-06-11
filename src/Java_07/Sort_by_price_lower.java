package Java_07;

import java.util.Comparator;

public class Sort_by_price_lower implements Comparator<Commodity_new> {

	@Override
	public int compare(Commodity_new o1, Commodity_new o2) {
		return o1.getPrice() - o2.getPrice();
	}
	
}
