public class TestSwitch{
	public static void main(String[] args){
		
		//一周菜谱
		
		int weekDay = 2;//一二三四五六七
		
		switch(weekDay){
			
			default:
				System.out.println("录入有误，请输入1~7之间的有效数字！");
				break;
			
			case 1:
				System.out.println("牛肉面");
				break;
			
			case 2:
			case 5:
			case 6:
				System.out.println("炸酱面");
				break;
			
			case 3:
				System.out.println("麻辣香锅");
				break;
			
			case 4:
				System.out.println("大盘鸡");
				break;
			
			
			
			case 7:
				System.out.println("海底捞");
				break;
				
		
				
		}
		
		System.out.println("程序结束");
		
	}
}