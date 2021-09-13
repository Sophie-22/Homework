package calculator;
import java.util.Scanner;

public class Subtraction{
public static void main(String[]args) {
	
Scanner input=new Scanner(System.in);
System.out.println(" Please enter the Monthly Salary");
int a = input.nextInt();
System.out.println("Please enter the total of the monthly bills");
int b = input.nextInt();
int d= (a-b);
System.out.println(" the subtraction  of a and b is :" +d );
 
input.close();



}


	
}


