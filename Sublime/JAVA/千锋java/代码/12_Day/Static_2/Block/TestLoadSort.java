

public class TestLoadSort{
	public static void main(String[] args) throws Exception{
		
		
		
		
		//Class.forName("Sub");//��������һ����
		
		
		new Sub();
		
		new Sub();
	}
}


class Super{
	
	static String staticField = "���ྲ̬����";
	
	static{
		System.out.println(staticField);
		System.out.println("���ྲ̬�����");
	}
	
	String instanceField = "����ʵ������";
	
	{
		System.out.println(instanceField);
		System.out.println("����ʵ�������");
	}
	
	public Super(){
		System.out.println("���๹�췽��");
	}
	
}

class Sub extends Super{
	static String staticField2 = "���ྲ̬����";
	
	static{
		System.out.println(staticField2);
		System.out.println("���ྲ̬�����");
	}
	
	String instanceField2 = "����ʵ������";
	
	{
		System.out.println(instanceField2);
		System.out.println("����ʵ�������");
	}
	
	public Sub(){
		System.out.println("���๹�췽��");
	}
}