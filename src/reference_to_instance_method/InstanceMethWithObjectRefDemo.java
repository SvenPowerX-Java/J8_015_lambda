package reference_to_instance_method;

public class InstanceMethWithObjectRefDemo {
	static <T> int counter(T[] vals, MyFunc<T> f, T v){
		int count = 0;
		
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v))count++;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		int count;
		
		HighTemp[] weekDayHighs = {new HighTemp(89),new HighTemp(82),
				new HighTemp(90),new HighTemp(89),
				new HighTemp(89),new HighTemp(91),
				new HighTemp(84),new HighTemp(83)};
		
		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		System.out.println("Дней, когда максимальная температура была 89: " + count);
		HighTemp ob = new HighTemp(89);
		count = counter(weekDayHighs, HighTemp::lessThanTemp, ob);
		System.out.println("Дней, когда максимальная температура была меньше 89:" + count);
	}
}
