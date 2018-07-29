import java.util.Scanner;
public class vowel
{
	public static void main(String[] args) {
	       char a=new Scanner(System.in).next().charAt(0);
	       String b="aeiouAEIOU";
	   	   if((b.indexOf(a))>=0)
		   System.out.print("vowel");
		   else
		   System.out.print("consonant");
	}
}
