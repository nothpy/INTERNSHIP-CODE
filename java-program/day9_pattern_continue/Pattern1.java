public class Pattern1 {
    
    public static void main(String[] args)
    {
        int n=7;
        int mid =(n/2)+1;
        int left =mid;
        int k= mid;
        for(int i=1;i<=k ;i++){
            for(int j=1;j<=n;j++){
               if(j>=left && j<=mid && i<=mid) System.out.print("* ");
               else System.out.print("  ");
            }
            left--;
            mid++;
            System.out.println("");
         }
         for(int i=1;i>k ;i++){
            for(int j=n;j<=1;j--){
               if(j>=left && j<=mid && i>mid) System.out.print("* ");
               else System.out.print("  ");
            }
            left++;
            mid--;
            System.out.println("");
         }
         System.out.println("");
    }
}
