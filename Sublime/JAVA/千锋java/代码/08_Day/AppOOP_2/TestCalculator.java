public class TestCalculator{
	public static void main(String[] args){
		//创建两个计算器对象
		
		Calculator calc1 = new Calculator();
		
		calc1.breed = "HP";
		
		
		//System.out.println( calc1.add(5,6) );
		
		
		Calculator calc2 = new Calculator();
		
		calc2.breed = "SONY";
		
		//System.out.println( calc2.add(11.5,12.0) );
		
		
		//5.5 6.6 7.7
		
		
		double temp = calc2.add(5.5 , 6.6);
		
		double finalResult = calc2.add(temp , 7.7);
	
		System.out.println(finalResult);
		
		
		System.out.println(calc2.add(5.5,6.6,7.7));
		
		
		add(5,6);
	}
}


//计算器的模板（类）
class Calculator{
	
	String breed;//品牌
	
	public double add(double a , double b){
		System.out.println("add(double a , double b)");
		return a + b;
	}
	
	public double add(double a , double b , double c){
		System.out.println("add(double a , double b , double c)");
		return a + b + c;
	}
	
	public double subtract(double a , double b){
		return a - b;
	}
	
	public double multiply(double a , double b){
		return a * b;
	}
	
	public double devide(double a , double b){
		return a / b;
	}
}