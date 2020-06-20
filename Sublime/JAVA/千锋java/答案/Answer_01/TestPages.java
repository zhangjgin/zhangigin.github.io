package chp2;

public class TestPages {
	public static void main(String[] args) {
		int totle = 23;// 总记录数
		int single = 5;// 单页显示记录数
		int pages = totle % single == 0 ? totle / single : totle / single + 1;// 总页数
		int target = 5;// 目标页
		if (target <= pages) {// 目标页必须小于总页数
			System.out.println((target - 1) * single + 1 + " ~ "
					+ (target * single <= totle ? target * single : totle));//总记录数为最大显示数
		}
	}
}
