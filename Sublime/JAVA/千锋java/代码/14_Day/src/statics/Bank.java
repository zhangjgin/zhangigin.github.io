package statics;

public class Bank {//���й���ҵ��ģ��

	public void login(){}

	private static class Information{
		private static User[] users = new User[5];//�������飬Ϊ�˴洢�ѿ������û���Ϣ
		
		static{
			users[0] = new User();
			users[1] = new User();
			users[2] = new User();
		}
	}
}

class User{}