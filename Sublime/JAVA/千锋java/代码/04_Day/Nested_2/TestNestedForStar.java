public class TestNestedForStar{
	public static void main(String[] args){
		
		
		//С���⣺ʹ��ѭ����һ���д�ӡ5���ǣ���ӡ*�����У�5��ȫ�������ٻ���
		
		
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