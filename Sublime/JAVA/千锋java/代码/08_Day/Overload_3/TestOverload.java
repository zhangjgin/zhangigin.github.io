public class TestOverload{
	public static void main(String[] args){
		
		Printer p = new Printer();
		
		p.show("Hello");
		p.show(123);
		p.show('A');
		p.show(1.2);
		
		//����ʹ���ߵĲ���
		
		
		System.out.println();
	}
}

//��ӡ��
class Printer{
	//��ӡ�����
	public void show(int content){
		System.out.println(content);
	}
	
	
	public void show(double content){
		System.out.println(content);
	}
	
	public void show(char content){
		System.out.println(content);
	}
	
	
	public void show(String content){
		System.out.println(content);
	}
}