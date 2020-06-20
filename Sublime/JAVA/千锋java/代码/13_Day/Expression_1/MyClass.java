package p1;

//抽象类
public abstract class MyClass{
	
	//1.不能new对象（对象不能独立存在）
	static final String FIELD = "Hello";
	
	//2.抽象方法（子类必须覆盖）
	public abstract void method();
}