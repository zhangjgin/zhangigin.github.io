public class TestMultiIf{
	public static void main(String[] args){
		
		//汽车销售推荐
		
		/*
			如果预算是500万，宾利
			否则，如果预算是300万，奔驰G63 AMG
			否则，如果预算是100万，宝马X6
			否则，如果预算是50万，奥迪A6L
			否则，如果预算是20万，帕萨特
			否则，如果预算是10万，宝来
			否则，如果预算是5万，五菱宏光S
			否则，如果预算是1万，小鸟电动车
			否则，捷安特
		*/
		
		int money = 200;//单位：万
		
		if(money >= 500){
			System.out.println("宾利");
		}else if(money >= 300){
			System.out.println("奔驰G63 AMG");
		}else if(money >= 5){
			System.out.println("五菱宏光S");
		}else if(money >= 100){
			System.out.println("宝马X6");
		}else if(money >= 50){
			System.out.println("奥迪A6L");
		}else if(money >= 20){
			System.out.println("帕萨特");
		}else if(money >= 10){
			System.out.println("宝来");
		}else if(money >= 1){
			System.out.println("小鸟电动车");
		}else{
			System.out.println("捷安特");
		}

		/*
		if(money >= 500){
			System.out.println("宾利");
		}
		
		if(money >= 300 && money < 500){
			System.out.println("奔驰G63 AMG");
		}
		
		if(money >= 100 && money <= 299){
			System.out.println("宝马X6");
		}
		*/

		System.out.println("程序结束");

	}
}