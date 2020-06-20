package files;

import java.io.File;
import java.io.FileFilter;

public class TestListFiles {

	public static void main(String[] args) {

		File dir = new File("E:\\");
		/*
		 * String[] fileNames = dir.list();//获取文件夹中所有文件（含文件夹）的名字 for (String
		 * fileName : fileNames) { System.out.println(fileName); }
		 */

		File[] files = dir.listFiles( new MyFilter() );// 获取文件夹中所有文件（含文件夹）的对象

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
		File[] fs = new File[x];//返回给用户的数组
		
		//从文件夹中获取所有文件
		File f;
		
		boolean result = filter.accept(f);
		
		if(result){
			fs[i] = f;
		}
	}
}*/