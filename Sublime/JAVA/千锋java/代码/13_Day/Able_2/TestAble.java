public class TestAble{
	public static void main(String[] args){
		
		//����һ�ֶ���ѹ����ɶ�����������
		Animal a = new Dog();//��������ָ��֮����󣨶�̬��
		
		//����һ�ֻ��ܵĶ������ѹ�����һ�ֻ��ܵĶ�����������
		Runnable r = new Dog();//�ӿ�����ָ��ʵ������󣨸���Ȼ�Ķ�̬��
		
		r.run();
		
		
		Runnable r2 = new Bus();
		
		r2.run();
		
		
		//r�д洢��һ�����ܵĶ���������Ҫ���ýӿ����������
		//���䣨����ת�ͣ�
		Dog myDog = (Dog)r;
		
		myDog.eat();
		myDog.sleep();
		myDog.swim();
	}
}


abstract class Animal{
	String breed;
	int age;
	String sex;
	
	//���󷽷����涨���������ڵ���Ϊ���淶�˸���Ϊ�ľ���Ҫ��
	public abstract void eat();
	public abstract void sleep();
}


class Dog extends Animal implements Runnable , Swimmable{//ʵ��
	String furColor;
	
	public void eat(){}
	public void sleep(){}
	public void run(){
		System.out.println("���ڷɱ�...");
	}
	public void swim(){}
}

class Cat extends Animal implements Runnable{
	String furColor;
	
	public void eat(){}
	public void sleep(){}
	public void run(){}
}

class Bird extends Animal implements Runnable{
	String furColor;
	
	public void eat(){}
	public void sleep(){}
	public void run(){}
}


class Fish extends Animal implements Swimmable{
	
	public void eat(){}
	public void sleep(){}
	public void swim(int a){}
}




//�ӿ���һ������
interface Runnable{
	//�ӿڣ��еķ�������һ��Լ��
	public abstract void run();
}



interface Swimmable{
	public abstract void swim();
}



class Bus implements Runnable{
	public void run(){
		System.out.println("��100/H���ٶȿ��...");
	}
}



