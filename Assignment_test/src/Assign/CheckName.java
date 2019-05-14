/**
 * 
 */
package Assign;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author vsriniva
 *
 */
public class CheckName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//	File file = new File("D:\\newfile.txt");
			for (int i = 0; i <5; i++) {
				SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-dd-MM HH:MM:SS");
				Date dte=new Date();
				
				
			System.out.println(dateFormat.format(dte).toString().replace(" ", ""));	
		String		filename="D:\\temp\\newfile"+dateFormat.format(dte).toString().replace(" ", "_").replace(":", "-")+".txt";
					File file = new File(filename);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					boolean fvar = file.createNewFile();
					if (fvar) {
						System.out.println("File has been created successfully");
							}
					else {
						System.out.println("file already present at the path");
					}	
			}
			
			
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}

	}

}
