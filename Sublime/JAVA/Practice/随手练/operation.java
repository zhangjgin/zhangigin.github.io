 class Mynumber{
	private int n1;

	private int n2;

	public void setN1(int n1){
		this.n1 =  n1;

	}
	public int getN1(int n1){
		return n1;
	}
	public void setN2(int n2){
		this.n2 =  n2;
	}
	public int getN2(int n2){
		return n2;
	}
	
	public int addition(){
		return n1 + n2;
	}
	public int subtration(){
		return n1 - n2;
	}
	public int multiplication(){
		return n1 * n2;
	}
	public int division(){
		return n1 / n2;
	}
}
public class operation{
	public static void main(String[] args){
		Mynumber mn = new Mynumber();
		mn.setN1(10);
		mn.setN2(3);

		int addResult = mn.addition();
		System.out.println("加的结果："+addResult);

		int subResult = mn.subtration();
		System.out.println("减的结果："+subResult);

		int mulResult = mn.multiplication();
		System.out.println("乘的结果："+mulResult);

		int divResult = mn.division();
		System.out.println("除的结果："+divResult);

		




	}

}