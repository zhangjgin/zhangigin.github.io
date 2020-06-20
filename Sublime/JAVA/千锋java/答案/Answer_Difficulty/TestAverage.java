package chp10;

import java.util.*;

class Student{
	private String name;
	private int age;
	private int score;
	private String classNum;
	
	public Student(String name, int age, int score, String classNum) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
}

public class TestAverage {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("Tom", 18, 100, "class05"));
		list.add(new Student("Jerry", 22, 70, "class04"));
		list.add(new Student("Owen", 25, 90, "class05"));
		list.add(new Student("Jim", 30,80 , "class05"));
		list.add(new Student("Steve", 28, 66, "class06"));
		list.add(new Student("Kevin", 24, 100, "class04"));
		
		//����Map
		Map map = new HashMap();
		//��List�е�ÿһ��ѧ�����б�������ѧ�����η���map��
		for(int i = 0; i<list.size(); i++){
			Student stu = (Student) list.get(i);
			//���ѧ���İ��
			String classNum = stu.getClassNum();
			
			//�����Ŵ��ڣ���˵����ѧ�����Ǳ���ĵ�һ��ѧ��
			//�����ͨ�������ҵ��༶��List�����Ѹ�ѧ�����뵽�༶List��
			if(map.containsKey(classNum)){
				List l = (List) map.get(classNum);
				l.add(stu);
			}
			//�����Ų����ڣ�˵����ѧ���Ǳ���ĵ�һ��ѧ��
			//����봴��һ����list��������map��put��������
			//�����Ϊ�����´�����list��Ϊֵ���뵽map��ȥ
			else{
				List l = new ArrayList();
				list.add(stu);
				map.put(stu.getClassNum(), l);
			}
		}
		
		//����Map
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			//��ð��
			Object classNum = iter.next();
			//��ð༶ѧ����List
			List stuList = (List)map.get(classNum);
			//����stuList������ƽ����
			double sum = 0;
			for(int i = 0; i<stuList.size(); i++){
				sum += ((Student)stuList.get(i)).getScore();
			}
			System.out.println(classNum + " " + (sum / stuList.size()));
		}
		
	}

}
