interface Cal{
	public static final double PI = 3.14;
	public double getLong();
	public double getArea();
}
class Rect implements Cal{
	double r;
	public Rect(double r){
		this.r = r;
	}
	public double getLong(){
		return 4 * r;
	}
	public double getArea(){
		return r * r;
	}
}
class Circle implements Cal{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double getLong(){
		return 2*Cal.PI * r;
	}
	public double getArea(){
		return Cal.PI * r * r;
	}
}
public class TestCal{
	public static void main(String[] args){
		Rect rect = new Rect(10.0);
		double rectLong = rect.getLong();
		double rectArea = rect.getArea();
		System.out.println(rectLong);
		System.out.println(rectArea);
	}
}