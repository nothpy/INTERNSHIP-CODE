class Program2{
    public static void main(String[] args)
     {
        int row=5;
        int col = 5;
        printPattern(row, col);
        
    }
    public static void printPattern(int n, int p)
    {
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=p;j++){
        //      System.out.print(j+" ");
        //     }
        //     System.out.println("");
        //  }
         System.out.println("");
         for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                if((1<i&&i<n) && (1<j&&j<p) )  System.out.print(" ");
                 else System.out.print(i+"");
            }
            System.out.println(" ");
         }
    }
}