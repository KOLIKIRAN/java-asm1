import java.util.*;
public class binarytooct{
public static void main(String args[])
{
int num,rem;
String octal="";
char oct[]={'0','1','2','3','4','5','6','7',};
Scanner sc=new Scanner(System.in);
System.out.print("enter the binary number:");
num=sc.nextInt();
while(num>0)
{
rem= num%8;
octal =oct[rem]+octal;
num=num/8;
}
System.out.println("equivalent number is:"+num);
System.out.print(octal);
}
}