package chp2;

import java.util.Scanner;

public class TestTex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入税前工资：");
		double salary = input.nextDouble() - 262;//减掉默认（最低档位）五险总额，计算额应在减掉保险后进行计算
		
		double tex = 0.0;//应缴税额
		if(salary < 3500){
			System.out.println("免税");
			return;
		}
		
		double validSalary = salary - 3500;//应纳税所得额
		if(validSalary <= 1500){
			tex = validSalary * 0.03;
		}else if(validSalary <= 4500){
			tex = validSalary * 0.1 - 105;
		}else if(validSalary <= 9000){
			tex = validSalary * 0.2 - 555;
		}else if(validSalary <= 35000){
			tex = validSalary * 0.25 - 1005;
		}else if(validSalary <= 55000){
			tex = validSalary * 0.3 - 2755;
		}else if(validSalary <= 80000){
			tex = validSalary * 0.35 - 5505;
		}else{
			tex = validSalary * 0.45 - 13505;
		}
		System.out.println("税后工资：" + (salary - tex) );
	}
}
