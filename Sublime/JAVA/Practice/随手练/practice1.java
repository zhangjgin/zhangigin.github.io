interface Arithmetic{
	public static final double PI = 3.14;
	public double perimeter();
	public double area();
}
class Square implements Arithmetic{
	double n;
	Square(double n){
		this.n = n;
	}
	public double perimeter(){
		return 4 * n; 
	}
	public double area(){
		return n * n;
	}
}
class Circle{
	double r;
	Circle(double r){
		this.r = r;
	}
	public double perimeter(){
		return 2 * Arithmetic.PI * r; 
	}
	public double area(){
		return Arithmetic.PI * r * r;
	}

}
public class practice1{
	public static void main(String[] args) {
		Square square = new Square(19.0);
		double p = square.perimeter();
		double a = square.area();
		System.out.println(p);
		System.out.println(a);

		Circle circle = new Circle(19.0);
		double p1 = circle.perimeter();
		double a1 = circle.area();
		System.out.println(p);
		System.out.println(a);

	}

}