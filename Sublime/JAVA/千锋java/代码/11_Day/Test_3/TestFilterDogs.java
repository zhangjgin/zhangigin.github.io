public class TestFilterDogs{
	public static void main(String[] args){

		//һ�鶯�������è�й���
		Animal[] as = new Animal[]{new Dog() , new Dog() , new Cat() , new Dog() , new Cat()};
	
	
		Dog[] ds = getAllDog(as);
		
		
		for(int i = 0 ; i < ds.length ; i++){
			System.out.println(ds[i]);
		}
		
	}
	
	//����һ�鶯���У���ѡ�����е�Dog����
	public static Dog[] getAllDog(Animal[] animals){
		
		//1.��ȷ�м�ֻ���������鿴������һ�������󣬼�����+1��
		int count = 0;
		for(int i = 0 ; i < animals.length ; i++){
			if(animals[i] instanceof Dog){
				count++;
			}
		}
		
		//2.����һ��count���ȵĹ�����
		Dog[] dogs = new Dog[count];
		
		
		int index = 0;
		
		//3.��animals�����е�����Dog���󣬱�����dogs�����С�
		for(int i = 0 ; i < animals.length ; i++){
			if(animals[i] instanceof Dog){
				dogs[index] = (Dog)animals[i];
				index++;
			}
		}
		
		return dogs;
		
	}
	
}

class Animal{
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}







class Worker{
	
	Address addr;
	
	public void setAddr(Address addr){
		this.addr = addr;
	}
	
	public Address getAddr(){
		return this.addr;
	}
}

class Address{}










