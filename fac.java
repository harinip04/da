import java.util.Scanner;
public class fac
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),c=1,r;
	    for(int i=1;i<=a;i++)
	        c*=i;
		System.out.print(c);
	}
}
