public class TestWhile2{
	
	public static void main(String[] args){
		
		/*
		int i = 1;
		
		int sum = 0;
		
		while(i <= 100){
			
			sum += i;
			
			i+=2;
		}
		
		System.out.println(sum);
		*/
		
		
		int i = 1 ;
		
		int sum = 0;
		
		while(i <= 100){
			
			if(i % 3 == 0 && i % 5 != 0){
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
	
}