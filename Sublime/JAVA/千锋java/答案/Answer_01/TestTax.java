package chp2;

import java.util.Scanner;

public class TestTex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������˰ǰ���ʣ�");
		double salary = input.nextDouble() - 262;//����Ĭ�ϣ���͵�λ�������ܶ�����Ӧ�ڼ������պ���м���
		
		double tex = 0.0;//Ӧ��˰��
		if(salary < 3500){
			System.out.println("��˰");
			return;
		}
		
		double validSalary = salary - 3500;//Ӧ��˰���ö�
		if(validSalary <= 1500){
			tex = validSalary * 0.03;
		}else if(validSalary <= 4500){
			tex = validSalary * 0.1 - 105;
		}else if(validSalary <= 9000){
			tex = validSalary * 0.2 - 555;
		}else if(validSalary <= 35000){
			tex = validSalary * 0.25 - 1005;
		}else if(validSalary <= 55000){
			tex = validSalary * 0.3 - 2755;
		}else if(validSalary <= 80000){
			tex = validSalary * 0.35 - 5505;
		}else{
			tex = validSalary * 0.45 - 13505;
		}
		System.out.println("˰���ʣ�" + (salary - tex) );
	}
}
