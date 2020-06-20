package strings;

public class TestString {

	public static void main(String[] args) {
		
		String s3 = new String("abc");//2
		
		String s1 = "abc";//0

		String s2 = "abc";//0
		
		System.out.println(s1 == s2);
		
		System.out.println(s1 == s3);
		
	}
}
