public class TestObject{//测试类
	public static void main(String[] args){
		//数据类型 变量名 = 值;
		
		
		Dog myDog = new Dog();//创建对象 0x11223344
		
		//句点（的）
		myDog.breed = "哈士奇";
		myDog.age = 2;
		myDog.sex = "公";
		myDog.furColor = "灰白";
		
		System.out.println(myDog +"\t"+ myDog.breed +"\t"+ myDog.age +"\t"+ myDog.sex +"\t"+ myDog.furColor);
		
		
		
		Dog yourDog = new Dog();
		yourDog.breed = "萨摩";
		yourDog.age = 3;
		yourDog.sex = "母";
		yourDog.furColor = "白";
		
		
		System.out.println(yourDog +"\t"+ yourDog.breed +"\t"+ yourDog.age +"\t"+ yourDog.sex +"\t"+ yourDog.furColor);
		
	}
}


class Dog{//对象的模板（类）

	String breed;//品种
	int age;//年龄
	String sex;//性别
	String furColor;//毛色

}