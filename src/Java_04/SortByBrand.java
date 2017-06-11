package Java_04;

import java.util.Comparator;

public class SortByBrand implements Comparator<Watch> {

	@Override
	public int compare(Watch o1, Watch o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
