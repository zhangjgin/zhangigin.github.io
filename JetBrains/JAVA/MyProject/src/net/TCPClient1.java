package net;

import java.io.*;
import java.net.Socket;

public class TCPClient1 {
    public static void main(String[] args) {
        //创建请求的socket
        Socket s =null;
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            s = new Socket("127.0.0.1",10000);
            //获得输出流
            OutputStream out = s.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(out));
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while (true) {
                line = br.readLine();

                bw.write(line);
                bw.newLine();
                bw.flush();
                if ("exit".equals(line)) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
