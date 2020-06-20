package bytes;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedSteam {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream os = new FileOutputStream("Files\\buffer.txt");//�ڵ���

		BufferedOutputStream bos = new BufferedOutputStream(os);//������
		
		bos.write('A');
		
		bos.write('B');
		
		bos.write('C');
		
		bos.write('D');
		
		bos.flush();//ˢ�»��壨�������е����ݣ�һ����д���ļ��У�����ջ�������
		
		bos.write('E');
		
		bos.write('F');
		
		bos.close();//����ִ��flush()
		
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
