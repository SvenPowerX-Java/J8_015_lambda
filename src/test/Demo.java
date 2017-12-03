package test;

public class Demo {
	public static void main(String[] args) {
		MyNumber myNum;
		myNum = ()->1234;
		
		System.out.println(myNum.getValue());
	}
}
