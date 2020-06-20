package chp3;

public class HundredChick {
	public static void main(String[] args) {
		for(int a = 0; a<=33; a++){//最多33只公鸡
			for(int b = 0; b<=50; b++){//最多50只母鸡
				int c = 100 - a - b; //c只小鸡
				if(c % 3 != 0) continue; //c必须是3的倍数
				int sumPrice = a*3 + b*2 + c/3; //计算总价
				if (sumPrice == 100){
				    System.out.println(a + "只公鸡，" + b + "只母鸡，" + c + "只小鸡");
				}
			}
		}
	}
}
