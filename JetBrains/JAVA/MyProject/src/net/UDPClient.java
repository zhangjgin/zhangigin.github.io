package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        //创建UDP客户端的socket对象
        DatagramSocket ds = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ds = new DatagramSocket();
            String line = null;
            while ((line = br.readLine()) != null) {
                if ("exit".equals(line)) {
                    break;
                }
                byte[] bs = line.getBytes();
                //创建数据包
                DatagramPacket dp = new DatagramPacket(bs,bs.length, InetAddress.getByName("192.168.6.1"),10000);
                //发送数据
                ds.send(dp);
            }
            System.out.println("退出客户端");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ds != null) {
                ds.close();
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
