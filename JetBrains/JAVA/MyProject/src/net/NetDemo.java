package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo {
    public static void main(String[] args) throws UnknownHostException {
        //获得本机地址
        InetAddress lh = InetAddress.getLocalHost();
        String ha = lh.getHostAddress();
        String hn = lh.getHostName();
        System.out.println("本机地址："+ha);
        System.out.println("主机名："+hn);

        System.out.println("---------------------------------------------");

        //获得一个远程地址
        InetAddress txip = InetAddress.getByName("123.57.94.117");
        String ha1 = txip.getHostAddress();
        String hn1 = txip.getHostName();
        System.out.println("本机地址："+ha1);
        System.out.println("主机名："+hn1);
    }
}
