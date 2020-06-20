public class TestInterfacePolymorphic{
	public static void main(String[] args){
		
		游客() v = new 游客();
		
		v.出海游玩();
		
		
		new Student("王慧");
	}
}

class 游客{
	
	public void xxx(Runnable r){// Runnable r = new Bus();
		
	}
	
	public void 出海游玩(可漂浮的){//使用接口作为方法形参，更自然的实现多态
	
	}
	
	public void 出海游玩(船){//使用父类作为方法形参，实现多态
	
	}
	
	/*
	public void 出海游玩(观光游轮){
		
	}
	
	public void 出海游玩(快艇){
		
	}
	
	public void 出海游玩(木筏){
		
	}
	*/
	
}


class Student{
	
	public void 求人换灯泡(会换灯泡的 person){
		灯泡 废灯泡 = person.换灯泡();
	}
}

interface 会换灯泡的{
	public 废灯泡 换灯泡();
}


