interface Door{
	public void openDoor();
	public void closeDoor();
}


abstract class AbsDoor implements Door{
	String brand;
	double price;

	public void windProof(){
		System.out.println("????);
	}
	public abstract void lock();
}


class TheftDoor extends AbsDoor{
	public void lock(){
		System.out.println("???");
	}
	public void openDoor(){
		System.out.println("?????);
	}
	public void closeDoor(){
		System.out.println("?????);
	}
}


public class DoorTest{
	public static void main(String[] args){
		TheftDoor d = new TheftDoor();
		d.brand = "?è";
		d.price = 2000.0;
		d.closeDoor();
		d.windProof();
		d.lock();
		d.openDoor();
	}
}