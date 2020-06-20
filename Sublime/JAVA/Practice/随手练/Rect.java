public class Rect{
	int width;
	int height;
	
	public Rect(int width,int height){
		this.width = width;
		this.height = height;
	}
	public Rect(){
		width = 10;
		height = 10;
	}
	public int area(){
		return width  *  height;
	}
	public int perimeter(){
		return 2*width + 2*height;
	}
	public static void main(String[] args){
		//Rect r = new Rect(20,30);
		Rect r = new Rect();
		int area = r.area();
		System.out.println("矩形的面积："+area);
		
		int perimeter = r.perimeter();
		System.out.println("矩形的周长是："+perimeter);
	}
}