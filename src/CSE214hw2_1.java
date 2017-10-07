import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSE214hw2_1 {
	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("in1.txt");
		Scanner aScanner = new Scanner(aFile);
		int time = aScanner.nextInt();
		aScanner.nextLine();
		System.out.println(time);
		for (int iz = 0; iz < time; iz++) {
			String[] akb = aScanner.nextLine().split(" ");
			int a_number = Integer.parseInt(akb[0]);
			int b_number = Integer.parseInt(akb[1]);
			ak<String> aak = new ak<>(aScanner.nextLine().split(" "));
			ak<String> bak = new ak<>(aScanner.nextLine().split(" "));
			System.out.println(a_number + " " + b_number);
			String[] leftPeople = new String[b_number];
			aak.print();
			bak.print();
//			System.out.println(bak.getSize());
			for (int i = 0; i < aak.getSize() - 1; i++) {
				for (int a = i + 1; a < aak.getSize(); a++) {
					if (Integer.parseInt(bak.getter(a).getData()) < Integer
							.parseInt(bak.getter(i).getData())) {
						aak.Switch(aak.getter(a), aak.getter(i));
						bak.Switch(bak.getter(a), bak.getter(i));
					}
				}
			}
			// Sort
			aak.print();
			bak.print();
		System.out.println(	bak.getter(1).getData()+"-111");
			System.out.println(bak.getSize());
			int a=Integer.parseInt(bak.getFirst().getData());
			//Spilt into K buckets
			for (int i=0;i<b_number;i++) {
				ak<String> az=new ak<String>();
				ak<String> bz=new ak<String>();
				int asd=bak.getSize();
//				System.out.println(bak.getSize()+"--");
					for (int isd =0;isd<asd;isd++) {
						System.out.println(isd+"0/0");
						if(Integer.parseInt(bak.getter(isd).getData())<a+b_number&&i!=b_number-1)
						{
							az.add(aak.getter(isd).getData());
							bz.add(bak.getter(isd).getData());
							aak.remove(aak.getter(isd).getData());
							bak.remove(bak.getter(isd).getData());
						}
						else {
							az=aak;
							bz=bak;
							break;
						}
					}
					
					String aString = az.getFirst().getData();
					while (az.getSize()!=1) {
						az.print();
						System.out.println("---------");
						for(int iaz=0;iaz<b_number-1;iaz++) {
						aString=az.getter(aString).getNext().getData();}
						String aString2=az.getter(aString).getNext().getData();
						az.remove(aString);
						aString=aString2;
					}
					leftPeople[i]=aString;
			}
		}

		// for (int i=0;i<2;i++){
		// System.out.println(aScanner.nextLine());
		// }
		// String[] aak= aScanner.nextLine().split(" ");
		// String[] bStrings= aScanner.nextLine().split(" ");
		// System.out.println(aak.length+" "+bStrings.length);
		// for (String a: aak)
		// System.out.print(a+",");
		// System.out.println();
		// for (String a: bStrings)
		// System.out.print(a+",");
		// String[][] ak1=new String[4][2];
		// String[][] ak2=new String[3][2];
		// String[][] ak3=new String[3][2];
		//
		// aScanner.close();

		// int indexa=0;
		// int indexb=0;
		// int indexc=0;
		// for (int i=0;i<aak.length;i++){
		// if(Integer.parseInt(bStrings[i])<=4){
		// ak1[indexa][0]=aak[i];
		// ak1[indexa][1]=bStrings[i];
		// indexa++;
		// }
		// else if(Integer.parseInt(bStrings[i])<=7){
		// ak2[indexb][0]=aak[i];
		// ak2[indexb][1]=bStrings[i];
		// indexb++;
		//
		// }
		// else if(Integer.parseInt(bStrings[i])<=11){
		// ak3[indexc][0]=aak[i];
		// ak3[indexc][1]=bStrings[i];
		// indexc++;
		//
		// }
		// }
		// System.out.println();
		// for (String[] a: ak1)
		// System.out.print(a[0]+",");
		// System.out.println();
		// for (String[] a: ak1)
		// System.out.print(a[1]+",");
		// System.out.println();
		// for (String[] a: ak2)
		// System.out.print(a[0]+",");
		// System.out.println();
		// for (String[] a: ak2)
		// System.out.print(a[1]+",");
		// System.out.println();
		// for (String[] a: ak3)
		// System.out.print(a[0]+",");
		// System.out.println();
		// for (String[] a: ak3)
		// System.out.print(a[1]+",");
		// System.out.println();
	}
}
