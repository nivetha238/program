import java.util.Scanner;
public class sumofnaturalnumbers
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of terms:");
int n = sc.nextInt();
int sum = 0;
for(int i=0;i<=n;i++){
sum+=i;}
System.out.println("sum ="+sum);
}
}
