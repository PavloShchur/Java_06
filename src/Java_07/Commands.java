package Java_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.UUID;


public class Commands {
	List<Commodity_new> commodity_news = new ArrayList<>();

	public void addCommodity() {
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 2);
		int price = 100 + (int) (Math.random() * 900);
		int weight = 10 + (int) (Math.random() * 90);
		Commodity_new commodity_new = new Commodity_new(name, price, weight);
		commodity_news.add(commodity_new);

	}

	public void show_all_commodities() {

		for (int i = 0; i < 33; i++) {
				Main.formatter = new Formatter();
				System.out.println(Main.formatter.format("%1$s %2$s %3$s", i + " " + commodity_news.get(i),
						i + " " + commodity_news.get(i + 33), i + " " + commodity_news.get(i + 66)));
			}
		}
		// try {
		// for (int i = 0; i < 99; i++) {
		// Main.formatter = new Formatter();
		// System.out.println(Main.formatter.format("%1$s %2$s %3$s", i + " " +
		// commodity_news.get(i),
		// i + " " + commodity_news.get(i + 33), i + " " + commodity_news.get(i
		// + 66)));
		// }
		// } catch (IndexOutOfBoundsException e) {
		// System.out.println(e.getMessage());
		// }
	

	public void show_pages(List<Commodity_new> commodity_news, int page) {
		int spacing = 31;
		for (int i = 0; i < 3; i++) {
			Main.formatter = new Formatter();
			System.out.println(Main.formatter.format("%1$s %2$s %3$s", commodity_news.get(i), commodity_news.get(i + 3),
					commodity_news.get(i + 6)));
		}
		System.out.printf("%" + spacing + "s", "");
		for (int i = 1; i <= 11; i++) {
			if (i == page) {
			} else {
				System.out.print(" " + i + " ");
			}
			if (i == page) {
				System.out.print("{" + page + "}");
			}

		}
		System.out.println();
	}

	public void sort_by_price_higher() {
		Collections.sort(commodity_news, new Sort_by_price_higher());
	}

	public void sort_by_price_lower() {
		Collections.sort(commodity_news, new Sort_by_price_lower());
	}

}
