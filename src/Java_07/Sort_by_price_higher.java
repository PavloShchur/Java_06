package Java_07;

import java.util.Comparator;

public class Sort_by_price_higher implements Comparator<Commodity_new> {

	@Override
	public int compare(Commodity_new o1, Commodity_new o2) {
		return o2.getPrice() - o1.getPrice();
	}

}
