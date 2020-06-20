package lover;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Menu_Panel extends JPanel{
	private static final long serialVersionUID = -757595684318646104L;
	private Image image_bdback,image_background,image_divide,image_rim[],image_button_data,image_button_clock,image_button_focous,image_bigbackground;
	private DrawButton db[];
	private Graphics2D g;
	private int now_panel=1,move1=-1,move2=-1,max=10;
	private JPanel jp=this;
	private int bsx=40,bsy=40,bsjx=20,bsjy=5,stringj=10,stringh=20;
	public Menu_Panel(int style){
		this.addMouseMotionListener(new MML());
		this.addMouseWheelListener(new MWL());
		this.addMouseListener(new MLC());
		image_style(style);
	}
	
	public void image_style(int style){
		db=new DrawButton[2];
		db[0]=new DrawButton(100,bsjy*2+bsy+10+stringh*(max+2)-5,50,40);
		db[1]=new DrawButton(200,bsjy*2+bsy+10+stringh*(max+2)-5,50,40);
		try {
			image_bdback=ImageIO.read(new File("pic/bdback"+style+".png"));
			image_background=ImageIO.read(new File("pic/MPbackground"+style+".png"));
			image_button_data=ImageIO.read(new File("pic/MPbutton_data"+style+".jpg"));
			image_button_clock=ImageIO.read(new File("pic/MPbutton_clock"+style+".png"));
			image_button_focous=ImageIO.read(new File("pic/MPbuttonfocous"+style+".png"));
			image_bigbackground=ImageIO.read(new File("pic/bigbackground"+style+".png"));
			image_divide=ImageIO.read(new File("pic/divide"+style+".jpg"));
			image_rim=new Image[2];
			image_rim[0]=ImageIO.read(new File("pic/rim"+style+"0.png"));
			image_rim[1]=ImageIO.read(new File("pic/rim"+style+"1.png"));
			db[0].img[0]=ImageIO.read(new File("pic/add"+style+".png"));
		    db[1].img[0]=ImageIO.read(new File("pic/delete"+style+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g2){
		g = (Graphics2D) g2;
		g.drawImage(image_background,0,0,Main_Window.data.dsizex,bsjy*2+bsy,null);
	    g.drawImage(image_button_focous,bsjx/2+(bsjx+bsx)*(now_panel-1),0,bsjx+bsx,bsjy*2+bsy,null);

		g.drawImage(image_button_data,bsjx,bsjy,bsx,bsy,null);
		g.drawImage(image_button_clock,bsjx*2+bsx,bsjy,bsx,bsy,null);
		if(now_panel==1){
			drawData(g);
		}
		else if(now_panel==2){
			drawClock(g);
		}
		for(int i=0;i<2;i++){
			if(db[i].choose==1){
				g.drawImage(image_bdback,db[i].x-5,db[i].y,db[i].w+10,db[i].h+5,null);
			}
		}
		g.drawImage(db[0].img[0],db[0].x,db[0].y,db[0].w,db[0].h,null);
		g.drawImage(db[1].img[0],db[1].x,db[1].y,db[1].w,db[1].h,null);
	}
	
	private void drawClock(Graphics2D g) {
		int i=0,j,n;
		g.drawImage(image_bigbackground,0,bsjy*2+bsy,Main_Window.data.dsizex,Main_Window.data.dsizey-bsjy*2-bsy,null);
		if(Main_Window.data.have_clock_num<=max){
			n=Main_Window.data.have_clock_num;
			move2=-1;
		}
		else {
			n=max;
			if(move2==-1) move2=0;
		}
		for(i=0;i<n;i++){
			g.drawImage(image_rim[i%2],stringj,bsjy*2+bsy+10+stringh*i,Main_Window.data.dsizex-stringj*2,stringh,null);
		}
		g.setFont(new Font("宋体",Font.BOLD,12));
		if(move2==-1){
			j=-1;
			for(i=0;i<Main_Window.data.clock_num;i++){
				if(Main_Window.data.clock[i]!=null){
					j++;
					g.drawString(getCLString(Main_Window.data.clock[i]),stringj*2,bsjy*2+bsy+10+stringh*j+stringh/4*3);
				}
			}
		}
		else{
			j=-1;
			for(i=0;i<Main_Window.data.clock_num;i++){
				if(Main_Window.data.clock[i]!=null){
					j++;
					if(j>=move2 && j<move2+max){
						g.drawString(getCLString(Main_Window.data.clock[i]),stringj*2,bsjy*2+bsy+10+stringh*(j-move2)+stringh/4*3);	
					}
				}
			}
		}
		g.drawImage(image_divide,stringj,bsjy*2+bsy+10+stringh*max,Main_Window.data.dsizex-stringj*2,stringh*2,null);
	}

	private String getCLString(TimeEvent te) {
		String s1="";
		int hour=0;
		if(te.name.contains("闹钟")==false && te.name.contains("时间")==false && te.name.contains("提醒")==false){
			s1=s1+"闹钟-";
		}
		s1=s1+te.name+"： ";
		for(int i=0;i<24;i++){
			if(te.hour[i]==true){
				hour=i;
				break;
			}
		}
		if(hour>=10){
			s1=s1+hour+" 时 ";
		}
		else s1=s1+"0"+hour+" 时 ";
		if(te.min>=10){
			s1=s1+te.min+" 分";
		}
		else if(te.min!=-1){
			s1=s1+"0"+te.min+" 分";
		}
		return s1;
	}

	private void drawData(Graphics2D g) {
		int i=0,j,n;
		g.drawImage(image_bigbackground,0,bsjy*2+bsy,Main_Window.data.dsizex,Main_Window.data.dsizey-bsjy*2-bsy,null);
		if(Main_Window.data.have_date_num<=max){
			n=Main_Window.data.have_date_num;
			move1=-1;
		}
		else {
			n=max;
			if(move1==-1) move1=0;
		}
		for(i=0;i<n;i++){
			g.drawImage(image_rim[i%2],stringj,bsjy*2+bsy+10+stringh*i,Main_Window.data.dsizex-stringj*2,stringh,null);
		}
		g.setFont(new Font("宋体",Font.BOLD,12));
		if(move1==-1){
			j=-1;
			for(i=0;i<Main_Window.data.date_num;i++){
				if(Main_Window.data.date[i]!=null){
					j++;
					g.drawString(getTEString(Main_Window.data.date[i]),stringj*2,bsjy*2+bsy+10+stringh*j+stringh/4*3);
				}
			}
		}
		else{
			j=-1;
			for(i=0;i<Main_Window.data.date_num;i++){
				if(Main_Window.data.date[i]!=null){
					j++;
					if(j>=move1 && j<move1+max){
						g.drawString(getTEString(Main_Window.data.date[i]),stringj*2,bsjy*2+bsy+10+stringh*(j-move1)+stringh/4*3);	
					}
				}
			}
		}
		g.drawImage(image_divide,stringj,bsjy*2+bsy+10+stringh*max,Main_Window.data.dsizex-stringj*2,stringh*2,null);
	}

	private String getTEString(TimeEvent te) {
		String s1;
		if(te.year==-1){
			s1=Get_Time.now_time.get(Calendar.YEAR)+"年";
		}
		else{
			s1=te.year+"年";
		}
		
		if(te.month>=10){
			s1=s1+te.month+"月";
		}
		else s1=s1+"0"+te.month+"月";
		
		if(te.day>=10){
			s1=s1+te.day+"日";
		}
		else s1=s1+"0"+te.day+"日";
		
		if(te.year==-1 && te.month==(Get_Time.now_time.get(Calendar.MONTH)+1) && te.day==Get_Time.now_time.get(Calendar.DAY_OF_MONTH)){
			return te.name+"："+s1+" 正是今日！";
		}
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
		long from = 0,to=0;
		try {
			to =  Get_Time.now_time.getTimeInMillis();
			from = df.parse(s1).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(from-to>0){
			s1=te.name+"："+s1+" 还有："+(int)((from - to) / (1000 * 60 * 60 * 24)+1)+"天";
		}
		else{
			if(te.year!=-1){
				s1=te.name+"："+s1+" 已经："+(int)((to - from) / (1000 * 60 * 60 * 24))+"天";
			}
			else{
				to =  Get_Time.now_time.getTimeInMillis();
				s1=(Get_Time.now_time.get(Calendar.YEAR)+1)+"年";
				if(te.month>=10){
					s1=s1+te.month+"月";
				}
				else s1=s1+"0"+te.month+"月";
				
				if(te.day>=10){
					s1=s1+te.day+"日";
				}
				else s1=s1+"0"+te.day+"日";
				try {
					to =  Get_Time.now_time.getTimeInMillis();
					from = df.parse(s1).getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				s1=te.name+"："+s1+" 还有："+(int)((from - to) / (1000 * 60 * 60 * 24)+1)+"天";
			}
		}
		return s1;
	}

	
	private class MLC implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			int x1=e.getX();
	    	int y1=e.getY();
	    	if(x1>=db[0].x-5 && x1<=db[0].x+db[0].w+10 && y1>=db[0].y && y1<=db[0].y+db[0].h+5){
	    		   if(now_panel==1){
	    			   new Set_Date_Dialog();
	    		   }
	    		   else{
	    			   new Set_Clock_Dialog();
	    		   }
	        }
	    	if(x1>=db[1].x-5 && x1<=db[1].x+db[1].w+10 && y1>=db[1].y && y1<=db[1].y+db[1].h+5){
	    		   if(now_panel==1){
	    			   new Remove_Date();
	    		   }
	    		   else{
	    			   new Remove_Clock();
	    		   }
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
	    	   if(x1>=bsjx && x1 <bsx+bsjx && y1>=0 && y1<=bsjy*2+bsy){
	    		   now_panel=1;
	    		   jp.repaint();
	    	   }
	    	   else if(x1>=2*bsjx+bsx && x1 <2*(bsjx+bsx) && y1>=0 && y1<=bsjy*2+bsy){
	    		   now_panel=2;
	    		   jp.repaint();
	    	   }
	    	   
	    	   for(int i=0;i<2;i++){
	    		   if(x1>=db[i].x-5 && x1<=db[i].x+db[i].w+10 && y1>=db[i].y && y1<=db[i].y+db[i].h+5){
	    			   if(db[i].choose==0){
	    				   db[i].choose=1;
	    			   	   jp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    			   	   jp.repaint();
	    			   }
	    		   }
	    		   else if(db[i].choose==1){
	    			   db[i].choose=0;
	    			   jp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    			   jp.repaint();
	    		   }
	    	   }
	       }
	       public void mouseDragged(MouseEvent e){}
	}
	
	private class MWL  implements  MouseWheelListener{

		public void mouseWheelMoved(MouseWheelEvent e) {
			int dir = e.getWheelRotation();
		    if (dir == 1 && now_panel==1 && move1!=-1 &&move1+max<Main_Window.data.have_date_num) {
		    	move1++;
		    	jp.repaint();
		    }
		    if (dir == -1 && now_panel==1 && move1!=-1 && move1+max>0) {
		    	move1--;
		    	jp.repaint();
		    }
		    if (dir == 1 && now_panel==2 && move2!=-1 && move2+max<Main_Window.data.have_clock_num) {
		    	move2++;
		    	jp.repaint();
		    }
		    if (dir == -1 && now_panel==2 && move2!=-1 && move2+max>0) {
		    	move2--;
		    	jp.repaint();
		    }
		}
		
	}
}
