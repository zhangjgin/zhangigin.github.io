//���������ȷ���ļ���.class�ļ���Ŀ¼�ṹ

//package p1;

//1.�����
import java.util.Scanner; // import java.util.*;


public class TestScanner{
	public static void main(String[] args){
		
		//2.����Scanner���͵ı���������ֵ
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������ݣ�");
		
		//int num = input.nextInt();//������̨��ȡ����һ������ֵ����ֵ��num����
		
		//double num = input.nextDouble();//����С��
		
		//String num = input.next();//�����ַ���
		
		char num = input.next().charAt(0);//�����׸��ַ�
		
		System.out.println("��¼���ֵΪ��" + num);
	}
}