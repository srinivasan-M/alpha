import java.util.*;
class alpha
{
public static void main(String args[])
{
char ch;
Scanner a=new Scanner(System.in);
ch=a.next().charAt(0);
if(Character.isDigit(ch))
System.out.println("Number");
else
System.out.println("Alphabet");
}
}
