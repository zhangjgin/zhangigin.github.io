package file;

import java.io.File;

public class RecursionDemo1 {
    //定义一个文件目录的层级
    static int level;
    public static void main(String[] args) {
        //创建一目录
        File f2 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\a");
        parseFile(f2);
    }

    public static void parseFile(File f1){
        if (f1 == null || !f1.exists()){
            return;
        }
        //给层级加一
        level ++;

        //获得文件对象的子文件对象列表
        File[] files = f1.listFiles();
        //遍历这些子文件
        for (File fs:files){
            //打印层级的缩进
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            //打印文件的名字
            System.out.println(fs.getName());
            //判断这些子文件是否是目录
            if (fs.isDirectory()){
                //递归的方式来遍历
                parseFile(fs);
            }
        }
        //本层次遍历完毕把层次减回来
        level --;


    }


}
