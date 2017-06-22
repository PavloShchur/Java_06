package parlament;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Parlament {

	public static Map<Fraction, Deputy> mapParlament = new ConcurrentHashMap<Fraction, Deputy>();
	 Scanner scannerParlament = new Scanner(System.in);

	Deputy deputy = new Deputy();
	Fraction fraction = new Fraction();
	

	public void addFractionIntoParlament() {
		System.out.println("Enter name of new fraction");
		String fractionName = scannerParlament.next();
		if (mapParlament.isEmpty()) {
			mapParlament.put(new Fraction(fractionName), deputy);
			System.out.println(mapParlament);
			System.out.println(mapParlament.size());
		} else {
			Iterator<Entry<Fraction, Deputy>> entryIterator = mapParlament.entrySet().iterator();
			while (entryIterator.hasNext()) {
				Entry<Fraction, Deputy> entry = entryIterator.next();
				if (entry.getKey().getNameOFFraction().equals(fractionName)) {
					System.out.println("Sorry, but we already have such a fraction.");
				} else {
					mapParlament.put(new Fraction(fractionName), deputy);
					System.out.println(mapParlament.size());
				}
			}
			System.out.println(mapParlament);
		}

	}

	public void showSomeFractionInParlament() {
		System.out.println("Enter name of new fraction");
		String fractionName = scannerParlament.next();
		boolean fractionExist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(fractionExist)) {
				System.out.println(entry.getKey().getNameOFFraction() + "\n" + entry.getValue().getName());
			}

			if (!fractionExist) {
				mapParlament.put(new Fraction(fractionName), new Deputy());
			}
		}
	}

	public void deleteFractionFromParlament() {

	}

	public void showAllFraction() {

	}

	public void addDeputyIntoFraction() {
		System.out.println("Enter name of fraction");

		String nameFraction = scannerParlament.next();

		boolean exist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
				System.out.println("Enter name of deputy");
				String name = scannerParlament.next();
				System.out.println("Enter surname of deputy");
				String surname = scannerParlament.next();
				System.out.println("Enter age of deputy");
				int age = scannerParlament.nextInt();
				System.out.println("Is this deputy briber or not?");
				boolean isBriber = scannerParlament.nextBoolean();
				mapParlament.put(new Fraction(nameFraction), new Deputy(name, surname, age, isBriber));

				fraction.addDeputyIntoAFraction();
				exist = true;
			}

			if (!exist) {
				System.out.println("don't have fraction with this name");
			}
		}

	}

	public void deleteDeputyFromFraction() {

		System.out.println("Enter name of deputy which ypu want to delete deputy");

		String nameOfDeputy = scannerParlament.next();

		boolean exist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getValue().getName().equals(nameOfDeputy)) {
				iterator.remove();
				exist = true;
			}
		}

		if (!exist) {
			System.out.println("We don't have fraction with this name");
		}

	}

	public void cleanFraction() {

		System.out.println("enter name of fraction for clean");

		String nameFraction = scannerParlament.next();

		boolean exist = false;

		for (Fraction fraction : fraction.getFractions()) {

			if (fraction.getNameOFFraction().equalsIgnoreCase(nameFraction)) {

				fraction.cleanFraction();
				exist = true;
			}

		}

		if (!exist) {
			System.out.println("don't have fraction with this name");
		}

	}

	public void showAllBribersInFraction() {

		System.out.println("Enter name of fraction");

		String nameFraction = scannerParlament.next();

		boolean exist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getValue().isBriber() == true) {

				System.out.println(iterator.next().getValue());

				exist = true;
			}

		}

		if (!exist) {
			System.out.println("We don't have fraction with this name");
		}

	}

	public void showMaxBriberFromFraction() {

		System.out.println("Enter name of fraction");

		String nameFraction = scannerParlament.next();

		boolean exist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
				int maxBriber = 0;

				Iterator<Entry<Fraction, Deputy>> iterator2 = mapParlament.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry<Fraction, Deputy> entry2 = iterator.next();
					if (maxBriber > entry2.getValue().getSizeOfBribe()) {
						maxBriber = entry2.getValue().getSizeOfBribe();
						System.out.println(entry2.getValue().getName());
					}
				}

				if (!exist) {
					System.out.println("don't have fraction with this name");
				}
			}
		}

	}

	public void showAlldeputyFromFraction() {

		System.out.println("Enter name of fraction ");

		String nameFraction = scannerParlament.next();

		boolean exist = false;

		Iterator<Entry<Fraction, Deputy>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Fraction, Deputy> entry = iterator.next();
			if (entry.getValue().getName().equals(nameFraction)) {

				System.out.println(entry.getValue().getName());
				if (!exist) {
					System.out.println("don't have fraction with this name");
				}
			}
		}

	}

}
