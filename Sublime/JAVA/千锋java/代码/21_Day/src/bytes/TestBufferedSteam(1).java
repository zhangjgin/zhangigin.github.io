package bytes;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedSteam {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream os = new FileOutputStream("Files\\buffer.txt");//节点流

		BufferedOutputStream bos = new BufferedOutputStream(os);//过滤流
		
		bos.write('A');
		
		bos.write('B');
		
		bos.write('C');
		
		bos.write('D');
		
		bos.flush();//刷新缓冲（将缓冲中的数据，一次性写入文件中，并清空缓冲区）
		
		bos.write('E');
		
		bos.write('F');
		
		bos.close();//级联执行flush()
		
		//--------------------------------------------------------------------------
		
		FileInputStream is = new FileInputStream("Files\\buffer.txt");
		
		byte[] cache = new byte[4];
		
		while(true){
			int count = is.read(cache);
			
			if(count == -1) break;
			
			for (int i = 0; i < count; i++) {
				System.out.print(cache[i] +"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
