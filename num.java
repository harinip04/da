import java.util.Scanner;
public class num
{
   public static void main(String s[])
   {
   int a=new Scanner(System.in).nextInt();
   if(a==0)
    System.out.print("zero");
  else
    (a<0)?System.out.print("negative"):System.out.print("positive");
   }
}
