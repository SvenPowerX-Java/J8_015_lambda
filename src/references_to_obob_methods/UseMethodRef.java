package references_to_obob_methods;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodRef {
	// compare(), совместимый с аналогичным методом
	// определённым в интерфейсе Comparator<T>
	
	static int compareMC(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}
	
	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		
		al.add(new MyClass(1));
		al.add(new MyClass(4));
		al.add(new MyClass(2));
		al.add(new MyClass(9));
		al.add(new MyClass(3));
		al.add(new MyClass(7));
		
		MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
		
		System.out.println("Максимальное значение равно: " +
				maxValObj.getVal());
	}
}