package calculator;
import java.util.Scanner ;


public class Operators {
public static void main(String[]args) {
Scanner cal=new Scanner(System.in);
System.out.println("enter the first number");
int n1= cal.nextInt();
System.out.println("please enter the second number");
int n2=cal.nextInt();
System.out.println("the addition of the number is : " + (n1+n2));
System.out.println("the division of the number is :" + (n1/n2));
System.out.println("the multiplication of the number is :" +(n1*n2));
System.out.println("the substarction  of the number is : " + (n1-n2));
 cal.close();

}

}
