package chp2;

public class TestPages {
	public static void main(String[] args) {
		int totle = 23;// �ܼ�¼��
		int single = 5;// ��ҳ��ʾ��¼��
		int pages = totle % single == 0 ? totle / single : totle / single + 1;// ��ҳ��
		int target = 5;// Ŀ��ҳ
		if (target <= pages) {// Ŀ��ҳ����С����ҳ��
			System.out.println((target - 1) * single + 1 + " ~ "
					+ (target * single <= totle ? target * single : totle));//�ܼ�¼��Ϊ�����ʾ��
		}
	}
}
