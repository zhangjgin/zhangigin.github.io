public class TestExtends{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		
		dog.breed = "��ʿ��";
		dog.age = 3;
		dog.sex = "��";
		dog.furColor = "�Ұ�ɫ";
		
		System.out.println(dog.breed +"\t"+ dog.age +"\t"+ dog.sex +"\t"+ dog.furColor);
		
		
		Cat cat = new Cat();
		
	}
}


class Animal{
	String breed;//Ʒ��
	int age;//����
	String sex;//�Ա�
	
	public void eat(){}
	public void sleep(){}
}


class Dog extends Animal{
	String furColor;//ëɫ

	public void shout(){}
	public void run(){}
}


class Cat{
	String furColor;//ëɫ

	public void shout(){}
	public void climb(){}
}


class Fish{
	public void swim(){}
}


class Bird{
	String furColor;//ëɫ

	public void fly(){}
}
















