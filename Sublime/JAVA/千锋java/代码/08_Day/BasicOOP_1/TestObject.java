public class TestObject{//������
	public static void main(String[] args){
		//�������� ������ = ֵ;
		
		
		Dog myDog = new Dog();//�������� 0x11223344
		
		//��㣨�ģ�
		myDog.breed = "��ʿ��";
		myDog.age = 2;
		myDog.sex = "��";
		myDog.furColor = "�Ұ�";
		
		System.out.println(myDog +"\t"+ myDog.breed +"\t"+ myDog.age +"\t"+ myDog.sex +"\t"+ myDog.furColor);
		
		
		
		Dog yourDog = new Dog();
		yourDog.breed = "��Ħ";
		yourDog.age = 3;
		yourDog.sex = "ĸ";
		yourDog.furColor = "��";
		
		
		System.out.println(yourDog +"\t"+ yourDog.breed +"\t"+ yourDog.age +"\t"+ yourDog.sex +"\t"+ yourDog.furColor);
		
	}
}


class Dog{//�����ģ�壨�ࣩ

	String breed;//Ʒ��
	int age;//����
	String sex;//�Ա�
	String furColor;//ëɫ

}