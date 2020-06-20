package strings;

public class TestStringMethods {

	public static void main(String[] args) {

		String s1 = "HelloWorld";
		
		//System.out.println(s1.charAt(4));
		
		//System.out.println(s1.contains("Hello"));
		
		
		//char[] chs = s1.toCharArray();
		
		/*for(int i = 0 ; i < chs.length ; i++){
			chs[i] = 'A';
			System.out.print(chs[i]);
		}*/
		
		System.out.println( s1.indexOf('o') );
		
		System.out.println( s1.indexOf("llo") );
		
		System.out.println( s1.indexOf('l',4) );
		
		s1.length();
		
		String s2 = "           Hello        World                      ";
		
		System.out.println(s2.trim());
		
		String s3 = s1.toUpperCase();
		String s4 = s1.toLowerCase();
		
		System.out.println( s3.equals(s4) );
		System.out.println( s3.equalsIgnoreCase(s4) );
		
		
		String fileName = "helloWorld.class";
		
		System.out.println( fileName.endsWith(".java") );
		System.out.println( fileName.startsWith("Hello") );
		
		
		System.out.println(s1.replace('o', '0'));
		System.out.println(s1.replace("o", "000"));
		
		String s5 = "人生就像一场戏，因为有缘才相聚，相扶到老不容易，是否更该去珍惜";
		
		String[] strs = s5.split("，");
		
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		//HelloWorld
		String s6 = s1.substring(3,8);
		
		System.out.println(s6);
		
		
		int[] nums = new int[0];
		
	}

}
