package java0131;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\½ªÃÎÎ°\\Desktop\\java2018016\\src\\w0131\\Piao.java");
		File file1=new File("C:\\Users\\½ªÃÎÎ°\\Desktop\\java2018016\\src\\w0131\\Piao.java2");
		@SuppressWarnings("resource")
		Reader a=new FileReader(file);
		char[] c=new char[(int) file.length()];
		a.read(c);
		String str=new String(c);
		Writer writer=new FileWriter(file1);
		writer.write(str);
		writer.flush();
		writer.close();
		System.out.println("¸´ÖÆÍê³É");
		
	}

}
