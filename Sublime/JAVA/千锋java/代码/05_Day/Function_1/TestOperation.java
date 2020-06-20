import java.util.Scanner;
public class TestOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入用户名：");
		String username = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		
		login(username,password);
		
		
		/*
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println( s1.equals(s2) );
		System.out.println( s1.equals(s3) );
		 */
	}
	
	//登录功能
	//接收用户传入的“用户名”和“密码”进行元数据的对比
	public static void login(String uname , String pwd){

		//aaron123  123456
		
		if( "aaron123".equals(uname) && "123456".equals(pwd) ){//equals 等价于 ==，但判断的是字符串的内容
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
	}
}