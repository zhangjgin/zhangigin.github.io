/**
	�����ɣ�˽�����ԡ��������ʷ������޲ι��췽��
	ʵ���ࣺEntity�����ã��洢����
*/

public class User{
	
	private String cardNo;//����
	private String identity;//���֤��
	private String username;//�û���
	private String password;//����
	private String phone;//�ֻ�����
	private double balance;//���
	
	
	public User(){}
	
	public User(String cardNo , String identity , String username , String password , String phone , double balance){
		this.cardNo = cardNo;
		this.identity = identity;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.balance = balance;
	}
	
	
	

	public void setCardNo(String cardNo){
		this.cardNo = cardNo;
	}
	
	public String getCardNo(){
		return this.cardNo;
	}
	
	
	
	public void setIdentity(String identity){
		this.identity = identity;
	}
	
	public String getIdentity(){
		return this.identity;
	}
	
	
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return this.password;
	}
	

	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
}