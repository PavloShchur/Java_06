package parlament;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Fraction {

	private List<Fraction> fractions = new ArrayList<Fraction>();

	private String nameOFFraction;

	public List<Fraction> getFractions() {
		return fractions;
	}

	public void setFractions(List<Fraction> fractions) {
		this.fractions = fractions;
	}

	public String getNameOFFraction() {
		return nameOFFraction;
	}

	public void setNameOFFraction(String nameOFFraction) {
		this.nameOFFraction = nameOFFraction;
	}

	public Fraction() {
		super();
	}

	public Fraction(String nameOFFraction) {
		super();
		this.nameOFFraction = nameOFFraction;
	}

	@Override
	public String toString() {
		return "Fraction [nameOFFraction=" + nameOFFraction + "]";
	}

	// methods

	public void addDeputyIntoAFraction() {
		System.out.println("Enter name of deputy");
		String name = Main.scanner.next();
		System.out.println("enter surname of deputy");
		String surname = Main.scanner.next();
		System.out.println("enter age of deputy");
		int age = Main.scanner.nextInt();
		System.out.println("does deputy is briber? enter true of false");
		String isBriber = Main.scanner.next();

		boolean briber;

		if (isBriber.equalsIgnoreCase("true")) {
			briber = true;

		} else {
			briber = false;

		}

		// Deputy deputy = new Deputy(age, briber, sizeOfBribe);
		// deputy.giveBribe();
		// deputies.add(deputy);

	}

	public void deleteDeputyFromFraction() {
		// System.out.println("enter name of deputy for remove");
		// String name = Main.scanner.next();
		// System.out.println("enter surname of deputy for remove");
		// String surname = Main.scanner.next();
		//
		// Iterator<Deputy> iterator = deputies.iterator();
		//
		// boolean deleted = false;
		//
		// while (iterator.hasNext()) {
		// Deputy deputy = iterator.next();
		//
		// if (deputy.getName().equalsIgnoreCase(name) &&
		// deputy.getSurname().equalsIgnoreCase(surname)) {
		// iterator.remove();
		// deleted = true;
		// }
		//
		// }
		// if (!deleted) {
		// System.out.println("does'n have deputy for delete");
		// }

	}

	public void showAllBriberFromFraction() {

		// boolean existBriber = false;
		//
		// if (deputies.isEmpty()) {
		// System.out.println("doesn't have any deputies");
		// } else {
		//
		// for (Deputy deputy : deputies) {
		// if (deputy.isBriber()) {
		// System.out.println(deputy);
		// existBriber = true;
		// }
		// }
		//
		// if (!existBriber) {
		// System.out.println("don't have briber in fraction");
		// }
		// }

	}

	public void showMaxBriberTakerFromFraction() {

		// Deputy deputy;
		// if (deputies.isEmpty()) {
		// System.out.println("don't have any deputy in fraction");
		// } else {
		//
		// deputy = deputies.get(0);
		//
		// for (Deputy currentDeputy : deputies) {
		//
		// if (currentDeputy.getSizeOfBribe() > deputy.getSizeOfBribe()) {
		// deputy = currentDeputy;
		// }
		//
		// }
		//
		// System.out.println("max briber = " + deputy);
		//
		// }

	}

	public void showAllDeputyFromFraction() {
		// if (deputies.isEmpty()) {
		// System.out.println("don't have any deputy in fraction");
		// } else {
		//
		// System.out.println("list of deputies");
		//
		// for (Deputy deputy : deputies) {
		// System.out.println(deputy);
		// }
		//
		// }
	}

	public void cleanFraction() {
		// if (deputies.isEmpty()) {
		// System.out.println("don't have any deputy in fraction for clear");
		// } else {
		// deputies.clear();
		// System.out.println("fraction was clean");
		// }
	}

}
