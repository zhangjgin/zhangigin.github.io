package test;

import java.io.*;
import java.util.Scanner;

public class TestFileCopy {

	/**
	 * �������ļ���������ԭ�ļ��е����� 
	 */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ļ�����");
		String fileName = input.next();
		boolean result = false;
		try {
			result = copyFile(fileName); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	private static boolean copyFile(String fileName) throws IOException{
		File copyFile = createFile(fileName);
		if(copyFile != null){
			InputStream is = new FileInputStream(fileName);
			OutputStream os = new FileOutputStream(copyFile);
			byte[] bs = new byte[5];
			while(true){
				int c = is.read(bs);
				if(c == -1)
					break;
				os.write(bs,0,c);
			}
			is.close();
			os.close();
			return true;
		}
		return false;
	}
	
	private static File createFile(String fileName) throws IOException {
		File file = new File(fileName);
		if(file.exists()){
			System.out.println(file.getParent());
			File copyFile = new File(file.getParent() + "\\copy_" + file.getName());
			copyFile.createNewFile();
			return copyFile;
		}else{
			System.out.println("ԭ�ļ�������");
		}
		return null;
	}
	
	

}
