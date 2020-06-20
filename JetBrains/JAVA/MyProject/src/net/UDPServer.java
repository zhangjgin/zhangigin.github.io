package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        //创建UDP服务端的socket对象
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket(10000);
            //创建一个字节数组
            byte[] bs = new byte[1024];
            //创建数据包
            DatagramPacket dp = new DatagramPacket(bs,bs.length);
            System.out.println("UDP服务端已经启动......");
            while (true) {
                //接受数据
                ds.receive(dp);
                //获得客户端的ip
                InetAddress id = dp.getAddress();
                //获得数据
                byte[] data = dp.getData();
                //获得接受数据的长度
                int length = dp.getLength();
                //创建接受的字符串
                String str = new String(data,0,length);
                System.out.println(id.getHostAddress()+"发送的数据是："+str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ds != null) {
                ds.close();
            }
        }
    }
}
