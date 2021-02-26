package lab;



public class Chain<T> {

	private LinkedListNode<T> first = null;
	int size = 0; 
	
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}
	
	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}

	private void printList(LinkedListNode<T> node) {
		System.out.print(node.getValue()+"-->");
		if(node.getNext()!=null) printList(node.getNext());
	}
	
	private void getSize(LinkedListNode<T> node) 
    { 
		if(node.getNext()!=null)
		{
			size++;
			getSize(node.getNext());
		}
			
    }

	public void print(){
		System.out.println("Node-->");
		printList(first);
	}
	
	public void nodeSize() 
	{
		if(check())
		{
			System.out.println("Size of Node is empty");
		}else {
			size=1;
			getSize(first);
			System.out.println("Size of Node is"+size);
		}
	}
	
	public boolean check() 
	{
		
		if(first==null)
		{
			System.out.println("Node is empty");
			return true;
		}else {
			return false;
		}
	}
	
	public void peek() 
	{
		if(check())
		{
			 System.out.println("first value is "+first.getValue());
		} 
	}
	
	
	public static void main(String[] args) {
		Chain<String> list = new Chain<String>();
		list.insert(new LinkedListNode<String>("1213"));
		list.insert(new LinkedListNode<String>("123"));
		list.insert(new LinkedListNode<String>("234"));
		list.insert(new LinkedListNode<String>("354"));
		list.print();
		System.out.println();
		list.nodeSize();
		System.out.println("After removing the head..");
		list.remove();
		list.print();
		System.out.println();
		if(list.check())
		{
			
		}else System.out.println("Node is not empthy");
	}

}

class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;

	public LinkedListNode(T value) {
		this.value = value;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}
}