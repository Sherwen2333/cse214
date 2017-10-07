
public class test_1 {
public static void main(String[] args) {
	ak<String> aLinkedlist = new ak<String>();
	aLinkedlist.add("1");
	System.out.println(aLinkedlist.getSize());
	String aString="10 2 4 5 7 3 2 9 11 6";
//	double a=(int)(Math.random()*1000000);
//	System.out.println(a);
	for(String iString : aString.split(" ")) {
		aLinkedlist.add(iString);
//		System.out.println(iString);
	}
	
//	System.out.println(aLinkedlist.getSize());
	aLinkedlist.print();
	System.out.println("ak-----");
//	aLinkedlist.Switch(aLinkedlist.getter(0), aLinkedlist.getter(1));
//	aLinkedlist.print();
	for (int i=0;i<aLinkedlist.getSize()-1;i++){
		for (int a=i+1;a<aLinkedlist.getSize();a++){
			if (Integer.parseInt(aLinkedlist.getter(i).getData())>Integer.parseInt(aLinkedlist.getter(a).getData())){
				aLinkedlist.Switch(aLinkedlist.getter(i), aLinkedlist.getter(a));
			}
		}
	}
	aLinkedlist.print();
//	a.print();
//	System.out.println();
//	a.Switch(a.getter(0), a.getter(1));
//	a.print();
//	System.out.println();
//	String aString = a.getFirst().getData();
//	while (a.getSize()!=1) {
//		a.print();
//		System.out.println("---------");
//		for(int i=0;i<2;i++) {
//		aString=a.getter(aString).getNext().getData();}
//		String aString2=a.getter(aString).getNext().getData();
//		a.remove(aString);
//		aString=aString2;
//	
//	}
//	a.print();
	
	}
boolean ak (int a) {
	return a==0?true:false;}



}
