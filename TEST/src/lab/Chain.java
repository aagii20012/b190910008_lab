package lab;

public class Chain<T> {
	
	T obj; 
	Chain(T obj) {  this.obj = obj;  } 
    public T getObject()  { return this.obj; } 
	
	Node head;
	
	static class Node { 
        Chain<Integer> data; 
        Node next; 
        Node(Chain<Integer> obj) 
        { 
            data = obj; 
            next = null; 
        }
    }
	
	public void push(Chain<Integer> obj) 
	{ 
	    Node new_node = new Node(obj); 
	  
	    new_node.next = head; 
	  
	    head = new_node;
	} 
	
	public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
        System.out.println(""); 
    } 
	
	public int getCount() 
	    { 
	        Node temp = head; 
	        int count = 0; 
	        while (temp != null) 
	        { 
	            count++; 
	            temp = temp.next; 
	        } 
	        return count; 
	    }
	public int peek() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
        	//return temp.data;
        } 
        return 0; 
    }
	
	public void empthyChain() 
    { 
        head=null;
    }
	
	public boolean isEmpthy() 
    { 
        Node temp = head; 
        if(temp!=null)
        {
        	return false;
        }else return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chain<Integer> list=new Chain<Integer>(123);
		System.out.println(list.getObject());
		list=new Chain<Integer>(12321);
		list.push(list);
		list=new Chain<Integer>(123879);
		list.push(list);
		
		System.out.println("list is"+list.getCount());
		list.printList();
		//System.out.println("empthy is "+list.isEmpthy());
		//System.out.println("peek is "+list.peek());
		//list.empthyChain();
		//System.out.println("chain is empty now");
	}
}
