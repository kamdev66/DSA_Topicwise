import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s=sc.next();
      char c=sc.next().charAt(0);
      Boolean val=false;
      int ans=-1;
      for(int i=0;i<n;i++){
        if(s.charAt(i)==c){
          val=true;
          ans=i+1;
          break;
        }else{
          val=false;
        }
      }
      if(val==true){
          System.out.println(ans);
        }else{
          System.out.println("-1");
        }
	}
}