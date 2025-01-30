import java.util.Scanner;
public class evenodd
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number:");
int num1 = sc.nextInt();
System.out.print("Enter the second number:");
int num2 = sc.nextInt();
int sum = num1 + num2;
System.out.print("the sum of the number is:"+sum);
if(sum%2==0){
System.out.print("The sum of the number is Even");}
else {
System.out.print("The sum of the number is Odd");}
}
}




