



public class test_1 {
public static void main(String[] args) {
	linkedlist<String> a = new linkedlist<String>();
	a.add("d");
	a.add("j");
	a.add("e");
	while (a.getSize()!=1) {
		a.getter();
		a.remove(a.getter().getNext().getNext().getNext().getData());

	}
	a.remove(a.getter().getNext().getNext().getNext().getData());
		System.out.println(	a.getSize());
	a.print();
}



}
