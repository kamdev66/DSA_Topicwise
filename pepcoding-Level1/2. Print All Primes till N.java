import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int lo=sc.nextInt();
        int hi=sc.nextInt();
        
        for(int i=lo;i<=hi;i++){
            int j=2;
            while(j*j<=i){
                if(i%j==0){
                    break;
                }
                j++;
            }
            if(j*j>i){
                System.out.println(i);
            }
        }
    }
}