package chp5;

public class MonkeyKing{
	public static void main(String args[]){
		//�������ʾ15ֻ���ӣ�true��ʾû�б���̭��false��ʾ����̭��
		boolean[] monkeys = new boolean[15];
		//ͳ�ƻ�ʣ��ֻ����
		int monkeyLeft = 15;
		//��¼��ֻ���ӱ����Ľ��
		int num = 1;
		//
		int index = 0;
		
		//��ʼ��
		for(int i = 0; i<monkeys.length; i++){
			monkeys[i] = true;
		}
		
		while(monkeyLeft > 1){
			if (monkeys[index]){
				num++;
				if (num == 8){
					monkeys[index] = false;
					num = 1;
					monkeyLeft--;
				}
			}
			//Ѱ����һ��index
			index++;
			if (index == 15){
				index = 0;
			}
		}
		
		//���
		for(int i = 0; i<monkeys.length; i++){
			if (monkeys[i]){
				System.out.println(i + 1);
				return;
			}
		}
	}
}