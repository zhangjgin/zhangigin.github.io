//定义包：明确该文件的.class文件的目录结构

//package p1;

//1.引入包
import java.util.Scanner; // import java.util.*;


public class TestScanner{
	public static void main(String[] args){
		
		//2.创建Scanner类型的变量，并赋值
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入内容：");
		
		//int num = input.nextInt();//将控制台获取到的一个整数值，赋值给num变量
		
		//double num = input.nextDouble();//接收小数
		
		//String num = input.next();//接收字符串
		
		char num = input.next().charAt(0);//接收首个字符
		
		System.out.println("您录入的值为：" + num);
	}
}