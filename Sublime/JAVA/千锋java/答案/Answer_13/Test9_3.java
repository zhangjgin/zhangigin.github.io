package chp15;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Test9_3{
	public static void main(String[] args){
		FileOutputStream os = null;
		Writer w = null;
		PrintWriter pw = null;
		try{
			os = new FileOutputStream("test.txt",true);
			w = new OutputStreamWriter(os, "GBK");
			pw = new PrintWriter(w);
			pw.println("Hello World");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			pw.close();
		}
		//======================== 下面是读取test.txt文件=======================
		FileInputStream in = null;
		Reader re = null;
		BufferedReader br = null;
		String line = null;
		try{
			in = new FileInputStream("test.txt");
			re = new InputStreamReader(in,"GBK");
			br = new BufferedReader(re);
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				re.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
