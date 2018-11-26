
package trywithexception;
import java.io.*;
public class writetwodata {
	String n="niit-das";
	void WriteData() throws IOException,FileNotFoundException {
	
	{
		FileOutputStream fos1=new FileOutputStream("D:\\v1.txt");
		FileOutputStream fos2=new FileOutputStream("D:\\v2.pdf");
		byte f[]=n.getBytes();
		fos1.write(f);
		fos2.write(f);
		System.out.println("twofileinserted..");
	}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
writetwodata g=new writetwodata();
g.WriteData();
	}

}
