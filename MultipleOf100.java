import java.util.Scanner;
public class MultipleOf100
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number:");
int num = sc.nextInt();
if(num % 100 == 0){
System.out.println("The number is multiple of 100");}
else {
System.out.println("The number not is multiple of 100");}
}}


