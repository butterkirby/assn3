
package assn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringSorter {
	
	ArrayList<String> lines = new ArrayList<String>();
	
	public void read(File rawData) throws FileNotFoundException{
		Scanner in= new Scanner(rawData);
		while(in.hasNextLine()){
			lines.add(in.nextLine());
		}
		in.close();
	}
	
	public void write(File sortedData) throws FileNotFoundException{
		PrintWriter out = new PrintWriter(sortedData);
		Iterator<String> it =lines.iterator();
		while (it.hasNext()){
			out.println(it.next());
		}
		out.close();
	}
	

	private int findLastLine(List<String> list){
		int index = 0;
		String moveToLast = "";
		for(int i = 0; i < list.size(); i++){
			if(i == 0){
				moveToLast = list.get(i);
			}
			else{
				if(moveToLast.compareTo(list.get(i)) < 0){
					index = i;
					moveToLast = list.get(i);
				}
			}
		}
		return index;
	}
	
	//This is the raw version which needs to be refactored
	public void sort(){
		//Collections.sort(lines);
				int j = lines.size()-1;
				while (j>0){
					List <String> sublist = lines.subList(0,j+1);
					int index = findLastLine(sublist);
					String str = sublist.get(index);
					
					lines.set(index, lines.get(j));
					lines.set(j, str);
					j = j-1;
				}
				System.out.println("Sort Complete");
		}
		
}