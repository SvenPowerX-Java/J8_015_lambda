package reference_to_instance_method;

public class MyStringOps {
	String strReverse(String str) {
		String result = "";
		int i;
		
		for (i = str.length()-1; i>= 0; i--)
			result +=str.charAt(i);
		return result;
	}
}
