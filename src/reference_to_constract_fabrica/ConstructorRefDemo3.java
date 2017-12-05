package reference_to_constract_fabrica;

public class ConstructorRefDemo3 {
	static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
		return cons.func(v);
	}
	
	public static void main(String args[]) {
		MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;
		
		MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
		
		System.out.println("Значение val в обьекте mc равно " + mc.getVal());
		
		MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
		
		MyClass2 mc2 =  myClassFactory (myClassCons2, "Лямбда");
		
		System.out.println("mc2.getVal() = " + mc2.getVal());
		
		MyArrayCreator<MyClass[]> mcArrayCons = MyClass[]::new;
		MyClass[] a = mcArrayCons.func(2);
		a[0] = new MyClass(1);
		a[1] = new MyClass(2);
		
		for (MyClass myA :
				a) {
			System.out.println("myA = " + myA.getVal());
		}
		
	}
}
