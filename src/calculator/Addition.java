package calculator;
import java.util.Scanner;


public class Addition {

	
			
public static void main (String[]args) {
Scanner input=new Scanner (System.in);


System.out.println("please enter the number of adults :");
int adults=input.nextInt();
System.out.println("please enter the  number of kids ");
int kids=input.nextInt();
System.out.println(adults+kids);



 input.close() ;

 

	
	}

}
