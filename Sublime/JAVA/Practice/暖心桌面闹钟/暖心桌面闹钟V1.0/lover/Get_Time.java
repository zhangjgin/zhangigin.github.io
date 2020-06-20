package lover;

import java.util.Calendar;

public class Get_Time extends Thread {
	public static Calendar now_time;
	public void run(){
		while(true){
			now_time=Calendar.getInstance();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
