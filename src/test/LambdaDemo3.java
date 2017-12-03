package test;

public class LambdaDemo3 {
	public static void main(String[] args) {
		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		
		if(isFactor.test(10,2))
			System.out.println("2 является множителем числа10");
		if(!isFactor.test(10,3))
			System.out.println("3 неявляется множителем числа 10");
		
	}
}
