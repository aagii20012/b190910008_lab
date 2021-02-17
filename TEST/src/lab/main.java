package lab;
import java.util.*;

public class main {
	
	public void printManual()
	{
		System.out.println("|------------------------------------------------|");
		System.out.println("|-------------Action-------------------Step------|");
		System.out.println("|------Add new value to chain------------1-------|");
		System.out.println("|------Print all value on chain----------2-------|");
		System.out.println("|------remove last node------------------3-------|");
		System.out.println("|------See first value-------------------4-------|");
		System.out.println("|------get sizeof chain -----------------5-------|");
		System.out.println("|------check chain is empthy-------------6-------|");
		System.out.println("|------------------------------------------------|");
		System.out.println("|------See manual -----------------------#-------|");
		System.out.println("|------------------------------------------------|");
		System.out.println("|------------------------------------------------|");
	}

	public static void main(String[] args) {
		main call=new main();
		Chain<Integer> list = new Chain<Integer>();
		Scanner scan=new Scanner(System.in);
		
		call.printManual();
		while(true)
		{
			System.out.println("please enther Step");
			String step = scan.nextLine();
			switch (step) {
			  case "1":
			    System.out.println("Please enther your value");
			    int input = Integer.parseInt(scan.nextLine());
			    list.insert(new LinkedListNode<Integer>(input));
			    break;
			  case "2":
				  list.print();
			    break;
			  case "3":
				  list.remove();
				  System.out.println("Last node removed");
			    break;
			  case "4":
				  list.peek();
			    break;
			  case "5":
				  list.nodeSize();
			    break;
			  case "6":
				    if(list.check())
				    	 System.out.println("It's empthy");
				    else  System.out.println("it's not empthy");
				    break;
			  case "#":
				 call.printManual();
				 step="-";
				 break;
			  default:
				    System.out.println("wrong input");
				    break;
			}
		}
	}
}
