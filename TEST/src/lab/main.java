package lab;
import java.util.*;
import lab.Chain;

public class main {
	
	public void printManual()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("-------------Action-------------------value-------");
		System.out.println("------Add new value to chain------------1-------");
		System.out.println("-------Print all value on chain---------2-------");
		System.out.println("-------Delete chain---------------------3-------");
		System.out.println("----------See first value---------------4-------");
		System.out.println("----------get sizeof chain -------------5-------");
		System.out.println("--------check chain is empthy-----------6-------");
		System.out.println("--------------------------------------");
		System.out.println("--------See manual -----------#-------");
		System.out.println("--------------------------------------");
		System.out.println("------------------------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main call=new main();
		Chain callFunc=new Chain();
		Scanner scan=new Scanner(System.in);
		call.printManual();
		while(true)
		{
			System.out.println("please enther ");
			String step = scan.nextLine();
			switch (step) {
			  case "1":
			    System.out.println("Please enther value");
			    int input = Integer.parseInt(scan.nextLine());
			    callFunc.push(input);
			    break;
			  case "2":
				  callFunc.printList();
			    break;
			  case "3":
				  callFunc.empthyChain();
				  System.out.println("chain now empthy");
			    break;
			  case "4":
				  System.out.println("first value - "+callFunc.peek());
			    break;
			  case "5":
			    System.out.println("Size of chain - "+callFunc.getCount());
			    break;
			  case "6":
				    if(callFunc.isEmpthy())
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
