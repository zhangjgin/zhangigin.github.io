package lover;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.JDialog;

public class Clock_Tip_Window extends JDialog{
	private static final long serialVersionUID = 1315611408010966098L;
	private JDialog jd=this;
	private Image i_back,close0,close1;
	private int sizex=400,sizey=200;
	private boolean choose=false;
	private Graphics2D g;
	private Thread now_event;
	private AudioClip audioclip;
	private TimeEvent now_te=null;
	public Clock_Tip_Window(int style){
		jd.setBounds(Main_Window.screen_x-sizex,Main_Window.screen_y-sizey-50,sizex,sizey);
		jd.setUndecorated(true);
		jd.addMouseListener(new MLC());
		jd.setAlwaysOnTop(true);
		jd.addMouseMotionListener(new MML());
		URL url = null;
		try {
			url = new URL("file:music/tip.wav");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		audioclip=Applet.newAudioClip(url);
		try {
			i_back=ImageIO.read(new File("pic/clock_tip_background"+style+".jpg"));
			close0=ImageIO.read(new File("pic/close"+style+"0.png"));
			close1=ImageIO.read(new File("pic/close"+style+"1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		now_event=new NowEvent();
		now_event.start();
		jd.setVisible(false);
	}
	
	public void paint(Graphics g2){
		g = (Graphics2D) g2;
		g.drawImage(i_back,-1,-1,sizex+2,sizey+2,null);
		if(choose==false){
			g.drawImage(close0,110,120,50, 50,null);
		}
		else{
			g.drawImage(close1,110,120,50, 50,null);
		}
		if(now_te!=null){
			Font f=new Font("宋体",Font.BOLD,18);
			g.setFont(f);
			g.setColor(Color.YELLOW);
			g.drawString("注意~注意~",30,45);
			g.drawString("时间到啦~！", 130, 105);
			f=new Font("宋体",Font.BOLD,24);
			g.setFont(f);
			g.drawString(now_te.name,80,80);
		}
	}
	
	private class MLC implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			int x1=e.getX();
	    	int y1=e.getY();
	    	if(x1>=110 && x1<=160 && y1>=120 && y1<=170){
	    		   jd.setVisible(false);
	    		   audioclip.stop();
	        }
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	private class MML  implements MouseMotionListener{
	       public void mouseMoved(MouseEvent e){
	    	   int x1=e.getX();
	    	   int y1=e.getY();
	    	   if(x1>=110 && x1<=160 && y1>=120 && y1<=170){
	    		   if(choose==false){
	    			   choose=true;
	    			   jd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    			   jd.repaint();
	    		   }
	    	   }
	    	   else{
	    		   if(choose==true){
	    			   choose=false;
	    			   jd.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    			   jd.repaint();
	    		   }
	    	   }
	       }
	       public void mouseDragged(MouseEvent e){}
	}
	
	private class NowEvent extends Thread {
		public void run(){
			int i,h;
			while(true){
				for(i=0;i<Main_Window.data.clock_num;i++){
					if(Main_Window.data.clock[i]!=null){
						if(time_equal(Main_Window.data.clock[i])==true){
							jd.setVisible(true);
							jd.toFront();
							now_te=Main_Window.data.clock[i];
							jd.repaint();
							h=0;
							if(Main_Window.data.music==true) audioclip.loop();
							while(h<=sizey+50){
								jd.setBounds(Main_Window.screen_x-sizex,Main_Window.screen_y-h,sizex,sizey);
								h+=10;
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							try {
								Thread.sleep((50-Get_Time.now_time.get(Calendar.SECOND))*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							audioclip.stop();
							jd.setVisible(false);
							now_te=null;
							jd.repaint();
						}
					}
				}
				try {
					Thread.sleep((60-Get_Time.now_time.get(Calendar.SECOND))*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private boolean time_equal(TimeEvent t) {
			if(t.hour[Get_Time.now_time.get(Calendar.HOUR_OF_DAY)]==true){
				if(t.min==Get_Time.now_time.get(Calendar.MINUTE)){
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
	}
	
}
