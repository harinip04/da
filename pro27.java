import java.util.Scanner;
import java.util.Arrays;
public class pro27
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n],sum=0,flag=1;
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if((i!=j)&&((a[i]+a[j])==k))
		        {
		           flag=0;
		        }
		    }
		}  if(flag==1)
		    System.out.println("no");
		    else
		    System.out.println("yes");
	}
}
