import java.util.Scanner;
public class large
{
	public static void main(String[] args) {
	          Scanner sc=new Scanner(System.in);
	          int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	          if((a>b)&&(a>c))
	          System.out.print(a);
	          else
	          System.out.print((b>c)?b:c);
	}
}
