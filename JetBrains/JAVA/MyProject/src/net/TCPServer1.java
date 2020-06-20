package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer1 {
    public static void main(String[] args) {
        //创建服务端的套接字
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader br =null;
        try {
             ss = new ServerSocket(10000);
            System.out.println("服务已经启动了......");
             //接受客户端请求
             s = ss.accept();
            InputStream in = s.getInputStream();
            br = new BufferedReader(new InputStreamReader(in));
            while (true) {
                //读取数据
                String line = br.readLine();
                InetAddress address = s.getInetAddress();
                if ("exit".equals(line)) {
                    break;
                }
                //获得客户端的IP地址
                String ip = address.getHostAddress();
                System.out.println(ip+"发送了："+line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (s != null) {
                try {
                    s.close();
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
