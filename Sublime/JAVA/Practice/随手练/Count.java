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
		return 4*r;
	}
	public double getArea(){
		return r*r;
	}
}
class Circle implements Cal{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double getLong(){
		return 2*Cal.PI*r;
	}
	public double getArea(){
		return Cal.PI*r*r;
	}
}
public class Count{
	public static void main(String[] args){
		Rect rect = new Rect(10.0);
		double rectlong = rect.getLong();
		double rectarea = rect.getArea();
		System.out.println("正方体周长" + rectlong);
		System.out.println("正方体面积" + rectarea);

	}
}