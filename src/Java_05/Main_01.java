package Java_05;

import java.util.Scanner;

public class Main_01 {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Method method = new Method();

		boolean work = true;
		while (work) {
			Function function = new Function();
			function.menu();
			String choice = Main_01.scanner.next();
			switch (choice) {
			case "1": {
				method.add_commodity();
				break;
			}
			case "2": {
				method.show_all_elements();
				break;
			}
			case "3": {
				method.delete_commodity();
				break;
			}
			case "4": {
				method.set_commodity();
				break;
			}
			case "5": {
				method.sort_by_name();
				break;
			}
			case "6": {
				method.sort_by_length();
				break;
			}
			case "7": {
				method.sort_by_width();
				break;
			}
			case "8": {
				method.show_i_commodity();
				break;
			}
			case "9": {
				System.exit(9);
				break;
			}

			default:
				break;
			}
		}
	}

}
