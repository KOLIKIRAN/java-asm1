import java.util.*;
public class decimaltohexa{
public static void main(String args[])
{
int num,rem;
String hexadecimal="";
char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner sc=new Scanner(System.in);
System.out.print("enter the decimal no:");
num=sc.nextInt();
while(num>0)
{
rem= num%16;
hexadecimal =hexa[rem]+hexadecimal;
num=num/16;
}
System.out.println("equivalent number is:"+hexadecimal);
System.out.print("");
}
}