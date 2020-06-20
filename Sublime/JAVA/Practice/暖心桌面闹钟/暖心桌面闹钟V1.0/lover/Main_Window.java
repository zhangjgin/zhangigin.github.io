package lover;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

public class Main_Window extends JWindow{
	private static final long serialVersionUID = -7705639305892667795L;
	public static JWindow main_window;
    public Pendant_Panel pp;
    public static DATA data;
    public static Clock_Tip_Window ctw;
    public static int screen_x,screen_y;
    private Get_Time gtime;
    private SystemTray systemTray;
	private TrayIcon trayicon;
	@SuppressWarnings("restriction")
	public Main_Window(){
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		screen_x=screenSize.width;
		screen_y=screenSize.height;
		data=new DATA();
		data.save_data();
		main_window=new JWindow();
		main_window.setSize(data.sizex,data.sizey);
		main_window.setLocation(screen_x-data.sizex-100,50);
		main_window.setAlwaysOnTop(true);
		com.sun.awt.AWTUtilities.setWindowOpacity(main_window, (float)1);
		com.sun.awt.AWTUtilities.setWindowShape(main_window,new RoundRectangle2D.Double(0,0,data.sizex,data.sizey,40,40));
		gtime=new Get_Time();
		gtime.start();
		try {
			miniTray();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		pp=new Pendant_Panel(0);
		main_window.add(pp);
		ctw=new Clock_Tip_Window(0);
		main_window.setVisible(true);
	}
	
	protected void miniTray() throws AWTException {
		if(SystemTray.isSupported()){
			ImageIcon icon = new ImageIcon("pic/img.png");
			PopupMenu popupMenu=new PopupMenu();
			trayicon=new TrayIcon(icon.getImage(),"暖心桌面闹钟 V1.0",popupMenu);
			
			systemTray= SystemTray.getSystemTray();
			systemTray.add(trayicon);
			
			MenuItem mi_set_clock = new MenuItem("添加闹钟");
			mi_set_clock.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   new Set_Clock_Dialog();
		    }});
			popupMenu.add(mi_set_clock);
			
			MenuItem mi_remove_clock = new MenuItem("删除闹钟");
			mi_remove_clock.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   new Remove_Clock();
		    }});
			popupMenu.add(mi_remove_clock);
			
			MenuItem mi_set_date = new MenuItem("添加纪念日");
			mi_set_date.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   new Set_Date_Dialog();
		    }});
			popupMenu.add(mi_set_date);
			
			MenuItem mi_remove_date = new MenuItem("删除纪念日");
			mi_remove_date.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   new Remove_Date();
		    }});
			popupMenu.add(mi_remove_date);
			
			popupMenu.addSeparator();
			
			MenuItem mi_music_open= new MenuItem("开启声音");
			mi_music_open.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   data.music=true;
					   data.save_data();
		    }});
			popupMenu.add(mi_music_open);
			
			MenuItem mi_music_close= new MenuItem("关闭声音");
			mi_music_close.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   data.music=false;
					   data.save_data();
		    }});
			popupMenu.add(mi_music_close);
			
			MenuItem mi_about=new MenuItem("关于");
			mi_about.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   JOptionPane.showMessageDialog(null,"【宝贝瑶，生日快乐~！】 暖心桌面闹钟 V1.0  作者：桑弘毅","关于",JOptionPane.PLAIN_MESSAGE);
		    }});
			popupMenu.add(mi_about);
			
			popupMenu.addSeparator();
			
			MenuItem mi_hide = new MenuItem("隐藏");
			mi_hide.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   if(main_window.isVisible()==true){
						   	main_window.setVisible(false);
					   }
		    }});
			popupMenu.add(mi_hide);
			
			MenuItem mi_show = new MenuItem("还原");
			mi_show.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   if(main_window.isVisible()==false){
						   	main_window.setVisible(true);
				    		main_window.toFront();
					   }
		    }});
			popupMenu.add(mi_show);
			
			MenuItem mi_exit=new MenuItem("退出");
			mi_exit.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   systemTray.remove(trayicon);
						System.exit(0);
		    }});
			popupMenu.add(mi_exit);
			
			trayicon.addMouseListener(new MouseAdapter(){  
	            public void mouseClicked(MouseEvent e){  
	                	main_window.setVisible(true);
	                	main_window.toFront();
	            }  
	        });  
		}
		
	}
	
	public static void main(String[] args) {
		new Main_Window();
	}

}
