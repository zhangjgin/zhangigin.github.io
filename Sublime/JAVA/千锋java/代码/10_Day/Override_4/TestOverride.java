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
		System.out.println("�����ڳ�...");
	}
	
	public void sleep(){
		System.out.println("˯...");
	}
}

class Dog extends Animal{
	String furColor;
	
	public void eat(){//��д������
		System.out.println("�������̻��ʵĹ�ͷ...");
	}

	public void swim(){
		System.out.println("��...");
	}
}

class Cat extends Animal{
	String furColor;
	
	public void eat(){//��д������
		System.out.println("è��ϸ�����ʵĳ���...");
	}
	
	public void climb(){
		System.out.println("��...");
	}
}

class Tiger extends Animal{

}
