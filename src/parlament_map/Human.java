package parlament_map;

public class Human {

	private double weight;
	private int height;

	public Human() {
		super();
	}

	public Human(double weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", height=" + height + "]";
	}

	

}
