public class binarytodecimal{
public static void main(String args[])
{
int binary[]=new int[20];
int index=0;
int n=10;
while(n>0)
{
binary[index++]=n%2;
n=n/2;
}
for(int i=index-1;i>=0;i--)
{
System.out.print(binary[i]);
}
}
}