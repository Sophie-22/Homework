package calculator;

import java.util.Scanner;


public class Monthlysalary {
public static void main(String[]args) {
Scanner as= new Scanner(System.in);
System.out.println("Please enter your daily salary");
int Dailysalary =as.nextInt();
System.out.println("Monthly Slary is :"+ Dailysalary*30);

as.close();
}


}
