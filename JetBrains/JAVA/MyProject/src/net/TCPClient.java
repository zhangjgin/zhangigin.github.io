package net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        //创建请求的socket
        Socket s =null;
        BufferedWriter bw = null;
        try {
            s = new Socket("127.0.0.1",10000);
            //获得输出流
            OutputStream out = s.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(out));
            bw.write("HelloWorld");
            bw.newLine();
            bw.flush();
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
        }
    }



}
