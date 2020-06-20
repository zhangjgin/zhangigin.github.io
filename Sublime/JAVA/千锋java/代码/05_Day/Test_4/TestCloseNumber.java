public class TestCloseNumber{
	public static void main(String[] args){
		
		
		
		for(int a = 1 ; a <= 3000 ; a++){
			
			//a的因子和是多少？
			int b = sum(a);
			int c = sum(b);
			
			if(a == c && a < b){
				System.out.println(a +"\t"+ b);
			}
		}
		
	}
	
	public static int sum(int n){//8
		int sum = 0;
		for(int i = 1 ; i < n ; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}