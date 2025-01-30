import java.util.Random;
public class sumofrandom
{
public static void main(String[]args)
{
Random rand = new Random();
int num1 = rand.nextInt(100)+1;
int num2 = rand.nextInt(100)+1;
int sum = num1 + num2;
System.out.println("first random number:" + num1);
System.out.println("second random number:" + num2);
System.out.println("The sum of the random number is:" + sum);
}
}

