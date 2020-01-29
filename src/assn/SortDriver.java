package assn;

import java.io.File;
import java.io.FileNotFoundException;


public class SortDriver {

	public static void main(String[] args) {
		
		File inFile = new File("data\\in.txt");
		File outFile = new File("data\\out.txt");
		
		StringSorter sorter = new StringSorter();
		
		try {
			sorter.read(inFile);
			System.out.println("read complete");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
		sorter.sort();
				
		try {
			sorter.write(outFile);
			System.out.println("write complete");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		

	}

}