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
	 * ����һ������������һ���ļ����е�����.class�ļ�
	 */
	
	public static void showAll(File dir){
		
		//��ȡdir�������"E��"�У����е��ļ��� + ���е� .class �ļ�
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
					//�ݹ���������ļ����е�����.class
//					if(file.getName().equals("eclipse(3)")){
//						continue;
//					}
					showAll(file);
				}
			}
		}
	}
}
