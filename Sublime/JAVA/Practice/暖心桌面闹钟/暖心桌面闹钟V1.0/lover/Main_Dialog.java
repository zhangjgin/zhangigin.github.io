package lover;

import java.awt.Point;

import javax.swing.JDialog;

public class Main_Dialog extends JDialog{
	private static final long serialVersionUID = 1041506402804552302L;
	private Menu_Panel mp;
	public static JDialog jd;
	public Main_Dialog(int style){
		super();
		setUndecorated(true);
		jd=this;
		Point p = Main_Window.main_window.getLocation(); 
		setBounds(p.x-Main_Window.data.dsizex-10,p.y,Main_Window.data.dsizex,Main_Window.data.dsizey);
		setVisible(false);
		mp=new Menu_Panel(style);
		this.add(mp);
	}
	
	
	
}
