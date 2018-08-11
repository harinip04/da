import java.util.Scanner;
import java.util.Arrays;
public class pro26
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),a[]=new int[n],b[]=new int[n],sum=1,flag=1;
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=1;i<n;i++)
		{
		    if(a[i-1]!=a[i])
		    ++flag;
		    sum+=flag;
		}  
		    System.out.println(sum);
	}
}
