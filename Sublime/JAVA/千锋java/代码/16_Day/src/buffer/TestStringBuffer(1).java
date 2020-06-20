package buffer;

public class TestStringBuffer {

	public static void main(String[] args) {
		/*
		String s1 = "abc";
		
		String s2 = "abc";
		
		String s3 = s2 + "def";
		
		String s4 = s3 + "ghi";
		
		
		String str = "";
		
		for (int i = 0; i < 100; i++) {
			str += i;
			System.out.println(str);
		}
		*/
		
		StringBuffer sBuffer = new StringBuffer();
		
		sBuffer.append("abc");
		
		sBuffer.append("def");
		
		sBuffer.append("ghi");
		
		
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 0; i < 100; i++) {
			buffer.append(i);
			System.out.println(buffer);
		}
	}

}
