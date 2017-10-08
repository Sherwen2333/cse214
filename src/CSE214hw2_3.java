import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSE214hw2_3 {

	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("in3.txt");
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

	private static void name(String namenn, String tallnn) {
		int a= Integer.parseInt(namenn);
		LinkedList<String> az= new LinkedList<String>();
		String [] akz= tallnn.split(" ");
		for (int i=akz.length-1;i>-1;i-- ){
			if (az.getSize()>a) {
				az.remove(az.getter(az.getLast().getData()).getData());
			}
				az.add(akz[i]);
			
		}
		az.print();
	}

}
