public class TestFilterDogs{
	public static void main(String[] args){

		//一组动物（其中有猫有狗）
		Animal[] as = new Animal[]{new Dog() , new Dog() , new Cat() , new Dog() , new Cat()};
	
	
		Dog[] ds = getAllDog(as);
		
		
		for(int i = 0 ; i < ds.length ; i++){
			System.out.println(ds[i]);
		}
		
	}
	
	//在这一组动物中，挑选出所有的Dog对象
	public static Dog[] getAllDog(Animal[] animals){
		
		//1.明确有几只狗（遍历查看，存在一个狗对象，计数器+1）
		int count = 0;
		for(int i = 0 ; i < animals.length ; i++){
			if(animals[i] instanceof Dog){
				count++;
			}
		}
		
		//2.创建一个count长度的狗数组
		Dog[] dogs = new Dog[count];
		
		
		int index = 0;
		
		//3.将animals数组中的所有Dog对象，保存在dogs数组中。
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










