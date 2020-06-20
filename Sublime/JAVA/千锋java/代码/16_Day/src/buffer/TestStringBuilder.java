package buffer;

public class TestStringBuilder {

	public static void main(String[] args) {

		String str = "Hello";//定义字符串Hello
		
		str += "World";//将World追加给Hello
		
		//1.创建StringBuilder
		//2.调用append追加的方法
		//3.调用toString转换回String
		
		System.out.println(str);//打印追加后的str
		
	}

}
