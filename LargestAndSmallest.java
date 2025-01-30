import java.util.Scanner;
public class LargestAndSmallest
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = sc.nextInt();
System.out.println("Enter the second number:");
int num2 = sc.nextInt();
System.out.println("Enter the thrid number:");
int num3 = sc.nextInt();
System.out.println("Enter the fourth number:");
int num4 = sc.nextInt();
int largest = num1;
if(num2>largest) largest = num2;
if(num3>largest) largest = num3;
if(num4>largest) largest = num4;
int smallest = num1;
if(num2<smallest) smallest = num2;
if(num3<smallest) smallest = num3;
if(num4<smallest) smallest = num4;
System.out.println("The largest number is:"+largest);
System.out.println("The smallest number is:"+smallest);
}
}












