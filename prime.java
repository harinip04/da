import java.util.Scanner;
public class prime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),flag,f=0;
		for(int i=2;i<=n/2;i++)
        {
    
            flag=0;
            if(n%i==0)
               flag=1;
            if(flag==1)
               f=1;
        }
        if(f==0)
         System.out.print("yes");
        else
         System.out.print("no");
	}
}
