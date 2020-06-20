public class TestOverride{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		dog.eat();
		
		
		Cat cat = new Cat();
		cat.eat();
		
		
		
	}
}

class Animal{
	String breed;
	int age;
	String sex;

	private void eat(){
		System.out.println("动物在吃...");
	}
	
	public void sleep(){
		System.out.println("睡...");
	}
}

class Dog extends Animal{
	String furColor;
	
	public void eat(){//重写、覆盖
		System.out.println("狗在狼吞虎咽的骨头...");
	}

	public void swim(){
		System.out.println("游...");
	}
}

class Cat extends Animal{
	String furColor;
	
	public void eat(){//重写、覆盖
		System.out.println("猫在细嚼慢咽的吃鱼...");
	}
	
	public void climb(){
		System.out.println("爬...");
	}
}

class Tiger extends Animal{

}
