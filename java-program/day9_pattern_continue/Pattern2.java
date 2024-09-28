public class Pattern2 {
    public static void main(String[] args) {
        int n=24;
         if(n%2!=0){
            int s_star =1; int e_star=n;
            for(int i=1 ; i<=n;i++)
            {
                for(int j =1;j<=n;j++)
                {
                     if(j<= s_star ||j>=e_star)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                 if(i<n/2+1){
                    s_star ++;
                    e_star--;
                }
                else{
                    s_star--;
                    e_star++;
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Tum Engineers ka Kuch nhi ");
        }
    }
}
