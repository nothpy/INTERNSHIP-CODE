public class Pattern1 {
    public static void main(String[] args) {
        int n =11;
        int mid =n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){ 
               if(j==1 || i==1 || i==mid|| (j==n) && i<mid) System.out.print("* ");
               else System.out.print("  ");
            }
            System.out.println("");
         }
         System.out.println();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(j==1 || i==1 || i==n|| (j==n) && (i>=mid) || (i>=mid && j>=mid) || (j==mid && i>mid)) System.out.print("* ");
               else System.out.print("  ");
            }
            System.out.println("");
         }
         int left = mid;
         int right = mid;
         int k = 5;
         int l = 9;
         for(int i=1;i<=5;i++){
            for(int j=1;j<=l;j++){
               if(j>=left && j<= right) System.out.print("* ");
               else System.out.print("  ");
            }
            left --;
            right ++;
            System.out.println("");
         }
    }
}
