public static void reverse(int[] a,int i,int j){
      int li=i;
      int ri=j;
      
      while(li<=ri){
          int temp=a[li];
          a[li]=a[ri];
          a[ri]=temp;
          li++;
          ri--;
      }
  }
  
  public static void rotate(int[] a, int k){
    // rotate code
    k=k%a.length;
    if(k<0){
        k=k+a.length;
    }
    
    //part1 array reverse
    reverse(a,0,a.length-k-1);
    
    //part2 array reverse
    reverse(a,a.length-k,a.length-1);
    
    //full array
    reverse(a,0,a.length-1);
    
  }