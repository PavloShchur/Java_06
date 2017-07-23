package parlament_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Parlament {

	public static Map<Fraction, List<Deputy>> mapParlament = new ConcurrentHashMap<>();

	Deputy deputy = new Deputy();
	Fraction fraction = new Fraction();

	////////////////////////////////////////////////////////////////////////////////////////
	public void addFractionIntoParlament() {
		boolean work = true;

		System.out.println("Enter name of new fraction");
		String fractionName = Main.scanner.next();

		if (mapParlament.isEmpty() && work) {
			mapParlament.put(new Fraction(fractionName), new ArrayList<Deputy>());
			work = false;
		} else if (work) {
			for (Fraction entry : mapParlament.keySet()) {
				if (entry.getNameOFFraction().equals(fractionName) && work) {
					System.out.println("sorry");
				} else if (work) {
					mapParlament.put(new Fraction(fractionName), new ArrayList<Deputy>());
					System.out.println("Size: " + mapParlament.size());
					work = false;
				}
			}
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////
	public void deleteFractionFromParlament() {
		System.out.println("Enter name of new fraction which you want to delete.");
		String fractionName = Main.scanner.next();

		boolean work = true;

		Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(fractionName)) {
				iterator.remove();
				work = false;
			}
		}
		if (work == true) {
			System.out.println("Sorry delete");
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////
	public void cleanFraction() {
		System.out.println("Please enter title of fraction.");
		String title = Main.scanner.next();

		boolean work = true;

		for (Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (title.equals(entry.getKey().getNameOFFraction()) && work) {
				Collection<Deputy> deputies = (Collection<Deputy>) entry.getValue();
				Iterator<Deputy> iterator2 = deputies.iterator();
				while (iterator2.hasNext()) {
					iterator2.remove();
					work = false;
				}
			}
		}
	}

	///////////////////////////////////////////////////////////////////////////////
	public void showAllFractions() {
		System.out.println("showAllFraction(): " + mapParlament);
	}

	////////////////////////////////////////////////////////////////////////////////
	public void addDeputyIntoFraction() {
		System.out.println("Enter name of fraction");
		String nameFraction = Main.scanner.next();
		boolean work = true;

		Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
				System.out.println("Enter name of deputy");
				String name = Main.scanner.next();
				System.out.println("Enter surname of deputy");
				String surname = Main.scanner.next();
				System.out.println("Enter age of deputy");
				int age = Main.scanner.nextInt();
				System.out.println("Is this deputy briber or not?");
				boolean isBriber = Main.scanner.nextBoolean();
				entry.getValue().add(new Deputy(name, surname, age, isBriber));
				work = false;
			}
			work = false;
			if (work) {
				System.out.println("We don't have fraction with this name");
				work = false;
			}
		}
	}

	////////////////////////////////////////////////////////////////////////////////////
	public void deleteDeputyFromFraction() {
		System.out.println("Enter name of fraction from which you want to delete deputy");
		String title = Main.scanner.next();

		Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(title)) {
				System.out.println("Name of deputy");
				String nameOfDeputy = Main.scanner.next();
				List<Deputy> deputies = entry.getValue();
				Iterator<Deputy> iterator2 = deputies.iterator();
				while (iterator2.hasNext()) {
					Deputy deputy = iterator2.next();
					if (deputy.getName().equals(nameOfDeputy)) {
						iterator2.remove();
					}
				}
			}
		}

	}

	//////////////////////////////////////////////////////////////////////////
	public void showAllBribersInFraction() {

		System.out.println("Enter name of fraction");

		String nameFraction = Main.scanner.next();

		Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
				List<Deputy> deputies = entry.getValue();
				Iterator<Deputy> iterator2 = deputies.iterator();
				while (iterator2.hasNext()) {
					Deputy deputy = iterator2.next();
					if (deputy.isBriber() == true) {
						System.out.println(deputy.getName() + "  IN PRISON!!!!!!!!!!!!!!!");
					}
				}
			}
		}

	}

	/////////////////////////////////////////////////////////////////////////////
	public void showMaxBriberFromFraction() {

		System.out.println("Enter name of fraction");
		String nameFraction = Main.scanner.next();

		Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (entry.getKey().getNameOFFraction().equals(nameFraction)) {
				int maxBriber = 0;
				List<Deputy> deputies = entry.getValue();
				for (int i = 0; i < deputies.size(); i++) {
					if (deputies.get(i).getSizeOfBribe() > maxBriber) {
						System.out.println("FIX");
						maxBriber = deputies.iterator().next().getSizeOfBribe();
						System.out.println("Success: " + maxBriber);
					}

				}
			}

		}
	}

	//////////////////////////////////////////////////////////////////////////////
	public void showSomeFractionInParlament() {
		System.out.println("Name of fraction which you want to see.");
		String fractionName = Main.scanner.next();
		for (Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (fractionName.equals(entry.getKey().getNameOFFraction())) {
				System.out.println("showSomeFractionInParlament(): " + entry.getKey() + " " + entry.getValue());
			}
		}

	}

	/////////////////////////////////////////////////////////////////////////////////
	public void giveBribe() {

		int sizeOfBribe = 0;

		System.out.println("Name of fraction which you want to see.");
		String fractionName = Main.scanner.next();
		for (Iterator<Entry<Fraction, List<Deputy>>> iterator = mapParlament.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<Fraction, List<Deputy>> entry = iterator.next();
			if (fractionName.equals(entry.getKey().getNameOFFraction())) {
				System.out.println("Duputy name");
				String deputyName = Main.scanner.next();
				if (entry.getValue().iterator().next().getName().equals(deputyName)) {
					if (!entry.getValue().iterator().next().isBriber()) {
						System.out.println("This deputy doesn't take the bribe");
					} else {
						System.out.println("How many money you want to give this deputy");
						int money = Main.scanner.nextInt();
						if (money > 5000) {
							System.out.println("Police catch the briber.");
						} else {
							sizeOfBribe += money;
							entry.getValue().iterator().next().setSizeOfBribe(sizeOfBribe);
						}
					}
				} else {
					System.out.println("No deputy");
				}
			}

		}
	}
}
