import java.util.Scanner;
public class pro23
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),m=sc.nextInt(),a[]=new int[n+1],b[]=new int[m+1],c[]=new int [m+1],sum=9999;
		for(int i=1;i<=n;i++)
		   a[i]=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
		    b[i]=sc.nextInt();
		    c[i]=sc.nextInt();
		}
		for(int i=1;i<=m;i++)
		{
		    sum=9999;
		    for(int j=b[i];j<=c[i];j++)
		    {
		        if(sum>a[j])
		          sum=a[j];
		    }
		    System.out.println(sum);
		}
	}
}
