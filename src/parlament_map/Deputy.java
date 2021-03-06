
package parlament_map;

import java.util.List;

public class Deputy extends Human {

	private String name;
	private String surname;
	private int age;
	private boolean briber;
	private int sizeOfBribe;

	List<Deputy> deputies;

	public Deputy() {
		super();
	}

	public Deputy(String name, String surname, int age, boolean briber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.briber = briber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBriber() {
		return briber;
	}

	public void setBriber(boolean briber) {
		this.briber = briber;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [name=" + name + ", surname=" + surname + ", age=" + age + ", briber=" + briber
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}

}
