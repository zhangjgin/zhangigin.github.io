public class TestPolymorphic{
	public static void main(String[] args){
		
		Dog dog = new Dog();//�������ɹ���
		
		System.out.println(dog.breed +"\t"+ dog.age +"\t"+ dog.sex +"\t"+ dog.furColor);
		
		dog.eat();
		dog.sleep();
		dog.run();
		
		//--------------------------------------------------------------------------------
		
		Animal a = new Dog();//�������ɶ��￴
		
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
		System.out.println("�����ڳ�...");
	}
	
	public void sleep(){
		System.out.println("������˯...");
	}
}

class Dog extends Animal{
	
	String furColor;
	
	public void run(){
		System.out.println("������...");
	}
	
}