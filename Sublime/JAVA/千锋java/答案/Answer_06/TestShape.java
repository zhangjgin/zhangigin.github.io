package chp6;

public class TestShape {
	public static void main(String[] args){
		Shape[] ss = new Shape[3];
		ss[0] = new Circle(2);
		ss[1] = new Rect(3,4);
		ss[2] = new Square(3.5);
		for(int i = 0; i<ss.length; i++){
			System.out.println("girth : " + ss[i].girth() + "\t"+"area : " + ss[i].area());
		}
	}
}
