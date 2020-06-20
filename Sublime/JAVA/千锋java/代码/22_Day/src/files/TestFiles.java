package files;

import java.io.File;
import java.io.IOException;

public class TestFiles {

	public static void main(String[] args) throws IOException, InterruptedException {

		File file = new File("Files\\subDir");
		
//		System.out.println(file.canWrite());
//		System.out.println(file.canRead());
//		System.out.println(file.canExecute());//所有可打开的文件，都是可执行的
//		file.delete();
//		file.createNewFile();
//		System.out.println(file.exists());
//		System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getTotalSpace() / 1024 / 1024 / 1024 );
//		System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024);
//		System.out.println(file.isHidden());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println( (System.currentTimeMillis() - file.lastModified()) / 1000 / 60);
//		file.mkdir();
		Thread.sleep(3000);
		file.deleteOnExit();
		
	}

}
