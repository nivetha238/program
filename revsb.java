public class revsb
{
public static void main(String[]args)
{
int num = 2345;
StringBuffer sb = new StringBuffer(String.valueOf(num));
StringBuffer rev = sb.reverse();
System.out.println("Rev is:"+ rev);
}}


