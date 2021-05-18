import java.util.*;
public class rectangle{
public static void main(String args[])
{
float l,b,priameter,area;
Scanner sc =new Scanner(System.in);
System.out.println("enter the width :");
l=sc.nextInt();
System.out.println("enter the hight :");
b=sc.nextInt();

priameter=2*(l+b);
System.out.println("priameter of rectangle is"+priameter);

area=l*b;
System.out.println("area of rectangle is"+area);


}
}