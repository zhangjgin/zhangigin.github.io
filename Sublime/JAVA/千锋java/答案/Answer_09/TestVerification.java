package test;


public class TestVerification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABCDEFGhijklmn1234567";
		
		java.util.Random random = new java.util.Random();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(21);
			char ch = str.charAt(index);
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
