import java.util.Scanner;
public class pro1
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String args[]=new String[n];
        for(int i=0;i<n;i++)
        {
            args[i]=sc.nextLine();
        }
        String a=re.Prefix(args);
        System.out.println(a);
    }
    public static String Prefix(String[] strs) {
    String longestPrefix = "";
    if(strs.length>0){
        longestPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPrefix = strs[i].substring(0, j);
    }
    return longestPrefix;
}
}
