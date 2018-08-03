import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class hun4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		   a[i]=sc.nextInt();
		TreeMap <Integer,Integer> mp=new TreeMap<Integer,Integer >();
		for(int i=0;i<a.length;i++)
		{
		    if(mp.containsKey(a[i]))
		    {
		        int kv=mp.get(a[i])+1;
		        mp.put(a[i],kv);
		    }
		    else
		    {
		        mp.put(a[i],1);
		    }
		}
      Set set = mp.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         int b=(int)mentry.getValue();
         System.out.print((b==1)? mentry.getKey()+" ":"");
      }
	}
}
