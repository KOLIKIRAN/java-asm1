import java.util.*;
public class hexa{
public static void main(String args[])
{
int num,rem;
String hexa="";
char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner sc=new Scanner(System.in);
System.out.print("enter the binary number:");
num=sc.nextInt();
while(num>0)
{
rem= num%16;
hexa =hex[rem]+hexa;
num=num/16;
}
System.out.println("equivalent number is:"+num);
System.out.print(hexa);
}
}