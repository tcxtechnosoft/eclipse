package trywithexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sequenceinputstream {
	String n="THEGOD";
	void WriteData() throws IOException
	{
		FileOutputStream fis1=new FileOutputStream("D:\\a1.txt");
		FileOutputStream fis2=new FileOutputStream("D:\\a2.docx");
	/*	byte d[]=n.getBytes();
		fis1.write(d);
		fis2.write(d);
		System.out.println("the value is inserted");
		*/
	}
	FileInputStream fos1=new FileInputStream("D:\\a1.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int i;
		while((i=sis.read())!=-1)
		
{
	System.out.print((char)i);
}

	}

	public static void main(String[] args) throws IOException,FileNotFoundException 
	{ 
		
		// TODO Auto-generated method stub
		sequenceinputstream g=new sequenceinputstream();
g.WriteData();
/*g.WriteData();
g.WriteData();
*/
//	private void fis1() {
		// TODO Auto-generated method stub
		
	}
}


