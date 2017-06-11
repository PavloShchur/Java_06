package Java_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;


public class Method {

	private Commodity commodity;
	ArrayList<Commodity> commodities = new ArrayList<>();

	public void add_commodity() {
//		System.out.println("Please enter name of commodity");
		String name_of_commodity = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0,
				2);
//		System.out.println("Please enter length of commodity");
		double lenght_of_commodity = (int) (Math.random() * 90);
//		System.out.println("Please enter width of commodity");
		double width_of_commodity = (int) (Math.random() * 90);
//		System.out.println("Please enter weight of commodity");
		double weight_of_commodity = (int) (Math.random() * 90);
		Commodity commodity = new Commodity(name_of_commodity, lenght_of_commodity, width_of_commodity,
				weight_of_commodity);
		commodities.add(commodity);

	}

	public void show_all_elements() {
		for (Commodity x : commodities) {
			System.out.println(x);
		}
	}

	public void delete_commodity() {
		System.out.println("Please enter name of commodity");
		String name_of_commodity = Main_01.scanner.next();
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			Commodity commodityes = iterator.next();
			if (name_of_commodity.equals(commodityes.getName_of_commodity())) {
				iterator.remove();
			}
		}
	}

	public void set_commodity() {
		System.out.println("Please enter name of commodity");
		String name_of_commodity = Main_01.scanner.next();
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			Commodity commodityes = iterator.next();
			if (name_of_commodity.equals(commodityes.getName_of_commodity())) {
				iterator.remove();
			}
		}

		System.out.println("Please enter name of commodity");
		String name_of_commodity1 = Main_01.scanner.next();
		System.out.println("Please enter length of commodity");
		double lenght_of_commodity = Main_01.scanner.nextDouble();
		System.out.println("Please enter width of commodity");
		double width_of_commodity = Main_01.scanner.nextDouble();
		System.out.println("Please enter weight of commodity");
		double weight_of_commodity = Main_01.scanner.nextDouble();
		Commodity commodity1 = new Commodity(name_of_commodity1, lenght_of_commodity, width_of_commodity,
				weight_of_commodity);
		commodities.add(commodity1);

	}

	public void sort_by_name() {
		Collections.sort(commodities, new Sort_by_name());

		// after sorted
		System.out.println("ArrayList is sorted");

		for (Commodity temp : commodities) {

			System.out.println(temp);

		}

		// for(int i = 1; i < commodities.size(); i++)
		// if(!commodities.get(i).getName_of_commodity().equals(commodities.get(i
		// + 1).getName_of_commodity()) )
		//
		// for(i = 0; i < commodities.size(); i++)
		// System.out.println( commodities.get(i).toString() + "\n");

	}

	public void sort_by_length() {
		Set<Commodity> commodities = new TreeSet<>(new Sort_by_length());
		System.out.println(commodities);
	}

	public void sort_by_width() {
		Collections.sort(commodities);

		Comparator<Commodity> comparator = new Sort_by_width();
		Set<Commodity> commodities = new TreeSet<>(new Sort_by_width());
		System.out.println(commodities);

	}

	public void sort_by_weight() {
		Set<Commodity> commodities = new TreeSet<>(new Sort_by_weight());
		System.out.println(commodities);
	}

	public void show_i_commodity() {
		System.out.println("Enter name of commodity");
		String commodity_i_name = Main_01.scanner.next();
		for (int i = 0; i < commodities.size(); i++) {
			if (commodity_i_name.equalsIgnoreCase(commodities.get(i).getName_of_commodity())) {
				System.out.println(commodities.get(i));
			}
		}
	}
	// System.out.println("Please enter name of commodity");
	// String name_of_commodity = Main_01.scanner.next();
	//
	// for (Commodity x : commodities) {
	// if (name_of_commodity.equals(x.getName_of_commodity()))
	// commodities.remove(x);
	//
	// }
	// System.out.println("By which commodity do you want to replace this one");
	// System.out.println("Please enter name of commodity");
	// String name_of_commodity_2 = Main_01.scanner.next();
	// System.out.println("Please enter length of commodity");
	// double lenght_of_commodity_2 = Main_01.scanner.nextDouble();
	// System.out.println("Please enter width of commodity");
	// double width_of_commodity_2 = Main_01.scanner.nextDouble();
	// System.out.println("Please enter weight of commodity");
	// double weight_of_commodity_2 = Main_01.scanner.nextDouble();
	// Commodity new_commodity_2 = new Commodity(name_of_commodity_2,
	// lenght_of_commodity_2, width_of_commodity_2,
	// weight_of_commodity_2);
	// commodities.add(new_commodity_2);
	//

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commodity == null) ? 0 : commodity.hashCode());
		result = prime * result + ((commodities == null) ? 0 : commodities.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Method other = (Method) obj;
		if (commodity == null) {
			if (other.commodity != null)
				return false;
		} else if (!commodity.equals(other.commodity))
			return false;
		if (commodities == null) {
			if (other.commodities != null)
				return false;
		} else if (!commodities.equals(other.commodities))
			return false;
		return true;
	}

}
