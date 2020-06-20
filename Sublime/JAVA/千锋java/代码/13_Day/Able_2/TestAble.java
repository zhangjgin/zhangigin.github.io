public class TestAble{
	public static void main(String[] args){
		
		//狗是一种动物（把狗当成动物来看待）
		Animal a = new Dog();//父类引用指向之类对象（多态）
		
		//狗是一种会跑的东西（把狗当成一种会跑的东西来看到）
		Runnable r = new Dog();//接口引用指向实现类对象（更自然的多态）
		
		r.run();
		
		
		Runnable r2 = new Bus();
		
		r2.run();
		
		
		//r中存储了一个会跑的东西，我需要调用接口以外的内容
		//拆箱（向下转型）
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
	
	//抽象方法（规定子类必须存在的行为、规范了该行为的具体要求）
	public abstract void eat();
	public abstract void sleep();
}


class Dog extends Animal implements Runnable , Swimmable{//实现
	String furColor;
	
	public void eat(){}
	public void sleep(){}
	public void run(){
		System.out.println("狗在飞奔...");
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




//接口是一种能力
interface Runnable{
	//接口（中的方法）是一种约定
	public abstract void run();
}



interface Swimmable{
	public abstract void swim();
}



class Bus implements Runnable{
	public void run(){
		System.out.println("以100/H的速度狂飙...");
	}
}



