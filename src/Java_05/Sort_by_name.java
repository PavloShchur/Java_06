package Java_05;

import java.util.Comparator;

public class Sort_by_name implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getName_of_commodity().compareTo(o2.getName_of_commodity());
	}
	
}
