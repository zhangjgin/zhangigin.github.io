package local;

public class TestSchool {

	public static void main(String[] args) {
		
		//Teacher t1 = new AdvencedTeacher();
		//t1.teach();

		Teacher t = School.getTeacher(2);
		t.teach();

	}
}



class School{
	
	public static Teacher getTeacher(int classNO){
		
		Teacher t = null;//返回值
		
		
		//局部内部类（隐藏类的信息）
		class BeginnerTeacher extends Teacher{
			@Override
			public void teach() {
				System.out.println("初级老师在上课...");
			}
		}

		if(classNO % 2 != 0){
			//匿名内部类
			t = new Teacher(){
				@Override
				public void teach() {
					System.out.println("初级老师在上课...");
				}
			};
		}else{
			t = new BeginnerTeacher();
		}
		
		return t;
	}
	
}

abstract class Teacher{
	public abstract void teach();
}



