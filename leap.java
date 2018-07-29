import java.util.Scanner;
public class leap
{
	public static void main(String[] args) {
	          Scanner sc=new Scanner(System.in);
	          int a=sc.nextInt();
	          if((a%4==0)&&(a%100!=0)||(a%400==0))
	          System.out.print("yes");
	          else
	          System.out.print("no");
	}
}
