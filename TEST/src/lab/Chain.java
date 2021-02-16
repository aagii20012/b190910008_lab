package lab;

public class Chain {
	Node head;
	
	static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        }
    }
	
	public void push(int new_data) 
	{ 
	    Node new_node = new Node(new_data); 
	  
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
        	return temp.data;
        } 
        return 0; 
    }
	public int pop() 
    { 
        Node temp = head; 
        if(isEmpthy())
        {
        	return 0;
        }
        else {
        	int first=peek();
        	temp=temp.next;
        	return first;
        }
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
		
		Chain list=new Chain();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		
		System.out.println("list is"+list.getCount());
		list.printList();
		System.out.println("empthy is "+list.isEmpthy());
		System.out.println("peek is "+list.peek());
		System.out.println("pop is "+list.pop());
	}
}
