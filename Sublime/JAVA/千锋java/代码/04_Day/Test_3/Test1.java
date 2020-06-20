public class Test1{
	public static void main(String[] args){
		
		for(int i = 1000 ; i < 10000 ; i++){
			//1234
			
			int ab = i / 100;//将四位数的千位和百位进行提取、分解
			int cd = i % 100;
			
			if( (ab + cd) * (ab + cd) == i ){
				System.out.println(i);
			}
		}
		
		
	}
}