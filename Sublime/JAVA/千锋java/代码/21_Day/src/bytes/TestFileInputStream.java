package bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("Files\\Target.txt");

		// 一次读一个字节
		/*while (true) {
			int n = fis.read();
			if (n == -1) {
				break;
			}
			System.out.println((char) n);
		}*/

		// 一次读一组字节
		byte[] cache = new byte[4];// 创建了一个长度为4的数组，作为了读取时的缓存

		while (true) {
			int count = fis.read(cache);// 没读取一次，填满数组。（注意：最后一次可能无法填满）

			if (count == -1) {
				break;
			}

			for (int i = 0; i < count ; i++) {// 根据读取字节的个数，决定打印的次数
				System.out.print((char) cache[i] + "\t");
			}
			System.out.println();
		}

	}

}
