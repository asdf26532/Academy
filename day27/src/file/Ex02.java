package file;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\FileTest");
		
		// 해당 폴더가 없으면 생성
		if (!f1.exists()) {
			f1.mkdir();
			System.out.println("폴더 생성");
		}
		
		// E:\FileTest\test1.txt
		File f2 = new File(f1, "test1.txt");
		
		if (!f2.exists()) {
			f2.createNewFile();		// 파일 생성시 중간 경로가 없으면 예외가 발생할 수 있다
									// 따라서, 파일 관련 메서드는 예외 전가가 많이 되는 편
			System.out.println("새 파일 생성");
		}
	}
}
