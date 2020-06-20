public class User{
	int id;
	
	String password;
	
	String email;
	
	public User(int id,String password){
		this.id = id;
		this.password = password;
		email = "921095085@qq.com";
	}
	public User(int id,String password,String email){
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public void info(){
		System.out.println("id£∫" + id + "   √‹¬Î£∫" + password + "   ” œ‰£∫" + email);
	}
	
}
class Test{
	public static void main(String[] args){
		User u = new User(88,"888");
		u.info();
		
		User c = new User(66,"666","18755056743@163.com");
		c.info();
		
	}
}