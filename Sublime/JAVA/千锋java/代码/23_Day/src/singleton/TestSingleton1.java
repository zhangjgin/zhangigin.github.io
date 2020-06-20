package singleton;

public class TestSingleton1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Singleton s = Singleton.getInstance();
		
		System.out.println(s);
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s2);
		
		//Class.forName("singleton.Singleton");
		
	}
}

//����ʽ�������̰߳�ȫ�������ʱ���������ã����õ�ʱ��Ҳ���ȴ�����ռ��һ�����Դ��
//class Singleton{
//	private static final Singleton instance = new Singleton();
//	
//	private Singleton(){}
//	
//	public static Singleton getInstance(){
//		return instance;
//	}
//}


//����ʽ��ʹ��ʱ�ٴ����������̲߳���ȫ��������
//class Singleton{
//	
//	private static Singleton instance = null;
//	
//	private Singleton(){}
//	
//	public synchronized static Singleton getInstance(){
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
//}

//����ʽ����ʱ�ٴ����������̰߳�ȫ
class Singleton{
	private Singleton(){}
	
	private static class Holder{
		static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return Holder.instance;
	}
}










