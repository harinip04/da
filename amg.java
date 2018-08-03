import java.util.Scanner;
public class amg
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),c=0,r;
		int b=a;
		while(a>0)
		{
		    r=a%10;
		    c+=r*r*r;
		    a/=10;
		}
		if(c==b)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
