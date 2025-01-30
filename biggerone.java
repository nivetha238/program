import java.util.Scanner;
public class biggerone
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
double num1 = sc.nextDouble();
double num2 = sc.nextDouble();
if(num1 > num2){
System.out.print("num1 is bigger");}
else if(num1 < num2){
System.out.print("num2 is bigger");}
else{
System.out.print("both are equal");}
}
}