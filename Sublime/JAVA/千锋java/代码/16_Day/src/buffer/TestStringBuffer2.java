package buffer;

public class TestStringBuffer2 {

	public static void main(String[] args) {

		String empName = "zhengchunguang";
		
		String email = appendEnds(empName);
		
		System.out.println(email);
	}

	public static String appendEnds(String emailName){
		//�ٶȹ�˾  @baidu.com.cn
		StringBuilder buffer = new StringBuilder(emailName);
		buffer.append("@baidu.com.cn");
		return buffer.toString();
	}
}
