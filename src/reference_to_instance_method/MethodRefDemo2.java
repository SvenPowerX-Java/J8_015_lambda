package reference_to_instance_method;

public class MethodRefDemo2 {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Лямбда-выражения повышают эффективность Java";
		String outStr;
		
		MyStringOps strOps = new MyStringOps();
		outStr = stringOp(strOps::strReverse, inStr);
		
		System.out.println("inStr = " + inStr);
		System.out.println("outStr = " + outStr);
	}
}
