public class reversestringbuilder
{
public static void main(String[]args)
{
String str = "Hello";
StringBuilder sb = new StringBuilder(str);
sb.reverse();
System.out.print("Reversed String :" +sb.toString());
}
}
