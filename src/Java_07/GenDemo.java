package Java_07;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("��������: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("���� ������������");
		strOb.showType();
		
		String string = strOb.getOb();
		System.out.println("��������: " + string);
	}
	

}
