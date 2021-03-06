
package parlament_map;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Parlament parlament = new Parlament();
		boolean work = true;
		while (work) {
			Menu menu = new Menu();
			menu.menu();
			String choice = scanner.next();

			switch (choice) {

			case "1": {
				parlament.addFractionIntoParlament();
				break;
			}
			case "2": {
				parlament.deleteFractionFromParlament();
				break;
			}
			case "3": {
				parlament.cleanFraction();
				break;
			}
			case "4": {
				parlament.showAllFractions();
				break;
			}
			case "5": {
				parlament.showSomeFractionInParlament();
				break;
			}
			case "6": {
				parlament.addDeputyIntoFraction();
				break;
			}
			case "7": {
				parlament.deleteDeputyFromFraction();
				break;
			}
			case "8": {
				parlament.showAllBribersInFraction();
				break;
			}
			case "9": {
				parlament.giveBribe();
				break;
			}
			case "10": {
				parlament.showMaxBriberFromFraction();
				break;
			}
			case "11": {
				System.exit(11);
				break;
			}
			default: {
				System.out.println("wrong input");
			}

			}
		}
	}
}
