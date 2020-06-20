package bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("Files\\Target.txt");

		// һ�ζ�һ���ֽ�
		/*while (true) {
			int n = fis.read();
			if (n == -1) {
				break;
			}
			System.out.println((char) n);
		}*/

		// һ�ζ�һ���ֽ�
		byte[] cache = new byte[4];// ������һ������Ϊ4�����飬��Ϊ�˶�ȡʱ�Ļ���

		while (true) {
			int count = fis.read(cache);// û��ȡһ�Σ��������顣��ע�⣺���һ�ο����޷�������

			if (count == -1) {
				break;
			}

			for (int i = 0; i < count ; i++) {// ���ݶ�ȡ�ֽڵĸ�����������ӡ�Ĵ���
				System.out.print((char) cache[i] + "\t");
			}
			System.out.println();
		}

	}

}
