package chp15;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class Test9_2 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("test.txt");
		Reader re = new InputStreamReader(in,"GBK");
		BufferedReader br = new BufferedReader(re);
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		re.close();
	}
}