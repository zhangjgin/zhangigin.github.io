package p2;

import p1.Father;

public class Son extends Father{
	
	public void method(){
		
		System.out.println(field);//通过继承的方式访问父类的属性
		
	}
}