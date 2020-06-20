/**
	银行类（）
*/
import java.util.Scanner;
import java.util.Random;

public class Bank{//中国建设银行

	Scanner input = new Scanner(System.in);//实例变量（实例方法共享）
	
	//保存已注册的用户数据
	private User[] users = new User[5];
	
	int size = 3;//有效元素的个数
	
	
	//初始方法（如果存在一些程序起始时必须要执行的代码，则写入初始化方法）
	public Bank(){
		//第一行逻辑 初始化实例变量
		
		
		User user = new User();//0x11223344
		user.setCardNo("6222020200001234567");
		user.setIdentity("110101199011223344");
		user.setUsername("张三");
		user.setPassword("123456");
		user.setPhone("13999999999");
		user.setBalance(2000.0);
		users[0] = user;
		
		
		
		
		users[1] = new User();
		users[1].setCardNo("6222020200004455667");
		users[1].setIdentity("110101199011223355");
		users[1].setUsername("李四");
		users[1].setPassword("123456");
		users[1].setPhone("13999994444");
		users[1].setBalance(3000.0);
		
		
		users[2] = new User("6222020200004455356","110101199011225432","王五","123123","13788998899",5000.0);
		
		
		
	}
	
	//欢迎页
	public void welcomeMenu(){
		System.out.println("--------------------------------------------------------------");
		System.out.println("1.登录  2.注册");
		System.out.println("--------------------------------------------------------------");
		System.out.print("请输入操作编码：");
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
				System.out.println("输入有误，请重新输入！");
		}
	}
	
	
	//登录、验证
	public void login(){
		
		System.out.print("请输入卡号：");
		String no = input.next();
		System.out.print("请输入密码：");
		String pwd = input.next();
		
		User u = check(no , pwd);
		
		if(u != null){
			this.showMenu(u);
		}else{
			System.out.println("用户名或密码错误");
		}
	}
	
	//注册
	public void register(){
		System.out.print("请输入姓名：");
		String uname = input.next();
		
		String id;
		do{
			System.out.print("请输入身份证号：");
			id = input.next();
		}while(id.length() != 18);
		
		
		System.out.print("请输入电话号：");
		String phone = input.next();
		
		System.out.print("请输入密码：");
		String pwd = input.next();
		
		System.out.print("请输入预存金额：");
		double money = input.nextDouble();
		
		//根据用户输入的信息 + 随机卡号 完成对象的封装
		
		String myCardNo = this.getRandomCardNo();
		
		User user = new User();
		user.setCardNo( myCardNo );
		user.setUsername(uname);
		user.setIdentity(id);
		user.setPhone(phone);
		user.setPassword(pwd);
		user.setBalance(money);
		
		//将该对象存储到users数组中
		//if(){}//扩容判断
		users[size] = user;
		size++;
		
		System.out.println("注册成功，您的卡号为：" + myCardNo);
	}
	
	//获得随机卡号
	public String getRandomCardNo(){
		String prefix = "622202020000";
		
		Random random = new Random();
		
		int r = random.nextInt(9000000);
		
		return prefix + (r + 1000000);
	}
	
	//验证
	public User check(String no , String pwd){//单一职能原则
		
		for(int i = 0 ; i < size ; i++){
			//验证卡号和密码
			//if(users[i] != null){//非空判断
				if(no.equals(  users[i].getCardNo()  )  &&  pwd.equals(  users[i].getPassword()  )){
					//查找到该用户，用户存在
					//存在
					return users[i];
				}
			//}
		}
		return null;//不存在
	}
	
	
	
	
	//显示菜单
	public void showMenu(User u){
		int choice;
		do{
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.修改预留手机号码  2.存款  3.取款  4.转账  5.查询余额  6.修改密码  7.注销账户  0.退出");
			System.out.println("--------------------------------------------------------------");
			System.out.print("请输入操作编码：");
			choice = input.nextInt();
			switch(choice){
				case 1:
					System.out.println("修改预留手机号码");
					break;
				case 2:
					System.out.println("执行存款");
					break;
				case 3:
					this.withdrawal(u);
					break;
				case 4:
					System.out.println("执行转账");
					break;
				case 5:
					System.out.println("执行查询余额");
					break;
				case 6:
					System.out.println("执行修改密码");
					break;
				case 7:
					this.cancel(u);
					break;
				case 0:
					return;
				default:
					System.out.println("输入有误，请重新输入!");
					break;
			}
		}while(true);
	}
	
	//注销
	public void cancel(User user){
		
		int index = size + 1;
		
		//查找该用户所在的数组下标
		for(int i = 0 ; i < size ; i++){
			if(users[i] == user){
				index = i;
				break;
			}
		}
		
		//移动该元素之后的每个元素
		for(int i = index ; i < size - 1 ; i++){//index = 0 ; size = 2
			users[i] = users[i+1];
		}
		
		size--;
	}
	
	
	//取款
	public void withdrawal(User mine){
		System.out.print("请输入取款金额：");
		double money = input.nextDouble();
		
		if(money < mine.getBalance()){
			//可以取款
			mine.setBalance( mine.getBalance() - money );
			System.out.println("取款成功，当前余额为：" + mine.getBalance());
		}else{
			System.out.println("余额不足");
		}
	}
	
	
	//展示所有用户
	public void showAll(){
		for(int i = 0 ; i < size ; i++){
			System.out.println(users[i].getUsername());
		}
	}
}


















