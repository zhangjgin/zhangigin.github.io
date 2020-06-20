package bytes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class TestObjectStream {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("Files\\objects.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(new Student("tom",20,"ÄÐ",99D , new Address()));
		
		oos.writeObject(new Student("jack",20,"ÄÐ",99D , new Address()));
		
		oos.writeObject(new Student("annie",21,"Å®",98D , new Address()));
		
		oos.flush();
		
		
		//-----------------------------------------------------------

		InputStream is = new FileInputStream("Files\\objects.txt");
		
		ObjectInputStream ois = new ObjectInputStream(is);
		
		while(true){
			try {
				Object obj = ois.readObject();
				System.out.println(obj.toString());
			} catch (EOFException e) {
				break;
			}
		}
		
		
	}
}

class Student implements Serializable{
	String name;
	Integer age;
	String sex;
	Double score;
	transient Address addr;
	public Student(String name, Integer age, String sex, Double score , Address addr) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", score=" + score + ", addr=" + addr + "]";
	}
	
}

class Address{
	String position;
	String zipCode;
}