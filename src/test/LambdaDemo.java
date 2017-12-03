package test;

public class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println("myNum.getValue() = " + myNum.getValue());
		
		myNum = () -> Math.random() * 100;
		
		System.out.println("myNum.getValue() = " + myNum.getValue());
		System.out.println("myNum.getValue() = " + myNum.getValue());
		
		myNum = () -> 2+2;
		
		System.out.println("myNum.getValue() = " + myNum.getValue());
		System.out.println("myNum.getValue() = " + myNum.getValue());
		
		
		
	}
}
