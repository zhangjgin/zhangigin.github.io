package p1;

import p1.Father;
import p1.Son;

public class TestAccessRange{
	public static void main(String[] args){
		
		Father f = new Father();
		
		//f.sayHi();//�����ķ������κ�λ�ö����Է���
		
		System.out.println(f.field);//AccessRange��Father��ͬ���У��������
		
		//Son son = new Son();
		
		//son.method();
	}
}