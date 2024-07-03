package LinkedList;

public class LinkedListCreation {
	
	private Node head;
	private Node tail;
	private int length;
	
	
	public LinkedListCreation( int value ){
		Node newnode = new Node(value);
		head =newnode ;
		tail=newnode;
		
		
	}
	
	class Node {
		
		int value;
		Node next;
		Node (int value){
			this.value=value;
		}
		
		
		}
	public void printlist() {
		Node temp=head;
		while(temp !=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
		
		
		
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	public void append(int value) {
		Node n= new Node(value);
		
		if (length==0) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
		length++;
	}
	public void removelast() {
		
	}
	

}
