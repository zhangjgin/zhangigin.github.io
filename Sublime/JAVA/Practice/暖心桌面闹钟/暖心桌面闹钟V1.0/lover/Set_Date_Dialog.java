package lover;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Set_Date_Dialog extends JDialog{
	private static final long serialVersionUID = -3830826975139259166L;
	
	private JTextField jtf_y,jtf_m,jtf_d,jtf_name;
	private JButton jb_set_record,jb_set_festival,jb_ok,jb_cancel;
	private JDialog jd=this;
	private int choose=0;
	Container container;
	public Set_Date_Dialog(){
		jd.setTitle("添加纪念日");
		jd.setBounds(400,200,300,100);
		container=getContentPane();
		container.setLayout(new GridLayout(1,2,10,10));
		jb_set_festival=new JButton("设置节日");
		jb_set_festival.addActionListener(new JBAL());
		container.add(jb_set_festival);
		jb_set_record=new JButton("设置纪念日");
		jb_set_record.addActionListener(new JBAL());
		container.add(jb_set_record);
		jd.setVisible(true);
	}
	
	public void Set_Record(){
		choose=2;
		jd.remove(jb_set_record);
		jd.remove(jb_set_festival);
		jd.setBounds(400,200,400,300);
		container.setLayout(new GridLayout(5,2,10,10));
		container.add(new JLabel("年："));
		jtf_y=new JTextField();
		container.add(jtf_y);
		container.add(new JLabel("月："));
		jtf_m=new JTextField();
		container.add(jtf_m);
		container.add(new JLabel("日："));
		jtf_d=new JTextField();
		container.add(jtf_d);
		container.add(new JLabel("标题："));
		jtf_name=new JTextField();
		container.add(jtf_name);
		jb_ok=new JButton("确定");
		jb_ok.addActionListener(new JBAL());
		container.add(jb_ok);
		jb_cancel=new JButton("取消");
		jb_cancel.addActionListener(new JBAL());
		container.add(jb_cancel);
		jd.setVisible(true);
	}
	
	public void Set_Festival(){
		choose=1;
		jd.remove(jb_set_record);
		jd.remove(jb_set_festival);
		jd.setBounds(400,200,400,250);
		container.setLayout(new GridLayout(4,2,10,10));
		jtf_y=null;
		container.add(new JLabel("月："));
		jtf_m=new JTextField();
		container.add(jtf_m);
		container.add(new JLabel("日："));
		jtf_d=new JTextField();
		container.add(jtf_d);
		container.add(new JLabel("标题："));
		jtf_name=new JTextField();
		container.add(jtf_name);
		jb_ok=new JButton("确定");
		jb_ok.addActionListener(new JBAL());
		container.add(jb_ok);
		jb_cancel=new JButton("关闭");
		jb_cancel.addActionListener(new JBAL());
		container.add(jb_cancel);
		jd.setVisible(true);
	}
	
	private class JBAL implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton t=(JButton)e.getSource();
			if(t==jb_set_record){
				Set_Record();
			}
			else if(t==jb_set_festival){
				Set_Festival();
			}
			else if(t==jb_ok){
				int y;
				if(choose==2){
					String s_y=jtf_y.getText(); s_y.trim();
					y=Integer.parseInt(s_y);
				}
				else y=-1;
				String s_m=jtf_m.getText(); s_m.trim();
				int m=Integer.parseInt(s_m);
				String s_d=jtf_d.getText(); s_d.trim();
				int d=Integer.parseInt(s_d);
				String s_name=jtf_name.getText(); s_name.trim();
				boolean o=true;
				String tip_string="Tip:";
				if(y!=-1 && y<0){
					tip_string=tip_string+" YEAR out of range. ";
					o=false;
				}
				
				if(m<1 || m>12){
					tip_string=tip_string+" MONTH out of range(1~12). ";
					o=false;
				}
				
				if(d<1 || d>31){
					tip_string=tip_string+" DAY out of range (1~31). ";
					o=false;
				}
				if(o==true){
					if(Main_Window.data.set_date(y, m, d,s_name)==true){
						Main_Window.data.save_data();
						JOptionPane.showMessageDialog(jd,"添加成功","提示",JOptionPane.PLAIN_MESSAGE);
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
}
