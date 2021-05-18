import java.util.*;
public class decimaltooctal{
public static void main(String args[])
{
int num,rem;
String octal="";
char oct[]={'0','1','2','3','4','5','6','7',};
Scanner sc=new Scanner(System.in);
System.out.print("enter the decimal no:");
num=sc.nextInt();
while(num>0)
{
rem= num%8;
octal =oct[rem]+octal;
num=num/8;
}
System.out.println("equivalent number is:"+octal);
System.out.print("");
}
}