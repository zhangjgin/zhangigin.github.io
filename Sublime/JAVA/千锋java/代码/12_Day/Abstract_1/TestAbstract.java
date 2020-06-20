public class TestAbstract{
	public static void main(String[] args){
		//new Animal();//Error 不能独立存在1
		
		Animal a = new Dog();//Correct

		a.eat();
	
		Animal a2 = new Cat();
		
		a2.eat();
		
		
		
	}
}

abstract class Animal{//逻辑：不够完整、不够具体
	String breed;
	int age;
	String sex;
	
	public Animal(){
		System.out.println("---Animal()---");
	}
	
	public abstract void eat();//抽象方法：只有声明、没有实现（不够完整）
	
	
	public void sleep(){}
}


class Dog extends Animal{
	String furColor;

	public Dog(){
		super();
		System.out.println("---Dog()---");
	}
	
	public void eat(){
		System.out.println("狗在吃骨头...");
	}
}


abstract class Cat extends Animal{
	
	public void eat(){
		System.out.println("猫在吃鱼...");
	}
}





