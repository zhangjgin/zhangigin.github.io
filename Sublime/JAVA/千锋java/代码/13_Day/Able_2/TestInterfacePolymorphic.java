public class TestInterfacePolymorphic{
	public static void main(String[] args){
		
		�ο�() v = new �ο�();
		
		v.��������();
		
		
		new Student("����");
	}
}

class �ο�{
	
	public void xxx(Runnable r){// Runnable r = new Bus();
		
	}
	
	public void ��������(��Ư����){//ʹ�ýӿ���Ϊ�����βΣ�����Ȼ��ʵ�ֶ�̬
	
	}
	
	public void ��������(��){//ʹ�ø�����Ϊ�����βΣ�ʵ�ֶ�̬
	
	}
	
	/*
	public void ��������(�۹�����){
		
	}
	
	public void ��������(��ͧ){
		
	}
	
	public void ��������(ľ��){
		
	}
	*/
	
}


class Student{
	
	public void ���˻�����(�ỻ���ݵ� person){
		���� �ϵ��� = person.������();
	}
}

interface �ỻ���ݵ�{
	public �ϵ��� ������();
}


