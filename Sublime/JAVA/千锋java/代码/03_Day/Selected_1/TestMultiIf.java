public class TestMultiIf{
	public static void main(String[] args){
		
		//���������Ƽ�
		
		/*
			���Ԥ����500�򣬱���
			�������Ԥ����300�򣬱���G63 AMG
			�������Ԥ����100�򣬱���X6
			�������Ԥ����50�򣬰µ�A6L
			�������Ԥ����20��������
			�������Ԥ����10�򣬱���
			�������Ԥ����5��������S
			�������Ԥ����1��С��綯��
			���򣬽ݰ���
		*/
		
		int money = 200;//��λ����
		
		if(money >= 500){
			System.out.println("����");
		}else if(money >= 300){
			System.out.println("����G63 AMG");
		}else if(money >= 5){
			System.out.println("������S");
		}else if(money >= 100){
			System.out.println("����X6");
		}else if(money >= 50){
			System.out.println("�µ�A6L");
		}else if(money >= 20){
			System.out.println("������");
		}else if(money >= 10){
			System.out.println("����");
		}else if(money >= 1){
			System.out.println("С��綯��");
		}else{
			System.out.println("�ݰ���");
		}

		/*
		if(money >= 500){
			System.out.println("����");
		}
		
		if(money >= 300 && money < 500){
			System.out.println("����G63 AMG");
		}
		
		if(money >= 100 && money <= 299){
			System.out.println("����X6");
		}
		*/

		System.out.println("�������");

	}
}