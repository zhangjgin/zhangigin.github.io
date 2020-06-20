public class TestNestedForStar{
	public static void main(String[] args){
		
		
		//小问题：使用循环在一行中打印5颗星，打印*不换行，5颗全部打完再换行
		
		
		/*
		
		|*
		|**
		|***
		|****
		//----------
		
		|* 
		|** 
		|*** 
		|**** 
		
		*/
		
		for(int i = 1 ; i <= 6 ; i++){//i=
			
			for(int j = 1 ; j <= i ; j++){//
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}
}