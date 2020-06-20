package chp9;

interface Light{
	void shine();
}

class Lamp{
	public void on(Light light){
		light.shine();
	}
}

public class TestLamp{
	public static void main(String args[]){
		Lamp lamp = new Lamp();
		//1: ʹ�þֲ��ڲ���
		class RedLight implements Light{
			public void shine(){
				System.out.println("shine in red");
			}
		}
		
		lamp.on(new RedLight());
		
		//2:ʹ�������ڲ���
		lamp.on(new Light(){
			public void shine(){
				System.out.println("shine in yellow");
			}
		});
	}
}

