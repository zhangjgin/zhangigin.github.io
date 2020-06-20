public class TestPolymorphic{
	public static void main(String[] args){
		
		Dog dog = new Dog();//将狗当成狗看
		
		System.out.println(dog.breed +"\t"+ dog.age +"\t"+ dog.sex +"\t"+ dog.furColor);
		
		dog.eat();
		dog.sleep();
		dog.run();
		
		//--------------------------------------------------------------------------------
		
		Animal a = new Dog();//将狗当成动物看
		
		System.out.println(a.breed +"\t"+ a.age +"\t"+ a.sex);
		
		a.eat();
		a.sleep();
		
	}
}

class Animal{
	String breed;
	int age;
	String sex;
	
	public void eat(){
		System.out.println("动物在吃...");
	}
	
	public void sleep(){
		System.out.println("动物在睡...");
	}
}

class Dog extends Animal{
	
	String furColor;
	
	public void run(){
		System.out.println("狗在跑...");
	}
	
}