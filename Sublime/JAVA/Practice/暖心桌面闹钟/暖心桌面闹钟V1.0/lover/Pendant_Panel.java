package lover;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pendant_Panel extends JPanel{
	private static final long serialVersionUID = -1327453819177729769L;
	private Image image_background,image_clock,image_tip_back;
	private Graphics2D g;
	private int style;
	private int mouse_x,mouse_y;
	private JPanel jp=this;
	private Thread draw_time,now_event_judge;
	private int hlong=18,mlong=26,slong=31;
	private TimeEvent now_tip;
	private boolean choose=false;
	public static Main_Dialog md;
	public Pendant_Panel(int style){
		this.style=style;
		image_style();
		this.addMouseListener(new MLC());
		this.addMouseMotionListener(new MML());
		md=new Main_Dialog(style);
		now_event_judge=new NowEvent();
		now_event_judge.start();
		draw_time=new DrawTime();
		draw_time.start();
	}
	private void image_style(){
		try {
			image_background=ImageIO.read(new File("pic/background"+style+".jpg"));
			image_clock=ImageIO.read(new File("pic/clock"+style+".jpg"));
			image_tip_back=ImageIO.read(new File("pic/tipback"+style+".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		this.setCursor( Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("pic/cursor"+style+".png").getImage(), new Point(10, 10), "norm"));
	}
	
	public void paint(Graphics g2){
		g = (Graphics2D) g2;
		g.drawImage(image_background, -1,-1,Main_Window.data.sizex+2,Main_Window.data.sizey+2,null);
		g.drawImage(image_clock,0,2,100,102,null);
		int sec=Get_Time.now_time.get(Calendar.SECOND);
		g.drawLine(50,50,(int)(50+slong*Math.cos(Math.toRadians(sec*6-90))),(int)(50+slong*Math.sin(Math.toRadians(sec*6-90))));
		int min=Get_Time.now_time.get(Calendar.MINUTE);
		g.drawLine(50,49,(int)(50+mlong*Math.cos(Math.toRadians(min*6-90))),(int)(49+mlong*Math.sin(Math.toRadians(min*6-90))));
		g.drawLine(50,50,(int)(50+mlong*Math.cos(Math.toRadians(min*6-90))),(int)(50+mlong*Math.sin(Math.toRadians(min*6-90))));
		g.drawLine(50,51,(int)(50+mlong*Math.cos(Math.toRadians(min*6-90))),(int)(51+mlong*Math.sin(Math.toRadians(min*6-90))));
		int hour=Get_Time.now_time.get(Calendar.HOUR);
		int hour_a=hour*30-90+min/2;
		g.drawLine(50,49,(int)(50+hlong*Math.cos(Math.toRadians(hour_a))),(int)(49+hlong*Math.sin(Math.toRadians(hour_a))));
		g.drawLine(50,50,(int)(50+hlong*Math.cos(Math.toRadians(hour_a))),(int)(50+hlong*Math.sin(Math.toRadians(hour_a))));
		g.drawLine(50,51,(int)(50+hlong*Math.cos(Math.toRadians(hour_a))),(int)(51+hlong*Math.sin(Math.toRadians(hour_a))));
		g.setFont(new Font("宋体",Font.BOLD,14));
		g.setColor(Color.BLACK);
		String s;
		s=Get_Time.now_time.get(Calendar.YEAR)+" 年 ";
		if(Get_Time.now_time.get(Calendar.MONTH)+1>=10){
			s=s+(Get_Time.now_time.get(Calendar.MONTH)+1)+" 月 ";
		}
		else s=s+"0"+(Get_Time.now_time.get(Calendar.MONTH)+1)+" 月 ";
		if(+Get_Time.now_time.get(Calendar.DAY_OF_MONTH)>=10){
			s=s+Get_Time.now_time.get(Calendar.DAY_OF_MONTH)+" 日";
		}
		else s=s+"0"+Get_Time.now_time.get(Calendar.DAY_OF_MONTH)+" 日";
	    g.drawString(s,95,30);
	    drawQuestion(g);
	}
	
	private void drawQuestion(Graphics2D g){
		g.drawImage(image_tip_back, 90,40,160,55,null);
		Font f=new Font("宋体",Font.BOLD,14);
		g.setFont(f);
		if(now_tip!=null){
			if(choose==true){
				g.setColor(Color.BLUE);
			}
			else{
				g.setColor(Color.BLACK);
			}
			g.drawImage(now_tip.image,112,52,30,30,null);
			g.drawString(now_tip.name,145,73);
		}
		else{
			
		}
	}
	
	private class MML  implements MouseMotionListener{
	       public void mouseMoved(MouseEvent e){
	    	   int x1=e.getX();
	    	   int y1=e.getY();
	    	   if(x1>=110 && x1<=230 && y1>=50 && y1<=90 && now_tip!=null){
	    		   if(choose==false){
	    			   jp.repaint();
	    			   choose=true;
	    			   jp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    		   }
	    	   }
	    	   else{
	    		   if(choose==true){
	    			   jp.repaint();
	    			   choose=false;
	    			   jp.setCursor( Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("pic/cursor"+style+".png").getImage(), new Point(10, 10), "norm"));
	    		   }
	    	   }
	       }
	       public void mouseDragged(MouseEvent e){
	    	   int x1=e.getX();
	    	   int y1=e.getY();
	    	   Point p = Main_Window.main_window.getLocation(); 
	    	   Main_Window.main_window.setLocation(p.x+x1-mouse_x,p.y+y1-mouse_y);
	    	   md.setBounds(p.x+x1-mouse_x-Main_Window.data.dsizex-10,p.y+y1-mouse_y,Main_Window.data.dsizex,Main_Window.data.dsizey);
	       };
	}
	
	private class MLC implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			int x1=e.getX();
	    	int y1=e.getY();
			if(x1>=110 && x1<=230 && y1>=50 && y1<=90 && now_tip!=null){
				now_tip.clear=true;
				find_now_event();
				jp.repaint();
			}
			else{
				if(md.isVisible()==false){
					md.setVisible(true);
				}
				else{
					md.setVisible(false);
				}
			}
		}
		public void mousePressed(MouseEvent e) {
			mouse_x=e.getX();
			mouse_y=e.getY();
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	private class DrawTime extends Thread {
		public void run(){
			int s = -1;
			while(true){
				if(s!=Get_Time.now_time.get(Calendar.SECOND)){
					jp.repaint();
					s=Get_Time.now_time.get(Calendar.SECOND);
				}
				if(md.isVisible()==true){
					if(md.isFocusOwner()==false){
						md.setVisible(false);
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private class NowEvent extends Thread {
		public void run(){
			int m = -1;
			while(true){
				if(m!=Get_Time.now_time.get(Calendar.MINUTE)){
					find_now_event();
					m=Get_Time.now_time.get(Calendar.MINUTE);
					if(m==1 && Get_Time.now_time.get(Calendar.HOUR_OF_DAY)==0){
						Main_Window.data.set_all_clear_false();
					}
				}
				try {
					Thread.sleep((60-Get_Time.now_time.get(Calendar.SECOND))*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void find_now_event(){
		int n=0,i=0;
		TimeEvent now_tip = null;
		while(n<Main_Window.data.clock_num){
			if(Main_Window.data.clock[n]!=null){
				if(judge_equal(Main_Window.data.clock[n])==true){
					now_tip=Main_Window.data.clock[n];
					break;
				}
			}
			n++;
		}
		for(i=n;i<Main_Window.data.clock_num;i++){
			if(Main_Window.data.clock[i]!=null){
				if(now_tip==null){
					if(judge_equal(Main_Window.data.clock[i])==true){
						now_tip=Main_Window.data.clock[i];
					}
				}
				else{
					if(judge_equal(Main_Window.data.clock[i])==true && Main_Window.data.clock[i].important>now_tip.important){
						now_tip=Main_Window.data.clock[i];
					}
				}
			}
		}
		if(now_tip==null){
			for(i=0;i<Main_Window.data.date_num;i++){
				if(Main_Window.data.date[i]!=null){
					if(judge_equal(Main_Window.data.date[i])==true){
						now_tip=Main_Window.data.date[i];
						break;
					}
				}
			}
		}
		this.now_tip=now_tip;
	}
	
	private boolean judge_equal(TimeEvent t){
		if(t.clear==true) return false;
		if(t.hour[Get_Time.now_time.get(Calendar.HOUR_OF_DAY)]==true||(t.min!=-1 && t.hour[(Get_Time.now_time.get(Calendar.HOUR_OF_DAY)+1)%24]==true)||t.hour[24]==false){
			if(t.min==-1||caculate_time(t)<=30){
				if(t.week_day[Get_Time.now_time.get(Calendar.DAY_OF_WEEK)]==true || t.week_day[0]==false){
					if(t.month==(Get_Time.now_time.get(Calendar.MONTH)+1)||t.month==-1){
						if(t.day==Get_Time.now_time.get(Calendar.DAY_OF_MONTH)||t.day==-1){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private int caculate_time(TimeEvent t) {
		if(t.min==-1) return 10000;
		else{
			if(t.hour[Get_Time.now_time.get(Calendar.HOUR_OF_DAY)]==true && t.min-Get_Time.now_time.get(Calendar.MINUTE)>=0){
				return t.min-Get_Time.now_time.get(Calendar.MINUTE);
			}
			else if(t.hour[(Get_Time.now_time.get(Calendar.HOUR_OF_DAY)+1)%24]==true){
				return t.min+60-Get_Time.now_time.get(Calendar.MINUTE);
			}
			else return 10000;
		}
	}
}
