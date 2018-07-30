import java.util.Scanner;
public class sumk
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt(),k=sc.nextInt();
		int sum1=0;
		int a[]=new int[10];
		for(int i=0;i<a1;i++)
		   a[i]=sc.nextInt();
		for(int i=0;i<k;i++)
		   sum1+=a[i];
		   System.out.println(sum1);
	}
}
