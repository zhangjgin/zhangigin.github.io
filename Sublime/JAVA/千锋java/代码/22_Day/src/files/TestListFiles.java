package files;

import java.io.File;
import java.io.FileFilter;

public class TestListFiles {

	public static void main(String[] args) {

		File dir = new File("E:\\");
		/*
		 * String[] fileNames = dir.list();//��ȡ�ļ����������ļ������ļ��У������� for (String
		 * fileName : fileNames) { System.out.println(fileName); }
		 */

		File[] files = dir.listFiles( new MyFilter() );// ��ȡ�ļ����������ļ������ļ��У��Ķ���

		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}

class MyFilter implements FileFilter{
	@Override
	public boolean accept(File file) {//1812
		if(file.isFile()){
			if(file.getName().endsWith(".class")){
				return true;
			}
		}
		return false;
	}
}




/*class File {
	public File[] listFile() {

	}

	public File[] listFile(FileFilter filter) {
		File[] fs = new File[x];//���ظ��û�������
		
		//���ļ����л�ȡ�����ļ�
		File f;
		
		boolean result = filter.accept(f);
		
		if(result){
			fs[i] = f;
		}
	}
}*/