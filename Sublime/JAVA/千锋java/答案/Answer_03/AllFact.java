package chp4;

public class AllFact {

	public static void main(String[] args) {
		allFact(100);
	}
	
	public static void allFact(int n){
		for(int i = 1; i<= n/2; i++){
			if (n % i == 0){
				System.out.print(i + "\t");
			}
		}
	}
	
}
