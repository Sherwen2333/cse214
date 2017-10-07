

public class linkedlist<T>  {
    private int a;
	public class Node {
		private T data;
        private Node next;
        private Node prev;
        public Node(Node prev,T data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
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
        	if (a.data.equals(data)) return true;
        	
        	return false;
        }
	}
	private Node first;
    private Node Current;
	private Node last;
	  public linkedlist() {
	        first = null;
	        last = null;
	        a = 0;
	    }
	public Node getter() {
		return first;
	}
	 public void add(T item) {
		 if (a==0){
			 first=new Node(first, item, first);
			 last=first;
			 a=1;
		 }
		 else{
		 Node prev=last;
		 Node aNode= new Node(last,item, first);
		 prev.next=aNode;
		 aNode.prev=prev;
		 last=aNode;}
	    }
	
	 public int  getSize() {
		if (first==null) return 0;
		Node aNode=first;
		int a=1;
		if (aNode.equal(last)) return a;
		while(!aNode.next.equal(first)){
			a++;
			aNode=aNode.next;
		}
		return a;
	}
	 public void print() {
		 Node a=first;
		 for (int i=0;i<getSize();i++){
			System.out.println(a.data);
			a=a.next;
		 }
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
