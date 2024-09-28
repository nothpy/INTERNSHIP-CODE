class P1 {
    public static void main(String[] args) {
        System.out.printf("%-8d",        123);
        System.out.printf("%-5d",77);
        System.out.printf("%08d%n",123);
        System.out.printf("%05d",77);
        String s1 ="moHan is here";
        System.out.printf("%s%n",s1);
        System.out.printf("%S%n",s1);
        int x= 230;
        double y =45.3857;
        String s2= "abcdef";
        int z =30;
        System.out.printf("%5d  %.2f %s %d",x,y,s2,z);
        System.out.println("*************************");
        int a=1;
        int n =17;
        for(int i=1; i<=n ;i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                System.out.printf("%4d",a);
                a++;
            }
            System.out.println();
        }
        
    }
    public static void printPattern(int n) {
        int x =1;
        int space = n/2;
        int star =1;
        for(int i =1; i<=n ; i++){
            for(int j =1 ;j<=n;j++)
            {
                System.out.println("");
            }
        }

    }
}
