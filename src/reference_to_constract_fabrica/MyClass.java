package reference_to_constract_fabrica;

public class MyClass<T> {
	private T val;
	
	MyClass(T v){val = v;}
	
	public MyClass() {val = null;	}
	
	public T getVal() {
		return val;
	}
}
