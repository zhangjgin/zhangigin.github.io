package lover;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Set_Clock_Dialog extends JDialog{
	private static final long serialVersionUID = 8981013586575329121L;
	
	private JTextField jtf_mon,jtf_d,jtf_h,jtf_m,jtf_name,jtf_imp;
	private JLabel week_label[]=new JLabel[7];
	private JButton jb_set_date,jb_set_week,jb_ok,jb_cancel,jb_week[]=new JButton[7];
	private JDialog jd=this;
	private JPanel jp=null;
	private boolean date_choose=false,week_choose=false,week[]=new boolean[8];
	private int mon=-1,day=-1,choose=0;
	Container container;
	public Set_Clock_Dialog(){
		jd.setTitle("添加闹钟");
		jd.setBounds(400,200,400,500);
		container=getContentPane();
		for(int i=0;i<8;i++) week[i]=false;
		set_main();
		jd.setVisible(true);
	}
	
	public void set_main(){
		choose=0;
		if(jp!=null) container.remove(jp);
		jp=new JPanel();
		jp.setLayout(new GridLayout(7,2,10,10));
		jb_set_date=new JButton("日期");
		jb_set_date.addActionListener(new JBAL());
		jp.add(jb_set_date);
		if(date_choose==false)jp.add(new JLabel("未设置（可忽略）"));
		else jp.add(new JLabel("已设置"));
		jb_set_week=new JButton("星期");
		jb_set_week.addActionListener(new JBAL());
		jp.add(jb_set_week);
		if(week_choose==false)jp.add(new JLabel("未设置（可忽略）"));
		else jp.add(new JLabel("已设置"));
		jp.add(new JLabel("时："));
		jtf_h=new JTextField();
		jp.add(jtf_h);
		jp.add(new JLabel("分："));
		jtf_m=new JTextField();
		jp.add(jtf_m);
		jp.add(new JLabel("标题："));
		jtf_name=new JTextField();
		jp.add(jtf_name);
		jp.add(new JLabel("重要性(1~10)："));
		jtf_imp=new JTextField("1");
		jp.add(jtf_imp);
		jb_ok=new JButton("确定");
		jb_ok.addActionListener(new JBAL());
		jp.add(jb_ok);
		jb_cancel=new JButton("返回");
		jb_cancel.addActionListener(new JBAL());
		jp.add(jb_cancel);
		container.add(jp);
		jd.setVisible(true);
	}
	
	public void Set_Date(){
		choose=1;
		container.remove(jp);
		jp=new JPanel();
		jp.setLayout(new GridLayout(3,2,10,10));
		jd.setBounds(400,200,400,300);
		jp.add(new JLabel("月："));
		jtf_mon=new JTextField();
		jp.add(jtf_mon);
		jp.add(new JLabel("日："));
		jtf_d=new JTextField();
		jp.add(jtf_d);
		jb_ok=new JButton("确定");
		jb_ok.addActionListener(new JBAL_S());
		jp.add(jb_ok);
		jb_cancel=new JButton("返回");
		jb_cancel.addActionListener(new JBAL_S());
		jp.add(jb_cancel);
		container.add(jp);
		jd.setVisible(true);
	}
	
	public void Set_Week(){
		choose=2;
		container.remove(jp);
		jp=new JPanel();
		jp.setLayout(new GridLayout(8,2,10,10));
		for(int i=0;i<7;i++){
			jb_week[i]=new JButton("星期"+(i+1));
			jb_week[i].addActionListener(new JBAL_D());
			jp.add(jb_week[i]);
			if(week[i+1]==true) week_label[i]=new JLabel("已选择");
			else week_label[i]=new JLabel("未选择");
			jp.add(week_label[i]);
		}
		jb_ok=new JButton("确定");
		jb_ok.addActionListener(new JBAL_S());
		jp.add(jb_ok);
		jb_cancel=new JButton("清零");
		jb_cancel.addActionListener(new JBAL_S());
		jp.add(jb_cancel);
		container.add(jp);
		jd.setVisible(true);
	}
	
	private class JBAL_D implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton t=(JButton)e.getSource();
			for(int i=0;i<7;i++){
				if(t==jb_week[i]){
					if(week[i+1]==true){
						week[i+1]=false;
						week_label[i].setText("未选择");
					}
					else{
						week[i+1]=true;
						week_label[i].setText("已选择");
					}
				}
			}
		}
	}
	
	private class JBAL implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton t=(JButton)e.getSource();
			if(t==jb_set_date){
				Set_Date();
			}
			else if(t==jb_set_week){
				Set_Week();
			}
			else if(t==jb_ok){
				String s_h=jtf_h.getText(); s_h.trim();
				int h=Integer.parseInt(s_h);
				String s_m=jtf_m.getText(); s_m.trim();
				int m=Integer.parseInt(s_m);
				String s_imp=jtf_imp.getText(); s_imp.trim();
				int imp=Integer.parseInt(s_imp);
				String s_name=jtf_name.getText(); s_name.trim();
				boolean o=true;
				String tip_string="Tip:";
				if(h<0 || h>23){
					tip_string=tip_string+" Hour out of range(0~23). ";
					o=false;
				}
				
				if((m<0 || m>59)&& m!=-1){
					tip_string=tip_string+" MINUTE out of range(-1,0~59). ";
					o=false;
				}
				
				if(imp<1 || imp>10){
					tip_string=tip_string+" IMPORTANT out of range(1~10). ";
					o=false;
				}
				
				if(o==true){
					boolean x1=week[7],o1=false;
					int k;
					for(k=7;k>1;k--){
						week[k]=week[k-1];
					}
					week[1]=x1;
					for(k=1;k<=7;k++){
						if(week[k]==true){
							o1=true;
							break;
						}
					}
					week[0]=o1;
					if(Main_Window.data.set_clock(mon,day,week,h,m,s_name,imp+1)==true){
						Main_Window.data.save_data();
						JOptionPane.showMessageDialog(jd,"添加成功","提示",JOptionPane.PLAIN_MESSAGE);
						date_choose=false;week_choose=false;week=new boolean[8];
						for(k=0;k<8;k++) week[k]=false;
						mon=-1;day=-1;choose=0;set_main();
					}
					else{
						JOptionPane.showMessageDialog(jd,"添加失败","警告",JOptionPane.PLAIN_MESSAGE);
					}
				}
				else{
					JOptionPane.showMessageDialog(jd,tip_string,"ERROR",JOptionPane.PLAIN_MESSAGE);
				}
			}
			else if(t==jb_cancel){
				setVisible(false);
			}
		}		
	}
	
	private class JBAL_S implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton t=(JButton)e.getSource();
			if(choose==1){
				if(t==jb_ok){
					String s_mon=jtf_mon.getText(); s_mon.trim();
					int m=Integer.parseInt(s_mon);
					String s_d=jtf_d.getText(); s_d.trim();
					int d=Integer.parseInt(s_d);
					boolean o=true;
					String tip_string="Tip:";
					if(m<1 && m>12){
						tip_string=tip_string+" MONTH out of range(1~12). ";
						o=false;
					}
				
					if(d<1 || d>31){
						tip_string=tip_string+" DAY out of range(1~31). ";
						o=false;
					}
					if(o==true){
						day=d; mon=m; date_choose=true; set_main();
					}
					else{
						JOptionPane.showMessageDialog(jd,tip_string,"ERROR",JOptionPane.PLAIN_MESSAGE);
					}
				}
				else if(t==jb_cancel){
					set_main();
				}
			}
			else if(choose==2){
				if(t==jb_ok){
					week_choose=true;
					set_main();
				}
				else if(t==jb_cancel){
					for(int k=0;k<8;k++){
						week[k]=false;
					}
					week_choose=false;
					set_main();
				}
			}
		}		
	}
}
