package Java_07;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("значення: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Тест узагальнення");
		strOb.showType();
		
		String string = strOb.getOb();
		System.out.println("Значення: " + string);
	}
	

}
