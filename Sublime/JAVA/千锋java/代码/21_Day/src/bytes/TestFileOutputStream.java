package bytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws Exception{
		
		//����·����E:\\1812\\Codes\\day21\\Files\\Target.txt
		//���·����Files\\Target.txt   ����һ����ʽ�ȼ�
		
		//�ֽ������											Ӳ����
		FileOutputStream fos = new FileOutputStream("Files\\Target.txt");//E:\
		
		//fos.write(65);//һ�����һ���ֽ�
		
		//fos.write(66);
		
		//fos.write('C');//'C' --> 67
		
		byte[] bs = new byte[]{65,66,67,68,69};
		
		//fos.write(bs);//һ�����һ���ֽ�
		
		fos.write(bs , 1 , 3);//һ�����һ���ֽڵ�һ����
		
	}

}
