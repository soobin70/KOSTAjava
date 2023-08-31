import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("cat.jpg");
			fos=new FileOutputStream("cat2.jpg");
			
			bis= new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			byte[] buff = new byte[100];
			int len;
			
			while((len=bis.read(buff))>0) {
				bos.write(buff,0,len);;
			}
//			byte[] buff = new byte[100];
//			int len;
//			while((len=fis.read(buff))!=0) {
//				fos.write(buff,0,len);
//			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
