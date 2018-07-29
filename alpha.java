import java.util.Scanner;
public class alpha
{
	public static void main(String[] args) {
	           char a=new Scanner(System.in).next().charAt(0);
	           if(Character.isLetter(a))
	               System.out.print("Alphabet");
	          else
	          System.out.print("No");
		
	}
}
