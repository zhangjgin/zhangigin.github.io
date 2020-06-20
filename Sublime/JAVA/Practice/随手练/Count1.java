interface Cal{
	public double getLong();
	
	public double getArea();
}
class Rect implements Cal{
	double r;
	 Rect(double r){
		this.r  =  r;
	}
	public double getLong(){
		return 4 * r;
	}
	public double getArea(){
		return r * r;
	}
}
public class Count1{
	public static void main(String[] args){
		Rect rect = new Rect(10.0);
		double llong = rect.getLong();
		double tarea = rect.getArea();
		System.out.println( llong);
		System.out.println( tarea);
	}
}