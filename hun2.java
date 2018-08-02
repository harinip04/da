import java.util.Scanner;
import java.util.Arrays;
public class hun2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		Arrays.sort(a);
		int c=n;
        for(int i=0;i<n;i++)
           b[i]=a[--c];
			for(int i=0;i<n;i++)
		 System.out.print(b[i]);
	}
}
