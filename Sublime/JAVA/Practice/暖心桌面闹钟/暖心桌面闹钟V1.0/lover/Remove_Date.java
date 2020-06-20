package lover;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Remove_Date extends JDialog{
	private static final long serialVersionUID = -964498626164413122L;
	private JDialog jd=this;
	private JButton close,jb[]=new JButton[5];
	private JLabel label[]=new JLabel[5];
	private int move=0;
	Container container;
	public Remove_Date(){
		jd.setTitle("É¾³ý¼ÍÄîÈÕ");
		jd.setBounds(400,200,300,400);
		jd.addMouseWheelListener(new MWL());
		container=getContentPane();
		container.setLayout(new GridLayout(7,1,10,10));
		for(int i=0;i<5;i++){
			label[i]=new JLabel();
			container.add(label[i]);
		}
		
		int n=0;
		for(int i=0;i<Main_Window.data.date_num;i++){
			if(Main_Window.data.date[i]!=null){
				label[n].setText("ÐòºÅ£º0"+(n+1)+":"+Main_Window.data.date[i].name);
				n++;
				if(n==5) break;
			}
		}
			
		JPanel jp;
		jp=new JPanel(new GridLayout(1,5,10,10));
		for(int i=0;i<5;i++){
			jb[i]=new JButton(""+(i+1));
			jb[i].addActionListener(new JBAL());
			jp.add(jb[i]);
		}
		container.add(jp);
		close=new JButton("¹Ø±Õ");
		close.addActionListener(new JBAL());
		container.add(close);
		jd.setVisible(true);
	}
	
	private class JBAL implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton t=(JButton)e.getSource();
			for(int i=0;i<5;i++){
				if(t==jb[i]){
					int n=0;
					for(int j=0;j<Main_Window.data.date_num;j++){
						if(Main_Window.data.date[j]!=null){
							n++;
							if(n==i+1+move){
								Main_Window.data.date[j]=null;
								Main_Window.data.have_date_num--;
								if(move>0) move--;
								if(Main_Window.data.have_date_num<=5){
									move=0;
								}
								Main_Window.data.save_data();
								break;
							}
						}
					}
					n=0;
					for(int j=0;j<Main_Window.data.date_num;j++){
						if(Main_Window.data.date[j]!=null){
							if(n>=move) label[n-move].setText("ÐòºÅ£º0"+(n-move+1)+":"+Main_Window.data.date[j].name);
							n++;
							if(n==(5+move)) break;
						}
					}
					n=5+move-n;
					if(n>0){
						for(int j=4;j>4-n;j--){
							label[j].setText("");
						}
					}
					break;
				}
			}
			if(t==close){
				jd.setVisible(false);
			}
		}
	}
	
	private class MWL  implements  MouseWheelListener{

		public void mouseWheelMoved(MouseWheelEvent e) {
			int dir = e.getWheelRotation();
			if(Main_Window.data.have_date_num>5){
				if (dir == 1 ) {
		    		if(move+5<Main_Window.data.have_date_num){
		    			move++;
		    			int n=0;
						for(int j=0;j<Main_Window.data.date_num;j++){
							if(Main_Window.data.date[j]!=null){
								if(n>=move) label[n-move].setText("ÐòºÅ£º0"+(n-move+1)+":"+Main_Window.data.date[j].name);
								n++;
								if(n==(5+move)) break;
							}
						}
		    		}
		    	}
		    	if (dir == -1) {
		    		if(move>0){
		    			move--;
		    			int n=0;
						for(int j=0;j<Main_Window.data.date_num;j++){
							if(Main_Window.data.date[j]!=null){
								if(n>=move) label[n-move].setText("ÐòºÅ£º0"+(n-move+1)+":"+Main_Window.data.date[j].name);
								n++;
								if(n==(5+move)) break;
							}
						}
		    		}
		    	}
			}
		}
		
	}
}
