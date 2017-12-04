package lambda_exeption;

public class LambdaExeptionDemo {
	public static void main(String[] args) throws EmptyArrayException {
		
		double[] values = {1., 2., 3., 4.};
		
		DoubleNumericArrayFunc average = (n) ->{
			double sum = 0;
			
			if (n.length == 0)
				throw new EmptyArrayException();
			
			for (int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			return sum/n.length;
		};
		System.out.println("Среднее равно average.func(values) = "
				+ average.func(values));
//		System.out.println("average.func(new double[0]) = "
//				+ average.func(new double[0]));
	}
}
