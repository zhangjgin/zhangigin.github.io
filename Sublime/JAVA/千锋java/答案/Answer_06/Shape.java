package chp6;


//Shape���б��붨��girth������area������
//Ŀ����Ϊ���ܹ����Shape���͵����õ�������������

//Ҫע����ǣ����ܳ���������ķ�������������
//������������ʾ��ǰͼ�ε��ܳ��������
//��Ȼ�ǵ�ǰͼ�Σ����Ȼ����Ӧ������
//�����磬Բ���а뾶���ԣ��������б߳����ԣ�
//�����ܳ������ʱ��ֻ��Ҫʹ�ö�������ԣ�������Ҫ���⴫�ݲ�����

class Shape{
	public double girth(){
		return 0;
	}
	public double area(){
		return 0;
	}
}

class Circle extends Shape{
	private double radius;
	private double pi = 3.1415926;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return pi * radius * radius;
	}

	public double girth() {
		return 2 * pi * radius;
	}
}

class Rect extends Shape{
	private double a;
	private double b;
	
	public Rect(){}
	public Rect(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double area() {
		return a*b;
	}
	public double girth() {
		return 2*(a+b);
	}
}

class Square extends Rect{
	private double a;

	public Square(double a) {
		super();
		this.a = a;
	}

	public double area() {
		return a*a;
	}

	public double girth() {
		return 4*a;
	}
	
}
