import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSE214hw2_1 {
	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("in1.txt");
		Scanner aScanner = new Scanner(aFile);
		int time = aScanner.nextInt();
		aScanner.nextLine();
		for (int iz = 0; iz < time; iz++) {
			String[] akb = aScanner.nextLine().split(" ");
			int b_number = Integer.parseInt(akb[1]);
			String namenn=aScanner.nextLine();
			if(namenn.split(" ").length==1) {
				System.out.println(namenn);
			}
			String numm=aScanner.nextLine();
			name(namenn, numm,b_number);
		}
		aScanner.close();

	}
	public static void name(String btring,String atring,int z) {
		String [] nameni= new String[z];
		LinkedList<Integer> a = new LinkedList<Integer>();
		LinkedList<String> b = new LinkedList<String>();		
		for (String iString : btring.split(" ")) {
			b.add(iString);
		}
		for (String iString : atring.split(" ")) {
			a.add(Integer.parseInt(iString));
		}
		sort(a, b);
		int first_num=z;
		int k=(a.getLast().getData()-a.getFirst().getData())/first_num;
		int az=a.getFirst().getData();
		int ak=az+k;
		for (int i=0;i<first_num;i++) {
			if (i!=first_num-1) {
				nameni[i]=name(spilt(a, b, az, ak), first_num);
				az=ak;
				ak+=k;
			}
			else {
				nameni[i]=name(spilt(a, b, az, a.getLast().getData()), first_num);
			}
		}
		for (String i:btring.split(" ")) {
			for (String ag:nameni) {
				if (ag==null) break;
				if (ag.equals(i)) {
					System.out.print(ag+" ");
				}
			}
		 }
		System.out.println();
	}

	public static<T> LinkedList<T> spilt(LinkedList<Integer> a,LinkedList<T>b,int k,int z) {
		LinkedList<T> aks= new LinkedList<>();
		for (int i =0;i<a.getSize();i++) {
			if (a.getter(i).getData()>=k&&a.getter(i).getData()<z) {
				aks.add(b.getter(i).getData());
			}
		}
		return aks;
	}
	public static <T> void sort(LinkedList<Integer> a, LinkedList<T> b) {
		for (int i = 0; i < a.getSize() - 1; i++) {
			for (int az = i + 1; az < a.getSize(); az++) {
				if (a.getter(i).getData() > a.getter(az).getData()) {
					a.Switch(a.getter(i), a.getter(az));
					b.Switch(b.getter(i), b.getter(az));

				}
			}
		}

	}

	public static String name(LinkedList<String> a, int k) {
		if (a.getSize()==0) return null;
		String aString = a.getFirst().getData();
		while (a.getSize() != 1) {
			for (int i = 0; i < k - 1; i++) {
				aString = a.getter(aString).getNext().getData();
			}
			String aString2 = a.getter(aString).getNext().getData();
			a.remove(aString);
			aString = aString2;
		}
		return a.getFirst().getData();
	}
}
