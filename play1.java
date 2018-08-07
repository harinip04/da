import java.util.Scanner;
public class play1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		a=new StringBuffer(a).reverse().toString();
		System.out.print(a);
	}
}
