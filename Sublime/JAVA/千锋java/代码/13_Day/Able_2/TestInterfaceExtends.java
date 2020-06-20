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
		
		Light currentLight = Light.BLACK;//必须是State当中的红绿灯规范状态中的某个值
		
		System.out.println(currentLight);
	}
}

//枚举（规范了取值的类型）
enum Light{
	GREEN , YELLOW , RED
}


//常量接口
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



