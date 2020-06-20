package files;

import java.io.File;
import java.io.FileFilter;

public class TestShowAllFiles {
	
	static int count = 0;

	public static void main(String[] args) throws Exception{
		
		File dir = new File("E:\\");
		
		showAll(new File("E:\\"));
		
		System.out.println(count);
	}

	/**
	 * 定义一个方法，访问一个文件夹中的所有.class文件
	 */
	
	public static void showAll(File dir){
		
		//获取dir所代表的"E盘"中，所有的文件夹 + 所有的 .class 文件
		File[] files = dir.listFiles( new FileFilter(){
			@Override
			public boolean accept(File file) {
				
				if(file.isDirectory()){
					return true;
				}
				
				if(file.isFile()){
					if(file.getName().endsWith(".class")){
						return true;
					}
				}
				return false;
			}
		} );
		
		if(files != null){
			for (File file : files) {
				if(file.isFile()){
					count++;
					System.out.println(file.getAbsolutePath());
				}else{
					//递归查找所有文件夹中的所有.class
//					if(file.getName().equals("eclipse(3)")){
//						continue;
//					}
					showAll(file);
				}
			}
		}
	}
}
