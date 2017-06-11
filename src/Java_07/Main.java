package Java_07;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Formatter formatter = new Formatter();

	public static void main(String[] args) {
		Commands commands = new Commands();
		boolean work = true;

		while (work) {
			Function function = new Function();
			function.menu_enter();
			String choice = Main.scanner.next();
			System.out.println();
			switch (choice) {
			case "1": {
				for (int i = 0; i < 100; i++) {
					commands.addCommodity();
				}
				break;
			}
			case "2": {
				commands.show_all_commodities();
				break;
			}
			case "3": {
				commands.sort_by_price_lower();
				System.out.println();
				break;
			}

			case "4": {
				commands.sort_by_price_higher();
				System.out.println();
				break;
			}

			case "5": {
				System.out.println("Enter page");
				int page = Main.scanner.nextInt();
				int max = page * 9;
				int min = page * 9 - 9;
				if (max > (commands.commodity_news.size()) && min > commands.commodity_news.size()) {
					System.out.println("We do not have such a page");
				} else if (max > (commands.commodity_news.size())) {
					System.out.println(commands.commodity_news.subList(min, commands.commodity_news.size()));
				} else {
					commands.show_pages(commands.commodity_news.subList(min, max), page);
				}
				break;
			}
			case "6": {
				commands.sort_by_price_higher();
				System.out.println();
				break;
			}
			case "7": {
				System.exit(6);
				work = false;
				break;
			}
			}
		}
	}
}
