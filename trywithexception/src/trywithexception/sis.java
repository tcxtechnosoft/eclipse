package trywithexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sis {
	String n="THEGOD";
	void WriteData() throws IOException
	{
		FileInputStream fis1=new FileInputStream("D:\\a1.txt");
		FileInputStream fis2=new FileInputStream("D:\\a2.docx");
		byte d[]=n.getBytes();
		fis1.write(d);
		fis2.write(d);
		System.out.println("the value is inserted");
		
	
	FileOutputStream fos1=new FileOutputStream("D:\\a3.pdf");
		SequenceInputStream si=new SequenceInputStream(fis1,fis2);
		int i;
		{
		while((i=si.read())!=-1)
			
		
{
		//	fos1.write((byte)i);
			System.out.println("the value is inserted");
	System.out.print((char)i);
}
		}
		}
	

	public static void main (String[] args) throws IOException,FileNotFoundException 
	{ 
		
		// TODO Auto-generated method stub
	sis g=new sis();
g.WriteData();
/*g.WriteData();
g.WriteData();
*/
//	private void fis1() {
		// TODO Auto-generated method stub
		
	}
}


