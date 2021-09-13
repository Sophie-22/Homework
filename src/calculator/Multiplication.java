package calculator;

import java.util.Scanner;


public class Multiplication {
public static void main(String[]args){
Scanner as= new Scanner(System.in);
System.out.println("Please enter your weekly salary");
int Weeklysalary =as.nextInt();
System.out.println("Monthly Slary is :"+ Weeklysalary*4);

as.close() ;
}

}
