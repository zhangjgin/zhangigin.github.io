package bytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws Exception{
		
		//绝对路径：E:\\1812\\Codes\\day21\\Files\\Target.txt
		//相对路径：Files\\Target.txt   与上一种形式等价
		
		//字节输出流											硬编码
		FileOutputStream fos = new FileOutputStream("Files\\Target.txt");//E:\
		
		//fos.write(65);//一次输出一个字节
		
		//fos.write(66);
		
		//fos.write('C');//'C' --> 67
		
		byte[] bs = new byte[]{65,66,67,68,69};
		
		//fos.write(bs);//一次输出一组字节
		
		fos.write(bs , 1 , 3);//一次输出一组字节的一部分
		
	}

}
