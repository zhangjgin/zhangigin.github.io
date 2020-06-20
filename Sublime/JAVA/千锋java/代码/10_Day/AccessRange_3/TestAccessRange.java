package p1;

import p1.Father;
import p1.Son;

public class TestAccessRange{
	public static void main(String[] args){
		
		Father f = new Father();
		
		//f.sayHi();//公开的方法，任何位置都可以访问
		
		System.out.println(f.field);//AccessRange与Father在同包中，允许访问
		
		//Son son = new Son();
		
		//son.method();
	}
}