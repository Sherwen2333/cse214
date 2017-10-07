

public class ak<T>  {
	// aka
	// asd
	//asd
    private int a;
	public class Node {
		private T data;
        private Node next;
        private Node prev;
        private  int ak;
        public Node(Node prev,T data, Node next,int a) {
            this.data = data;
            this.next = next;
            this.prev = prev;
            this.ak=a;
        }
        public Node getNext() {
   		 return next;
        }
        public T getData(){
        	return data;
        }
        public boolean equal(T a){
        	if (a.equals(data)) return true;
        	
        	return false;
        }
        public boolean equal(Node a){
        	if (a.ak==ak) return true;
        	
        	return false;
        }
	}
	private Node first;
	private Node last;
	public ak(T[] a)  {
		for (int i =0;i<a.length;i++) {
			add(a[i]);
		}
	}
	  public ak() {
	        first = null;
	        last = null;
	        a = 0;
	    }
	public Node getter(int a) {
		Node aNode = first;
		for (int i=0;i<a;i++) {
			aNode=aNode.next;
		}
		return aNode;		
	}
	public Node getter(T a) {
		Node aNode = first;
		for (int i=0;i<getSize();i++) {
			if(aNode.data.equals(a)) 
				return aNode;		
			aNode=aNode.next;
		}
		return aNode;
	}
	public void Switch(Node a,Node b) {
//		System.out.println(a.data+"-*-"+b.data);
		T temp=a.data;
		a.data=b.data;
		b.data=temp;
//		System.out.println(a.data+"-*-"+b.data);
	}
	 public void add(T item) {
		 if (a==0){
			 first=new Node(first, item, first,0);
			 last=first;
			 a=1;
		 }
		 else{
		 Node prev=last;
		 Node aNode= new Node(last,item, first,(last.ak));
		 prev.next=aNode;
		 aNode.prev=prev;
		 last=aNode;
		 last.ak+=1;
		 }
	    }
	
	 public int  getSize() {
		if (first==null) return 0;
		Node aNode=first;
		int a=1;
		if (last.equal(first)) return 1;
		while(!aNode.next.equal(first)){
			a++;
			aNode=aNode.next;
		}
		return a;
	}
	 public Node getFirst() {
		 return first;
	}
	 public void print() {
		 Node a=first;
		 for (int i=0;i<getSize();i++){
			System.out.print(a.data+" ");
			a=a.next;
		 }
		 System.out.println();
	}
	 public void remove(T item) {
		 if(getSize()==1){
			 first=null;
			 last=null;
			 return;
		 }
		 if(first.equal(item)){		
			 last.next=first.next;
			 first.next.prev=last;
			 first=first.next;
		 }
		 Node a=first;
		 for (int i=0;i<getSize();i++){
			 if(a.equal(item)){
				 a.prev.next=a.next;
				 a.next.prev=a.prev;
				 a.next=null;
				 a.prev=null;
				 break;
			 }
			 else {
				a=a.next;
			}
		 }
		
	}
	

}
