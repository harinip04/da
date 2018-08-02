import java.util.Scanner;
public class hun3
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
	int b=0;
	for(int i=0;i<n;i++)
	 {
	    if(i==a[i])
	    {
	      System.out.print(a[i]+" ");
	      b=1;
	    }
	 }
	 if(b==0)
	 {
	     System.out.print("-1");
	 }
	}
}
