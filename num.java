import java.util.Scanner;
public class num
{
   public static void main(String s[])
   {
   int a=new Scanner(System.in).nextInt();
   if(a==0)
    System.out.print("zero");
  else
    System.out.print((a<0)?"negative":"positive");
   }
}
