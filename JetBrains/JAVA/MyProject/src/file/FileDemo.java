package file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //文件的构造器是用来创建文件对象的，我们创建文件对象的时候要保证文件路径正确
        File f = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\t.txt");
        System.out.println(f.getName());

        File f1 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop","t.txt");
        System.out.println(f1.getName());

        //java中的File类的对象可以代表目录，也可以是文件
        File f2 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop");
        System.out.println(f2.getName());

        //根据目录的文件对象创建一个文件
        File f3 = new File(f2,"t.txt");
        System.out.println(f3.getName());


        File f4 = new File(f2,"p.txt");
        //判断文件是否存在
        System.out.println(f4.exists());
        boolean newFile = f4.createNewFile();
        System.out.println(newFile);

        //创建一个文件目录，创建的目录的上一层的路径必须正确
        File f5 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\a");
        boolean mkdir = f5.mkdir();
        System.out.println(mkdir);

        //创建多级目录
        File f6 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\a\\b\\c\\d\\f\\g");
        boolean mkdirs = f6.mkdirs();
        System.out.println(mkdirs);

        /*//删除文件,程序删除不走回收站，文件目录的删除则必须要是空目录才能被删除
        f.delete();*/

        //获得文件的绝对路径
        File f7 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\t.txt");
        File abs = f7.getAbsoluteFile();
        System.out.println("文件的绝对路径："+abs);

        //创建一个文件对象，用相对路径，相对路径就是当前的项目是根路径
        File f8 = new File("a.txt");
//        f8.createNewFile();
        File abs1 = f8.getAbsoluteFile();
        System.out.println("文件的绝对路径："+abs1);

        //获得的就是当前文件对象的路径
        String p1 = f8.getPath();
        System.out.println("文件路径："+p1);

        //获得文件名
        String filename = f8.getName();
        System.out.println("获得文件名："+filename);

        //获得a.txt的大小
        long filelength = f8.length();
        System.out.println("文件大小："+filelength);

        //获得文件最后修改时间
        long modifiledtime = f8.lastModified();
        System.out.println("文件最后修改时间："+modifiledtime);

        //获得电脑磁盘的根目录
        File[] f9 = File.listRoots();
        System.out.println(Arrays.toString(f9));

        //获得一个目录下的子文件对象
        File f10 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\a");
        File[] fs10 = f10.listFiles();
        for (File fs1:fs10){
            System.out.println(fs1);
        }

        //获得子文件的名字
        String[] f10list = f10.list();
        System.out.println(Arrays.toString(f10list));

        //判断文件是否存在
        boolean isexists = f.exists();
        System.out.println(isexists);

        //判断这个文件对象是否是文件
        boolean isfile = f.isFile();
        boolean isfile1 = f5.isFile();
        System.out.println("是否是文件："+isfile);
        System.out.println("是否是文件："+isfile1);//f5文件对象是文件夹不是文件，所以是false

        //判断这个文件对象是否是目录
        boolean isdir = f.isDirectory();
        boolean isdir1 = f5.isDirectory();
        System.out.println("是否是目录："+isdir);
        System.out.println("是否是目录："+isdir1);

        //判断一个文件对象是否是绝对路径
        boolean isabsolute = f.isAbsolute();
        System.out.println("是否是决定路径："+isabsolute);

        //判断文件能否可读
        boolean canread = f.canRead();
        System.out.println("文件是否可读："+canread);

        //判断文件能否可写
        boolean canwrite = f.canWrite();
        System.out.println("文件是否可写："+canwrite);

        //判断文件是否是隐藏
        boolean ishidden = f.isHidden();
        System.out.println("文件是否是隐藏："+ishidden);
    }
}
