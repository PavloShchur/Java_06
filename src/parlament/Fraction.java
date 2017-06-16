package parlament;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Fraction {

	private List<Fraction> fractions = new ArrayList<Fraction>();
	
	
	
	private String nameOFFraction;

	public String getNameOFFraction() {
		return nameOFFraction;
	}

	public void setNameOFFraction(String nameOFFraction) {
		this.nameOFFraction = nameOFFraction;
	}

	public List<Deputy> getDeputies() {
		return deputies;
	}

	public void setDeputies(List<Deputy> deputies) {
		this.deputies = deputies;
	}
	
	

	

	public List<Fraction> getFractions() {
		return fractions;
	}

	public void setFractions(List<Fraction> fractions) {
		this.fractions = fractions;
	}

	public Fraction() {
		super();
	}

	public Fraction(String nameOFFraction, List<Deputy> deputies) {
		super();
		this.nameOFFraction = nameOFFraction;
		this.deputies = deputies;
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "Fraction [nameOFFraction=" + nameOFFraction + ", deputies=" + deputies + ", fractions=" + fractions
				+ "]";
	}



	private List<Deputy> deputies = new ArrayList<>();

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

//		Deputy deputy = new Deputy(age, briber, sizeOfBribe);
//		deputy.giveBribe();
//		deputies.add(deputy);

	}

	public void deleteDeputyFromFraction() {
		System.out.println("enter name of deputy for remove");
		String name = Main.scanner.next();
		System.out.println("enter surname of deputy for remove");
		String surname = Main.scanner.next();

		Iterator<Deputy> iterator = deputies.iterator();

		boolean deleted = false;

		while (iterator.hasNext()) {
			Deputy deputy = iterator.next();

			if (deputy.getName().equalsIgnoreCase(name) && deputy.getSurname().equalsIgnoreCase(surname)) {
				iterator.remove();
				deleted = true;
			}

		}
		if (!deleted) {
			System.out.println("does'n have deputy for delete");
		}

	}

	public void showAllBriberFromFraction() {

		boolean existBriber = false;

		if (deputies.isEmpty()) {
			System.out.println("doesn't have any deputies");
		} else {

			for (Deputy deputy : deputies) {
				if (deputy.isBriber()) {
					System.out.println(deputy);
					existBriber = true;
				}
			}

			if (!existBriber) {
				System.out.println("don't have briber in fraction");
			}
		}

	}

	public void showMaxBriberTakerFromFraction() {

		Deputy deputy;
		if (deputies.isEmpty()) {
			System.out.println("don't have any deputy in fraction");
		} else {

			deputy = deputies.get(0);

			for (Deputy currentDeputy : deputies) {

				if (currentDeputy.getSizeOfBribe() > deputy.getSizeOfBribe()) {
					deputy = currentDeputy;
				}

			}

			System.out.println("max briber = " + deputy);

		}

	}

	public void showAllDeputyFromFraction() {
		if (deputies.isEmpty()) {
			System.out.println("don't have any deputy in fraction");
		} else {

			System.out.println("list of deputies");

			for (Deputy deputy : deputies) {
				System.out.println(deputy);
			}

		}
	}

	public void cleanFraction() {
		if (deputies.isEmpty()) {
			System.out.println("don't have any deputy in fraction for clear");
		} else {
			deputies.clear();
			System.out.println("fraction was clean");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deputies == null) ? 0 : deputies.hashCode());
		result = prime * result + ((nameOFFraction == null) ? 0 : nameOFFraction.hashCode());
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
		Fraction other = (Fraction) obj;
		if (deputies == null) {
			if (other.deputies != null)
				return false;
		} else if (!deputies.equals(other.deputies))
			return false;
		if (nameOFFraction == null) {
			if (other.nameOFFraction != null)
				return false;
		} else if (!nameOFFraction.equals(other.nameOFFraction))
			return false;
		return true;
	}

	public Fraction(String nameOFFraction) {
		super();
		this.nameOFFraction = nameOFFraction;
	}

	public Fraction(List<Fraction> fractions, String nameOFFraction, List<Deputy> deputies) {
		super();
		this.fractions = fractions;
		this.nameOFFraction = nameOFFraction;
		this.deputies = deputies;
	}

}
