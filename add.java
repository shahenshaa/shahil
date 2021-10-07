import java.util.Scanner;
class add
{
public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the a & b: ");
     int a=s.nextInt();
     int b=s.nextInt();
	if(a>b)
	{
		System.out.println(a+ "a is large num");
	}
	else
	{
		System.out.println(b+ "b is large num");
	}
  }
}