package encapsulate;

public class TestAutoEncap {

	public static void main(String[] args) {
		
		//�﷨�ǣ�Java���Թ淶��
		Byte b = 10;//�Զ�װ�� ����valueOf(byte b)
		
		byte b2 = b;//�Զ����� ����byteValue();  shortValue()   intValue()  booleanValue()
		

		
		Short s1 = 100;//�ӳ���Ϊ256�������У�ȡ��Ԥ�ȴ����õ�һ��Short���󣨴˶����������100�� 0x7777
		Short s2 = 100;
		
		Short s3 = 200;//0x1234
		Short s4 = 200;//0x6789
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		//false false
		//true true
		//true false
		
		
	}
	


}
