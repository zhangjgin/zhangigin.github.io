package print;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintDemo1 {
    public static void main(String[] args) {
        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("a.txt"));
            pw = new PrintWriter(System.out);
            String line = null;
            while ((line = br.readLine()) != null) {
                pw.println(line);
                pw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (pw != null){
                pw.close();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
