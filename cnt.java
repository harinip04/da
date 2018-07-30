import java.util.Scanner;
public class cnt
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int sum1=0;
        while(a1>0)
        {
            a1=a1/10;
            sum1++;
        }
		   System.out.println(sum1);
	}
}
