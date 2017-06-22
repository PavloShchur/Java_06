package parlament;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Parlament {

	public static Map<Fraction, Deputy> mapParlament = new HashMap<Fraction, Deputy>();

	Deputy deputy = new Deputy();
	Fraction fraction = new Fraction();

	public void addFractionIntoParlament() {
		System.out.println("Enter name of new fraction");
		String fractionName = Main.scanner.next();

		
		if(mapParlament.isEmpty()){
			System.out.println("1");
			mapParlament.put(new Fraction(fractionName), deputy);
			System.out.println("2");
		} else {
			System.out.println("3");
		for(Map.Entry<Fraction, Deputy> entry : mapParlament.entrySet()) {
			System.out.println("4");
				if(entry.getKey().getNameOFFraction().equals(fractionName)){
					System.out.println("5");
					System.out.println("sorry");
					System.out.println("6");
				} else {
					System.out.println("7");
					mapParlament.put(new Fraction(fractionName), deputy);
					System.out.println("8");
					System.out.println("Size: " + mapParlament.size());
					System.out.println("9");
					System.out.println("10");
					break;


				}
				System.out.println("11");
			}
			}
		
		
		}
		}

//
//
// public void deleteFractionFromParlament() {
//
// }
//
// public void showAllFraction() {
//
// }
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
// mapParlament.put(new Fraction(nameFraction), new Deputy(name, surname, age,
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
// System.out.println("Enter name of deputy which ypu want to delete deputy");
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
// public void cleanFraction() {
//
// System.out.println("enter name of fraction for clean");
//
// String nameFraction = scannerParlament.next();
//
// boolean exist = false;
//
// for (Fraction fraction : fraction.getFractions()) {
//
// if (fraction.getNameOFFraction().equalsIgnoreCase(nameFraction)) {
//
// fraction.cleanFraction();
// exist = true;
// }
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
// }
