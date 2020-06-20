package generic;

public class TestAdvencedGeneric {
	public static void main(String[] args) {
		
		//实例泛型
		
		MyClass<Integer> mc = new MyClass<Integer>();
		mc.m1(123);
		
		MyClass<Double> mc2 = new MyClass<Double>();
		mc2.m1(2.2);
		
		MyInterface<Byte> mi = new MyImplClass();
		
		mi.m2( (byte)11 );
		
		
		//静态泛型
//		MyStaticClass.method(123);//Integer
//		
//		MyStaticClass.method(3.5);//Double
//		
//		MyStaticClass.method("Hello");//String
		
		
		MyStaticClass.method(new Dog());
		
//		MyStaticClass.method(new Cat());
		
	}
}

class MyStaticClass{
	
	public static <T extends Animal & Comparable> void method(T t){//用作排序
		
	}
	
}

abstract class Animal{}
class Dog extends Animal implements Comparable<Dog>{
	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Cat extends Animal{}


class MyClass<E>{// E = Element / E = Exception  T = Type  K = Key  V = Value 
	
	public void m1(E e){
		
	}
}

interface MyInterface<T>{
	public void m2(T t);
}

class MyImplClass implements MyInterface<Byte>{
	@Override
	public void m2(Byte t) {
		// TODO Auto-generated method stub
		
	}
}