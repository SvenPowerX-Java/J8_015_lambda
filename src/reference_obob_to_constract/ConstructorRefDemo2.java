package reference_obob_to_constract;

public class ConstructorRefDemo2 {
	public static void main(String[] args) {
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;
			MyClass<Integer> mc = myClassCons.func(100);
		System.out.println("Значение val в обьеекте mc равно " +
		mc.getVal());
	}
}
