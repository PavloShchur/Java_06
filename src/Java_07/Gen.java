package Java_07;

public class Gen<T> {
	protected T ob;

	public Gen(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void showType() {
		System.out.println("Типом Т є " + ob.getClass().getName());
	}
	
}
