import java.util.Scanner;
public class comparefloat
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
float num1 = sc.nextFloat();
System.out.println("Enter the second number");
float num2 = sc.nextFloat();
if(Math.round(num1 * 1000) == Math.round(num2 * 1000))
{
System.out.println("The numbers are equal up to three decimal places");
}
else
{
System.out.println("The numbers are not equal up to three decimal");}
}
}