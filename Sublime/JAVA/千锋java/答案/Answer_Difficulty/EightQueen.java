package chp5;

public class EightQueen {
	
	static int[] queens = new int[8]; //��ʾÿһ�лʺ��������
	static int solveNum = 1; //ͳ�ƽ������
	public static void main(String[] args) {
		put(0);
	}
	
	//�ж���֮ǰ�Ļ������ڵ�n�зŵ�m���Ƿ����
	public static boolean canPut(int n, int m){
		//�ж��Ƿ�����ͬһ�е�
		for(int i = 0; i<n; i++){
			if (queens[i] == m) return false;
		}
		//�ж��Ƿ���������-->���¶Խ���
		for(int i = 0; i<n; i++){
			if (queens[i] - i == m - n) return false;
		}
		
		//�ж��Ƿ���������-->���¶Խ���
		for(int i = 0; i<n; i++){
			if (queens[i] + i == m + n) return false;
		}
		return true;
	}
	
	//��ʾ���Է��õ�n�еĻʺ�
	public static void put(int n){
		if (n == 8){
			System.out.println(solveNum++);
			printQueen();
			return;
		}
		for(int i = 0; i<queens.length; i++){
			if (canPut(n, i)){
				queens[n] = i;
				put(n+1);
				queens[n] = 0;
			}
		}
	}
	public static void printQueen(){
		for(int i = 0; i<queens.length; i++){
			for(int j = 0; j<queens.length; j++){
				if (queens[i] == j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
