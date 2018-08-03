import java.util.Scanner;
public class palin
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=0;
		int d=a;
		while(a>0)
		{
		    b=b*10+(a%10);
		    a/=10;
		}
		if(d==b)
         System.out.print("yes");
         else
         System.out.print("no");
	}
}
