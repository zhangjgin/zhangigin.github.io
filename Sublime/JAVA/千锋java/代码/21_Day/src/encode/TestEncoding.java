package encode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestEncoding {

	public static void main(String[] args) throws IOException {
		
		String s1 = "�������123abc��";
		
		byte[] bs = s1.getBytes("GBK");//GBK���ġ����롱Ϊ������
		
		
		//ʹ����д�뵽�ļ���
//		FileOutputStream os = new FileOutputStream("xxx");
//		os.write(bs);
		
		
		String s2 = new String(bs , "BIG5");//�����ơ����롱ΪGBK����
		
		System.out.println(s2);
		
		byte[] bs2 = s2.getBytes("BIG5");
		
		String s3 = new String(bs2,"GBK");
	
		System.out.println(s3);
	}

}
