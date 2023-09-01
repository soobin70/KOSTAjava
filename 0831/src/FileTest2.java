import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\jsb\\java_workspace");
		if(!f.exists()||!f.isDirectory()) {
			return;
		}
		
//		String[] files = f.list();
//		for(String file : files) {
//			System.out.println(file);
//		}
		File[] files = f.listFiles();
		int totLength = 0;
		for(File file : files) {
			System.out.println(file.length());
			totLength += file.length();
			System.out.println(file.isDirectory()?"["+file.getName()+"]":file.getName());
			
			
			}
		System.out.println(totLength);
		}

	}


