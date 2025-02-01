import java.util.Scanner;
public class AdditionAndSubtraction
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number:");
int num1 = sc.nextInt();
System.out.print("Enter the second number:");
int num2 = sc.nextInt();
int sum = num1 + num2;
int difference = Math.abs(num1 - num2);
System.out.println("The addition is:"+sum);
System.out.println("The subtraction is:"+difference);
}
}
 

