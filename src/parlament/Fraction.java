package parlament;

import java.util.ArrayList;
import java.util.List;

public class Fraction {

	private List<Fraction> fractions  = new ArrayList<Fraction>();
	

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fractions == null) ? 0 : fractions.hashCode());
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
		if (fractions == null) {
			if (other.fractions != null)
				return false;
		} else if (!fractions.equals(other.fractions))
			return false;
		if (nameOFFraction == null) {
			if (other.nameOFFraction != null)
				return false;
		} else if (!nameOFFraction.equals(other.nameOFFraction))
			return false;
		return true;
	}

}
