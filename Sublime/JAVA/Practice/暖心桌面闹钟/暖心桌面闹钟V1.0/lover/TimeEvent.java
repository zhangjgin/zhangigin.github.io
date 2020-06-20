package lover;

import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TimeEvent {
	public int year=-1,month=-1,day=-1,min=-1,sec=-1,important=0;
	public boolean week_day[]=new boolean[8],hour[]=new boolean[25],clear=false;
	public String name=" ",image_name=" ";
	public Image image=null;
	public TimeEvent(int hour_begin,int hour_end,String name,String imgfile){
		for(int i=0;i<=7;i++){
			week_day[i]=false;
		}
		for(int i=0;i<=24;i++){
			this.hour[i]=false;
		}
		hour[24]=true;
		for(int i=hour_begin;i<=hour_end;i++){
			hour[i]=true;
		}
		this.name=name;
		this.image_name=imgfile;
		try {
			this.image=ImageIO.read(new File(imgfile));
		} catch (IOException e) {
			System.out.println(name);
			e.printStackTrace();
		}
	}
	
	public TimeEvent(int week_day_begin,int week_day_end,int hour,int min,String name,int important,String imgfile){
		for(int i=0;i<=7;i++){
			week_day[i]=false;
		}
		for(int i=0;i<=24;i++){
			this.hour[i]=false;
		}
		week_day[0]=true;
		for(int i=week_day_begin;i<=week_day_end;i++){
			week_day[i]=true;
		}
		this.hour[24]=true;
		this.hour[hour]=true;
		this.min=min;
		if(name.contains("ÄÖÖÓ")==false && name.contains("Ê±¼ä")==false && name.contains("ÌáÐÑ")==false && name.getBytes().length<=6){
			this.name="ÄÖÖÓ-"+name;
		}
		else this.name=name;
		this.important=important;
		this.image_name=imgfile;
		try {
			this.image=ImageIO.read(new File(imgfile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public TimeEvent(int year,int mon,int day,String name,String imgfile){
		for(int i=0;i<=7;i++){
			week_day[i]=false;
		}
		for(int i=0;i<=24;i++){
			this.hour[i]=false;
		}
		this.year=year;
		this.month=mon;
		this.day=day;
		this.name=name;
		this.image_name=imgfile;
		try {
			this.image=ImageIO.read(new File(imgfile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		important=1;
	}
	
	public TimeEvent(int mon,int day,int hour,int min,String name,String imgfile,int important){
		for(int i=0;i<=7;i++){
			week_day[i]=false;
		}
		for(int i=0;i<=24;i++){
			this.hour[i]=false;
		}
		this.hour[24]=true;
		this.hour[hour]=true;
		this.month=mon;
		this.day=day;
		this.min=min;
		this.name=name;
		this.image_name=imgfile;
		try {
			this.image=ImageIO.read(new File(imgfile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.important=important;
	}
	
	public TimeEvent(DataInputStream in){
		try {
			this.year=in.readInt();
			this.month=in.readInt();
			this.day=in.readInt();
			this.min=in.readInt();
			this.sec=in.readInt();
			this.important=in.readInt();
			for(int i=0;i<8;i++) this.week_day[i]=in.readBoolean();
			for(int i=0;i<=24;i++) this.hour[i]=in.readBoolean();
			this.name=in.readUTF();
			this.image_name=in.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.clear=false;
		try {
			this.image=ImageIO.read(new File(image_name));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean toFile(DataOutputStream out){
		try {
			out.writeInt(year);
			out.writeInt(month);
			out.writeInt(day);
			out.writeInt(min);
			out.writeInt(sec);
			out.writeInt(important);
			for(int i=0;i<8;i++) out.writeBoolean(week_day[i]);
			for(int i=0;i<=24;i++) out.writeBoolean(hour[i]);
			out.writeUTF(name);
			out.writeUTF(image_name);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
