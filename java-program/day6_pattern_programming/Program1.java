class Program1{
    public static void main(String[] args)
     {
        int row=9;
        int col = 11;
        printPattern(row, col);
        
    }
    public static void printPattern(int n, int p)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
             System.out.print("* ");
            }
            System.out.println("");
         }
    }
}