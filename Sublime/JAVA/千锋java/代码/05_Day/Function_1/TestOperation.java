import java.util.Scanner;
public class TestOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������û�����");
		String username = input.next();
		System.out.print("���������룺");
		String password = input.next();
		
		login(username,password);
		
		
		/*
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println( s1.equals(s2) );
		System.out.println( s1.equals(s3) );
		 */
	}
	
	//��¼����
	//�����û�����ġ��û������͡����롱����Ԫ���ݵĶԱ�
	public static void login(String uname , String pwd){

		//aaron123  123456
		
		if( "aaron123".equals(uname) && "123456".equals(pwd) ){//equals �ȼ��� ==�����жϵ����ַ���������
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		
	}
}