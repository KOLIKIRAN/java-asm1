 import java.util.*;
public class circle{
public static void main(String args[])
{
float r;
double a=3.14,area,perimeter;
Scanner sc=new Scanner(System.in);
System.out.println("enter he readius of circle" );
r=sc.nextFloat();
area=a*r*r;
 perimeter=2*a*r;
System.out.println("perimeter is" +perimeter);


System.out.println("area of circle" +area);
}
}