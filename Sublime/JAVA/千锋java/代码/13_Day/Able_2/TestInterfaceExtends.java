public class TestInterfaceExtends{
	public static void main(String[] args){
		/*
		int currentLight = State.GREEN;
		
		
		if(currentLight == State.GREEN){
			currnetLight = State.YELLOW;
		}else if(currentLight == State.YELLOW){
			currentLight = State.RED;
		}else{
			currentLight = State.GREEN;
		}
		*/
		
		Light currentLight = Light.BLACK;//������State���еĺ��̵ƹ淶״̬�е�ĳ��ֵ
		
		System.out.println(currentLight);
	}
}

//ö�٣��淶��ȡֵ�����ͣ�
enum Light{
	GREEN , YELLOW , RED
}


//�����ӿ�
interface State{
	public static final int RED = 1;
	int YELLOW = 2;
	int GREEN = 3;
}


interface IA{
	
	public static final int A = 10;
	
	void m1();
}

interface IB {
	void m2();
}

interface IC extends IA , IB {
	void m3();
}

class classD implements IC{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	
}



