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
		
		Teacher t = null;//����ֵ
		
		
		//�ֲ��ڲ��ࣨ���������Ϣ��
		class BeginnerTeacher extends Teacher{
			@Override
			public void teach() {
				System.out.println("������ʦ���Ͽ�...");
			}
		}

		if(classNO % 2 != 0){
			//�����ڲ���
			t = new Teacher(){
				@Override
				public void teach() {
					System.out.println("������ʦ���Ͽ�...");
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



