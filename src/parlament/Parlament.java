package parlament;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Parlament {

	public static Map<Fraction, Deputy> mapParlament = new ConcurrentHashMap<Fraction, Deputy>();

	Deputy deputy = new Deputy();
	Fraction fraction = new Fraction();

	public void addFractionIntoParlament() {
		System.out.println("Enter name of new fraction");
		String fractionName = Main.scanner.next();

		boolean work = true;

		if (mapParlament.keySet().isEmpty() && work) {
			mapParlament.put(new Fraction(fractionName), deputy);
			work = false;
		} else {
			for (Map.Entry<Fraction, Deputy> entry : mapParlament.entrySet()) {
				if (entry.getKey().getNameOFFraction().equals(fractionName) && work) {
					System.out.println("sorry");
				} else if (work) {
					mapParlament.put(new Fraction(fractionName), deputy);
					System.out.println("Size: " + mapParlament.size());
					work = false;
				}
			}
		}

	}

	public void deleteFractionFromParlament() {
		System.out.println("Enter name of new fraction which you want to delete.");
		String fractionName = Main.scanner.next();

		boolean work = true;
		for (Iterator<Map.Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (fractionName.equals(entry.getKey().getNameOFFraction())) {
				iterator.remove();
				work = false;
			} else if (work) {
				System.out.println("Sorry delete");
				work = false;
			}
			work = false;
		}
	}

	public void cleanFraction() {
			Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
			System.out.println("Please enter title of fraction.");
			String title = Main.scanner.next();
			while (iterator.hasNext()) {
				Map.Entry<Fraction, Deputy> entry = iterator.next();
				Collection<Deputy> deputies = (Collection<Deputy>) entry.getValue();
				Iterator<Deputy> iterator2 = deputies.iterator();
				while (iterator2.hasNext()) {
					Deputy deputy = iterator2.next();
					if (deputy.getName().equalsIgnoreCase(title)) {
						iterator2.remove();
					}
				}
			}
		}

	public void showAllFraction() {
		System.out.println("showAllFraction(): " + mapParlament.keySet());

	}
	//
	// public void addDeputyIntoFraction() {
	// System.out.println("Enter name of fraction");
	//
	// String nameFraction = scannerParlament.next();
	//
	// boolean exist = false;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry = iterator.next();
	// if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
	// System.out.println("Enter name of deputy");
	// String name = scannerParlament.next();
	// System.out.println("Enter surname of deputy");
	// String surname = scannerParlament.next();
	// System.out.println("Enter age of deputy");
	// int age = scannerParlament.nextInt();
	// System.out.println("Is this deputy briber or not?");
	// boolean isBriber = scannerParlament.nextBoolean();
	// mapParlament.put(new Fraction(nameFraction), new Deputy(name, surname,
	// age,
	// isBriber));
	//
	// fraction.addDeputyIntoAFraction();
	// exist = true;
	// }
	//
	// if (!exist) {
	// System.out.println("don't have fraction with this name");
	// }
	// }
	//
	// }
	//
	// public void deleteDeputyFromFraction() {
	//
	// System.out.println("Enter name of deputy which ypu want to delete
	// deputy");
	//
	// String nameOfDeputy = scannerParlament.next();
	//
	// boolean exist = false;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry = iterator.next();
	// if (entry.getValue().getName().equals(nameOfDeputy)) {
	// iterator.remove();
	// exist = true;
	// }
	// }
	//
	// if (!exist) {
	// System.out.println("We don't have fraction with this name");
	// }
	//
	// }
	//

	//
	// }
	//
	// if (!exist) {
	// System.out.println("don't have fraction with this name");
	// }
	//
	// }
	//
	// public void showAllBribersInFraction() {
	//
	// System.out.println("Enter name of fraction");
	//
	// String nameFraction = scannerParlament.next();
	//
	// boolean exist = false;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry = iterator.next();
	// if (entry.getValue().isBriber() == true) {
	//
	// System.out.println(iterator.next().getValue());
	//
	// exist = true;
	// }
	//
	// }
	//
	// if (!exist) {
	// System.out.println("We don't have fraction with this name");
	// }
	//
	// }
	//
	// public void showMaxBriberFromFraction() {
	//
	// System.out.println("Enter name of fraction");
	//
	// String nameFraction = scannerParlament.next();
	//
	// boolean exist = false;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry = iterator.next();
	// if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
	// int maxBriber = 0;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator2 =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry2 = iterator.next();
	// if (maxBriber > entry2.getValue().getSizeOfBribe()) {
	// maxBriber = entry2.getValue().getSizeOfBribe();
	// System.out.println(entry2.getValue().getName());
	// }
	// }
	//
	// if (!exist) {
	// System.out.println("don't have fraction with this name");
	// }
	// }
	// }
	//
	// }
	//
	// public void showAlldeputyFromFraction() {
	//
	// System.out.println("Enter name of fraction ");
	//
	// String nameFraction = scannerParlament.next();
	//
	// boolean exist = false;
	//
	// Iterator<Entry<Fraction, Deputy>> iterator =
	// mapParlament.entrySet().iterator();
	// while (iterator.hasNext()) {
	// Map.Entry<Fraction, Deputy> entry = iterator.next();
	// if (entry.getValue().getName().equals(nameFraction)) {
	//
	// System.out.println(entry.getValue().getName());
	// if (!exist) {
	// System.out.println("don't have fraction with this name");
	// }
	// }
	// }
	//
}
