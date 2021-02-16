package lab;
import java.util.*;
import lab.Chain;

public class main {
	
	public void printManual()
	{
		System.out.println("-------------------------------");
		System.out.println("Та даараах үйлдэлийг хийж болно.\n "
				+ "Тухйан үйлдлийг хийхэд та харгалзсан утгийг оруулна уу");
		System.out.println("-------Хийх үйлдэл----------Орох утга-------");
		System.out.println("---Гинжинд утга нэмэх-----------1-------");
		System.out.println("Гинжиндэх бүх утгийг хэвлэх-----2-------");
		System.out.println("Гинжиндэх эхний утгийг хасах----3-------");
		System.out.println("Гинжиндэх эхний утгийг хэвлэх---4-------");
		System.out.println("Гинжийн уртийг хэвлэх хэвлэх----5-------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main call=new main();
		Chain callFunc=new Chain();
		Scanner scan=new Scanner(System.in);
		call.printManual();
		while(true)
		{
			System.out.println("Хийх үйлдэл харгалзсан утгийг оруулна уу");
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
				  System.out.println("Tuesday "+callFunc.pop());
			    break;
			  case "4":
				  System.out.println("Tuesday "+callFunc.peek());
			    break;
			  case "5":
			    System.out.println("Friday"+callFunc.getCount());
			    break;
			  case "6":
				    if(callFunc.isEmpthy())
				    	 System.out.println("Friday");
				    else  System.out.println("Friday");
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
