package lover;

import java.awt.Image;

public class DrawButton {
	public Image img[]=new Image[2];
	public int x,y,w,h,choose;
	public DrawButton(int x,int y,int w,int h){
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		choose=0;
	}
}
