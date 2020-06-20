/**
	�����ࣨ��
*/
import java.util.Scanner;
import java.util.Random;

public class Bank{//�й���������

	Scanner input = new Scanner(System.in);//ʵ��������ʵ����������
	
	//������ע����û�����
	private User[] users = new User[5];
	
	int size = 3;//��ЧԪ�صĸ���
	
	
	//��ʼ�������������һЩ������ʼʱ����Ҫִ�еĴ��룬��д���ʼ��������
	public Bank(){
		//��һ���߼� ��ʼ��ʵ������
		
		
		User user = new User();//0x11223344
		user.setCardNo("6222020200001234567");
		user.setIdentity("110101199011223344");
		user.setUsername("����");
		user.setPassword("123456");
		user.setPhone("13999999999");
		user.setBalance(2000.0);
		users[0] = user;
		
		
		
		
		users[1] = new User();
		users[1].setCardNo("6222020200004455667");
		users[1].setIdentity("110101199011223355");
		users[1].setUsername("����");
		users[1].setPassword("123456");
		users[1].setPhone("13999994444");
		users[1].setBalance(3000.0);
		
		
		users[2] = new User("6222020200004455356","110101199011225432","����","123123","13788998899",5000.0);
		
		
		
	}
	
	//��ӭҳ
	public void welcomeMenu(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("1.��¼  2.ע��");
		System.out.println("--------------------------------------------------------------");
		System.out.print("������������룺");
		int choice = input.nextInt();
		switch(choice){
			case 1:
				this.login();
				break;
			case 2:
				this.register();
				this.login();
				break;
			default:
				System.out.println("�����������������룡");
		}
	}
	
	
	//��¼����֤
	public void login(){
		
		System.out.print("�����뿨�ţ�");
		String no = input.next();
		System.out.print("���������룺");
		String pwd = input.next();
		
		User u = check(no , pwd);
		
		if(u != null){
			this.showMenu(u);
		}else{
			System.out.println("�û������������");
		}
	}
	
	//ע��
	public void register(){
		System.out.print("������������");
		String uname = input.next();
		
		String id;
		do{
			System.out.print("���������֤�ţ�");
			id = input.next();
		}while(id.length() != 18);
		
		
		System.out.print("������绰�ţ�");
		String phone = input.next();
		
		System.out.print("���������룺");
		String pwd = input.next();
		
		System.out.print("������Ԥ���");
		double money = input.nextDouble();
		
		//�����û��������Ϣ + ������� ��ɶ���ķ�װ
		
		String myCardNo = this.getRandomCardNo();
		
		User user = new User();
		user.setCardNo( myCardNo );
		user.setUsername(uname);
		user.setIdentity(id);
		user.setPhone(phone);
		user.setPassword(pwd);
		user.setBalance(money);
		
		//���ö���洢��users������
		//if(){}//�����ж�
		users[size] = user;
		size++;
		
		System.out.println("ע��ɹ������Ŀ���Ϊ��" + myCardNo);
	}
	
	//����������
	public String getRandomCardNo(){
		String prefix = "622202020000";
		
		Random random = new Random();
		
		int r = random.nextInt(9000000);
		
		return prefix + (r + 1000000);
	}
	
	//��֤
	public User check(String no , String pwd){//��һְ��ԭ��
		
		for(int i = 0 ; i < size ; i++){
			//��֤���ź�����
			//if(users[i] != null){//�ǿ��ж�
				if(no.equals(  users[i].getCardNo()  )  &&  pwd.equals(  users[i].getPassword()  )){
					//���ҵ����û����û�����
					//����
					return users[i];
				}
			//}
		}
		return null;//������
	}
	
	
	
	
	//��ʾ�˵�
	public void showMenu(User u){
		int choice;
		do{
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�޸�Ԥ���ֻ�����  2.���  3.ȡ��  4.ת��  5.��ѯ���  6.�޸�����  7.ע���˻�  0.�˳�");
			System.out.println("--------------------------------------------------------------");
			System.out.print("������������룺");
			choice = input.nextInt();
			switch(choice){
				case 1:
					System.out.println("�޸�Ԥ���ֻ�����");
					break;
				case 2:
					System.out.println("ִ�д��");
					break;
				case 3:
					this.withdrawal(u);
					break;
				case 4:
					System.out.println("ִ��ת��");
					break;
				case 5:
					System.out.println("ִ�в�ѯ���");
					break;
				case 6:
					System.out.println("ִ���޸�����");
					break;
				case 7:
					this.cancel(u);
					break;
				case 0:
					return;
				default:
					System.out.println("������������������!");
					break;
			}
		}while(true);
	}
	
	//ע��
	public void cancel(User user){
		
		int index = size + 1;
		
		//���Ҹ��û����ڵ������±�
		for(int i = 0 ; i < size ; i++){
			if(users[i] == user){
				index = i;
				break;
			}
		}
		
		//�ƶ���Ԫ��֮���ÿ��Ԫ��
		for(int i = index ; i < size - 1 ; i++){//index = 0 ; size = 2
			users[i] = users[i+1];
		}
		
		size--;
	}
	
	
	//ȡ��
	public void withdrawal(User mine){
		System.out.print("������ȡ���");
		double money = input.nextDouble();
		
		if(money < mine.getBalance()){
			//����ȡ��
			mine.setBalance( mine.getBalance() - money );
			System.out.println("ȡ��ɹ�����ǰ���Ϊ��" + mine.getBalance());
		}else{
			System.out.println("����");
		}
	}
	
	
	//չʾ�����û�
	public void showAll(){
		for(int i = 0 ; i < size ; i++){
			System.out.println(users[i].getUsername());
		}
	}
}


















