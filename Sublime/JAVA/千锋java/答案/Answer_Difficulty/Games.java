package chp6;

class Role{
	private String name;
	//���췽��
	public Role(){}
	
	public Role(String name) {
		this.name = name;
	}
	
	// set/get����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//ҵ�񷽷�
	public int attack(){
		return 0;
	}
}

class Magicer extends Role{
	private int level = 1;
	
	public Magicer(){}
	
	public Magicer(String name, int level) {
		super(name);
		if (level > 10 || level < 1){
			System.out.println("level error!");
			return;
		}
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level<1 || level > 10){
			System.out.println("level error!");
			return;
		}
		this.level = level;
	}

	public int attack(){
		return level * 5;
	}
}

class Soldier extends Role{
	private int hurt;
	
	public Soldier(){}
	
	public Soldier(String name, int hurt) {
		super(name);
		this.hurt = hurt;
	}

	public int getHurt() {
		return hurt;
	}

	public void setHurt(int hurt) {
		this.hurt = hurt;
	}
	
	public int attack(){
		return hurt;
	}
}


class Team{
	private Role[] teams = new Role[6];
	//��Ҫ����index����ʾ��������ж��ٸ���Ա
	private int index = 0;
	public Team(){}

	public void addMember(Role role){
		if (index == 6){ //�������6����Ա
			System.out.println("���������");
			return;
		}
		//�����Աδ�����������³�Ա���±�������index
		//���磬ԭ��2����Ա��indexΪ2����������Ա���±�Ϊ0��1
		//���³�Աλ��Ϊteams[2]��teams[index]
		teams[index] = role;
		index++;
	}
	public int attackSum(){
		int sum = 0;
		for(int i = 0; i<index; i++){
			sum += teams[i].attack();
		}
		return sum;
	}
}

public class Games{
	public static void main(String[] args) {
		Magicer m1 = new Magicer("tom", 5);
		Magicer m2 = new Magicer("jerry", 10);
		Soldier s1 = new Soldier("john", 20);
		Soldier s2 = new Soldier("jim", 40);
		Team team = new Team();
		team.addMember(m1);
		team.addMember(m2);
		team.addMember(s1);
		team.addMember(s2);
		int totalAttack = team.attackSum();
		System.out.println("�ܹ����˺�Ϊ" + totalAttack);
	}
}
