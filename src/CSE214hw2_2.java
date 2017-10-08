import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSE214hw2_2 {
public static void main(String[] args) throws FileNotFoundException {
	File aFile = new File("in2.txt");
	Scanner aScanner = new Scanner(aFile);
	int time = aScanner.nextInt();
	aScanner.nextLine();
	for (int iz = 0; iz < time; iz++) {
		String namenn=aScanner.nextLine();
		String tallnn=aScanner.nextLine();
		name(namenn, tallnn);
	}
	aScanner.close();
}
	public static void  name(String a,String b) {
		LinkedList <Integer> index= new LinkedList<Integer>();
		LinkedList <Integer> height= new LinkedList<Integer>();		
		for (String i:a.split(" ")) {
			index.add(Integer.parseInt(i));
		}
		for (String i:b.split(" ")) {
			height.add(Integer.parseInt(i));
		}
		for (int i=0;i<height.getSize()-1;i++) {
			if(height.getter(i).getData()<height.getter(i+1).getData()) {
				height.remove(height.getter(i).getData());
				index.remove(index.getter(i).getData());	
			}
		}
	index.print();
	}
	
}
