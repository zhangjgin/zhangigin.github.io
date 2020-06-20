package objects;

public class TestGetClass {

	public static void main(String[] args) {

		Student s = new Student();
		
		System.out.println(s.getClass());
		
		Object o = new Object();
		
		System.out.println(o.getClass());
		
		Animal a = new Dog();
		
		System.out.println(a.getClass());
		
		//----------------------------------
		
		Animal a1 = new Cat();
		Object a2 = new Cat();
		
		/*
		if(a1 instanceof Dog){
			if(a2 instanceof Dog){
				
			}
		}else if(a1 instanceof Cat){
			if(a2 instanceof Cat){
				
			}
		}
		*/
		
		if(a1.getClass() == a2.getClass()){
			System.out.println("一样");
		}else{
			System.out.println("不一样");
		}
		
		
	}

}

class Student{}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird extends Animal{}



