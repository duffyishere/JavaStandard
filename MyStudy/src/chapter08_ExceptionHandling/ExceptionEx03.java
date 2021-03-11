package chapter08_ExceptionHandling;

import java.io.File;

public class ExceptionEx03 {
	public static void main(String[] args) {
			try {
				File f = fileCreate("");
				System.out.println(f.getName() + " is created.");
			}catch (Exception e) {
				System.out.println(e.getMessage() + "Please input again.");
			}
		}
	
	static File fileCreate(String filename) throws Exception {
		if(filename == null || filename.equals("")) {
			throw new Exception("File name is mistake. ");
		}
		File f = new File(filename);
		f.createNewFile();
		return f;
	}
}
 