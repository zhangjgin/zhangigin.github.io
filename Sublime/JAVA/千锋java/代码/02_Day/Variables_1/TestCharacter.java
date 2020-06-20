public class TestCharacter{
	public static void main(String[] args){
		//short 2Byte 16bit	有符号数	-2^15 ~ 2^15-1   -32768 ~ 32767
		//char	2Byte 16bit	无符号数 	0 ~ 2^16-1		 0 ~ 65535
		
		short s = 65;
		
		char c = (char)s;
		
		System.out.println(c);
	}
}
