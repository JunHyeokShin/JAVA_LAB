package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("Chapter15/src/a.zip");
				FileOutputStream fos = new FileOutputStream("Chapter15/src/copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			millisecond = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + millisecond + "milliseconds 소요되었습니다.");
	}
}