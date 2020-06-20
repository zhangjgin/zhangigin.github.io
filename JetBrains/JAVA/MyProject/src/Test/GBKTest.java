package Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class GBKTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = new String("中");
        byte[] g = s.getBytes("GBK");
        System.out.println(Arrays.toString(g));
    }
}
