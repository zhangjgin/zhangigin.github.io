package exam;

public class Qestion_14 {

	public static void main(String[] args) {
		String s = "3123184424287857982309284018";
		
		int[] counter = new int[10];//集合
		
		char[] s1 = s.toCharArray();
		
		for(int i = 48;i<58;i++){
			
			int a = 0;
			
			for(int j = 0;j<s1.length;j++){
				
				if(s1[j] == i){
					a++;
				}
			}
			counter[i-48] = a;
		}
		
		for(int i = 0 ; i < counter.length ; i++){
			System.out.println(i + "出现的次数为：" + counter[i]);
		}
		
	}

}
