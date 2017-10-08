import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CSE214hw2_4 {
public static void main(String[] args) throws FileNotFoundException {
	File aFile = new File("in4.txt");
	Scanner aScanner = new Scanner(aFile);
	int a=aScanner.nextInt();
	aScanner.nextLine();
	for (int ik=0;ik<a;ik++) {
		int k=Integer.parseInt(aScanner.nextLine().split(" ")[1]);
	String ak=aScanner.nextLine();
    Queue<Integer> queue = new LinkedList<Integer>();
    Queue<Integer> queuea = new LinkedList<Integer>();
    for (String z:ak.split(" ")) {
    	queue.add(Integer.parseInt(z));
    }
    int akz=0;
    int az=0;
    		for (int i =1;i<k;i++) {
    			az=queue.poll();
    			queuea.add(az);
    			if (akz<az) akz=az;
   }
    		
    		queue.add(akz);
    		for (int i =0;i<queuea.size();i++) {
    			int akq=queuea.poll();
    			if (akq!=akz) {
    				if (akq-1>0)
    				queue.add(akq-1);
    				else queue.add(0);
					
    			}
    		}
    		Iterator<Integer> aIterator = queue.iterator();
    		while (aIterator.hasNext()) {
    			int avb=aIterator.next();
    			System.out.print(avb+" ");
			}
    		System.out.println();
	}
	aScanner.close();
}
}
