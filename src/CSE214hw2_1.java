import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CSE214hw2_1 {
public static void main(String[] args) throws FileNotFoundException {
//	System.out.println("Fk That Shit");
	File aFile = new File("in1.txt");
	Scanner aScanner = new Scanner(aFile);
	 for (int i=0;i<2;i++){
		System.out.println(aScanner.nextLine());
	}
	String[] aStrings= aScanner.nextLine().split(" ");
	String[] bStrings= aScanner.nextLine().split(" ");
	System.out.println(aStrings.length+" "+bStrings.length);
	for (String a: aStrings)
	System.out.print(a+",");
	System.out.println();
	for (String a: bStrings)
	System.out.print(a+",");
	String[][] ak1=new String[4][2];
	String[][] ak2=new String[3][2];
	String[][] ak3=new String[3][2];

	aScanner.close();
	for (int i=0;i<aStrings.length-1;i++){
		for (int a=i+1;a<aStrings.length;a++){
			if (Integer.parseInt(bStrings[i])>Integer.parseInt(bStrings[a])){
				String temp=bStrings[i];
				bStrings[i]=bStrings[a];
				bStrings[a]=temp;
				temp=aStrings[i];
				aStrings[i]=aStrings[a];
				aStrings[a]=temp;
			}
		}
	}
	int indexa=0;
	int indexb=0;
	int indexc=0;	
	for (int i=0;i<aStrings.length;i++){
		if(Integer.parseInt(bStrings[i])<=4){
			ak1[indexa][0]=aStrings[i];
			ak1[indexa][1]=bStrings[i];
			indexa++;
		}
		else if(Integer.parseInt(bStrings[i])<=7){
			ak2[indexb][0]=aStrings[i];
			ak2[indexb][1]=bStrings[i];
			indexb++;

		}
		else if(Integer.parseInt(bStrings[i])<=11){
			ak3[indexc][0]=aStrings[i];
			ak3[indexc][1]=bStrings[i];
			indexc++;

		}
	}
	System.out.println();
	for (String[] a: ak1)
		System.out.print(a[0]+",");
	System.out.println();
	for (String[] a: ak1)
		System.out.print(a[1]+",");
	System.out.println();
	for (String[] a: ak2)
		System.out.print(a[0]+",");
	System.out.println();
	for (String[] a: ak2)
		System.out.print(a[1]+",");
	System.out.println();
	for (String[] a: ak3)
		System.out.print(a[0]+",");
	System.out.println();
	for (String[] a: ak3)
		System.out.print(a[1]+",");
	System.out.println();
}
}
