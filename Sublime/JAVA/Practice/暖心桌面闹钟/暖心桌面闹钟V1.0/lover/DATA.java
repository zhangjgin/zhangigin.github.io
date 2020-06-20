package lover;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DATA {
	public int style_num=1,date_num=200,have_date_num=6,clock_num=200,have_clock_num=6;
	public int sizex=250,sizey=100,dsizex=350,dsizey=350;
	public boolean music;
	public TimeEvent date[],clock[];
	
	public DATA(){
		DataInputStream in = null;
		try {
			in=new DataInputStream(new BufferedInputStream(new FileInputStream("data_package/system.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			have_clock_num=in.readInt();
			have_date_num=in.readInt();
			music=in.readBoolean();
		} catch (IOException e) {
			e.printStackTrace();
		}
		date=new TimeEvent[date_num];
		clock=new TimeEvent[clock_num];
		read_data();
	}
	public void read_data(){
		DataInputStream in = null;
		try {
			in=new DataInputStream(new BufferedInputStream(new FileInputStream("data_package/clock.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			for(int i=0;i<have_clock_num;i++){
				clock[i]=new TimeEvent(in);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			in=new DataInputStream(new BufferedInputStream(new FileInputStream("data_package/date.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			for(int i=0;i<have_date_num;i++){
				date[i]=new TimeEvent(in);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void save_data(){
		DataOutputStream out = null;
		try {
			out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data_package/system.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			out.writeInt(have_clock_num);
			out.writeInt(have_date_num);
			out.writeBoolean(music);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data_package/clock.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			for(int i=0;i<clock_num;i++){
				if(clock[i]!=null)clock[i].toFile(out);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data_package/date.dat")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			for(int i=0;i<date_num;i++){
				if(date[i]!=null)date[i].toFile(out);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void set_all_clear_false(){
		int i;
		for(i=0;i<date_num;i++){
			if(date[i]!=null) date[i].clear=false;
		}
		for(i=0;i<clock_num;i++){
			if(clock[i]!=null) clock[i].clear=false;
		}
	}
	
	public boolean set_date(int year,int mon,int day,String name){
		int i=0;
		while(i<date_num && date[i]!=null){
			i++;
		}
		if(i<date_num && date[i]==null){
			if(name.contains("ÉúÈÕ")==true){
				date[i]=new TimeEvent(year,mon,day,name,"pic/birthday.png");
			}
			else if(name.contains("½Ú")==true){
				date[i]=new TimeEvent(year,mon,day,name,"pic/festival.jpg");
			}
			else{
				date[i]=new TimeEvent(year,mon,day,name,"pic/date0.jpg");
			}
			have_date_num++;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean set_clock(int mon,int day,boolean week[],int hour,int min, String name,int important){
		int i=0;
		while(i<clock_num && clock[i]!=null){
			i++;
		}
		if(i<clock_num && clock[i]==null){
			clock[i]=new TimeEvent(mon,day,hour,min,name,"pic/clock.jpg",important);
			have_clock_num++;
			for(int j=0;j<=7;j++){
				clock[i].week_day[j]=week[j];
			}
			return true;
		}
		else{
			return false;
		}
	}
}
