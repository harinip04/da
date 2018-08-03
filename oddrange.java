import java.util.Scanner;
public class oddrange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		m=(m%2==0)?++m:m+2;
		for(int i=m;i<n;i+=2)
         System.out.print(i+" ");
	}
}
