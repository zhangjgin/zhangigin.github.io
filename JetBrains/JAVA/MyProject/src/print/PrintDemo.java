package print;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("a.txt");
            pw.println("HelloWord");
            pw.print("HelloWord");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (pw != null){
                pw.close();
            }
        }
    }
}
