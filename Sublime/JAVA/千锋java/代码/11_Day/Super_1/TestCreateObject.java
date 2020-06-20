public class TestCreateObject{
	public static void main(String[] args){
		
		Baby baby = new Baby();
		
		System.out.println(baby.a);
		System.out.println(baby.b);
		System.out.println(baby.c);
		
		baby.m1();
		baby.m2();
		
	}
}

class Daddy{
	int a;
	int b;
	
	public void m1(){}
}

class Baby extends Daddy{
	int c;
	
	public void m2(){}
}