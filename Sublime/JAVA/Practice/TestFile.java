import java.io.*;
public class TestFile{

	public static void main(String[] args){

		String separator = File.separator;

		String filename = "myfile.txt";

		String directory = "mydir3" + separator ;

		File f  = new File(directory,filename);

		if (f.exists()) {

		 	System.out.println("�ļ�����"     + f.getAbsolutePath());

		 	System.out.println("�ļ���С��" + f.length());

		 	

		}else {

		 	f.getParentFile().mkdirs();

		 	try {

		 		f.createNewFile();

		 	} catch (IOException e) {

		 		 e.printStackTrace();

		 	}

		}

	}

}