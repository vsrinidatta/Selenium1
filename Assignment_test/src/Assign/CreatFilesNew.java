package Assign;

import java.io.File;
import java.io.IOException;

/**
 * @author vsriniva
 *
 */
public class CreatFilesNew{

	public static void name(String[] args) {
		try {
			File file = new File("D:\\newfile.txt");
			
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("File has been created successfully");
					}
			else {
				System.out.println("file already present at the path");
			}
		} catch (IOException e) {
			System.out.println("Exception Occurred:");
			e.printStackTrace();
		}
	}
	
}
