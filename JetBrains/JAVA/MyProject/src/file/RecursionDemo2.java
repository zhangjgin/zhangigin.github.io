package file;

import java.io.File;

public class RecursionDemo2 {


    public static void main(String[] args) {
        //创建一目录
        File f2 = new File("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\a");
        parseFile(f2);
    }

    public static void parseFile(File f1){
        if (f1 == null || !f1.exists()){
            return;
        }



        //获得文件对象的子文件对象列表
        File[] files = f1.listFiles();
        //遍历这些子文件
        for (File fs:files){
            if (fs.isDirectory()){
                //递归的方式来遍历
                parseFile(fs);
            }else{
                fs.delete();
            }
        }



    }


}
