/*
*
***
*****
*******
*********
***********

&&&&&
&&&&
&&&
&&
&




&&&&&*
&&&&***
&&&*****
&&*******
&*********
***********
*/
public class TestSign{
	public static void main(String[] args){
		
		
		int totalRows = 0;
		do{
			System.out.println("请输入菱形总行数：");
			totalRows = input.nextInt();//11
		}while(totalRows % 2 == 0);
		
		int Rows = totalRows / 2 + 1;
		
		for(int i = 1 ; i <= rows ; i++){//i = 3
			
			for(int j = rows - 1 ; j >= i ; j--){// j = 5
				System.out.print(" ");
			}
			
			for(int k = 1 ; k <= i*2-1 ; k++ ){//k = 1
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}









