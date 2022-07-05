import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=1;
      
      /*
      //1st method
      System.out.println(a+" ");
      System.out.println(b+" ");
      for(int i=2;i<n;i++){
         int sum=a+b;
         System.out.println(sum);
         a=b;
         b=sum;
      }
      */
      
      //2nd method
      for(int i=0;i<n;i++){
          int c=a+b;
          System.out.println(a+" ");
          a=b;
          b=c;
          
      }
   }
  }