public class TestExtends{
	public static void main(String[] args){
		
		Dog dog = new Dog();
		
		dog.breed = "哈士奇";
		dog.age = 3;
		dog.sex = "公";
		dog.furColor = "灰白色";
		
		System.out.println(dog.breed +"\t"+ dog.age +"\t"+ dog.sex +"\t"+ dog.furColor);
		
		
		Cat cat = new Cat();
		
	}
}


class Animal{
	String breed;//品种
	int age;//年龄
	String sex;//性别
	
	public void eat(){}
	public void sleep(){}
}


class Dog extends Animal{
	String furColor;//毛色

	public void shout(){}
	public void run(){}
}


class Cat{
	String furColor;//毛色

	public void shout(){}
	public void climb(){}
}


class Fish{
	public void swim(){}
}


class Bird{
	String furColor;//毛色

	public void fly(){}
}
















