public class TestAbstract{
	public static void main(String[] args){
		//new Animal();//Error ���ܶ�������1
		
		Animal a = new Dog();//Correct

		a.eat();
	
		Animal a2 = new Cat();
		
		a2.eat();
		
		
		
	}
}

abstract class Animal{//�߼���������������������
	String breed;
	int age;
	String sex;
	
	public Animal(){
		System.out.println("---Animal()---");
	}
	
	public abstract void eat();//���󷽷���ֻ��������û��ʵ�֣�����������
	
	
	public void sleep(){}
}


class Dog extends Animal{
	String furColor;

	public Dog(){
		super();
		System.out.println("---Dog()---");
	}
	
	public void eat(){
		System.out.println("���ڳԹ�ͷ...");
	}
}


abstract class Cat extends Animal{
	
	public void eat(){
		System.out.println("è�ڳ���...");
	}
}





