public class TestConstractor2{
	public static void main(String[] args){
		/*
		Teacher t1 = new Teacher();//0x11223344
		
		t1.name = "Annie";
		t1.age = 25;
		t1.sex = "女";
		t1.salary = 3000D;
		
		System.out.println(t1.name +"\t"+ t1.age +"\t"+ t1.sex +"\t"+ t1.salary);
		
		*/
		
		
		Teacher t2 = new Teacher("Marry" , 28 , "女" , 4000D);//0x33445566
		
		System.out.println(t2.name +"\t"+ t2.age +"\t"+ t2.sex +"\t"+ t2.salary);
		

		
		Teacher t3 = new Teacher("Eric" , 23 , "男");
		
		System.out.println(t3.name +"\t"+ t3.age +"\t"+ t3.sex +"\t"+ t3.salary);
	
	
	
		Teacher t4 = new Teacher("Vicky" , "女");
		
		System.out.println(t4.name +"\t"+ t4.age +"\t"+ t4.sex +"\t"+ t4.salary);
		
	}
}

//this = //0x33445566
class Teacher{
	String name;
	int age;
	String sex;
	double salary;
	
	//无参构造
	public Teacher(){
		System.out.println("---Teacher() Executed---");
	}
	
	
	
	
	
	public Teacher(String name , String sex){
		this();
		this.name = name;
		this.sex = sex;
	}
	
	
	//有参构造
	public Teacher(String name , int age , String sex){
		//System.out.println("---Teacher(String n , int a , String s) Executed---");
		this(name , sex);
		this.age = age;
	}
	
	
	//有参构造
	public Teacher(String name , int age , String sex , double salary){
		//逻辑第1行（初始化属性）
		//逻辑第2行（执行构造方法中的代码）
		//System.out.println("---Teacher(String n , int a , String s , double sa) Executed---");
		
		this(name , age , sex);//调用三参构造方法
		this.salary = salary;
	}
	
	
	
}






