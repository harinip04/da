import java.util.Scanner;
public class amgrange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=0,r;
		for(int i=++a;i<b;i++)
		{
		int d=i;
		c=0;
		while(d>0)
		{
		    r=d%10;
		    c+=r*r*r;
		    d/=10;
		}
		if(c==i)
		System.out.print(i);
		}
	}
}
