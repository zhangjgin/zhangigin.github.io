public class TestNestedIf{
	public static void main(String[] args){
		
		//百米赛跑 13
		
		//计时器
		double timer = 12;
		
		char sex = '女';
		
		
		if(timer <= 13){
			//具备进入决赛的资格
			if(sex == '男'){
				System.out.println("进入男子组决赛");
			}else{
				System.out.println("进入女子组决赛");
			}
		}else{
			System.out.println("淘汰");
		}
	
	}
}