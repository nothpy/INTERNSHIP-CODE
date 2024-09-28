import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args)
    {
        int i =1;
        int factor_sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        // int count =0;
        System.out.println("All Factor of Entered number "+n+" is----->>>");
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i+", ");
                factor_sum = factor_sum + i;
                // or
                // count ++;
            }
            i++;
        }
        System.out.println("**********************");
        if(factor_sum == n+1) System.out.println("This number is Prime number");
        // or
        // if(count == 2) System.out.println("This number is Prime number");
        else System.out.println("\"This number is not Prime number\"");
    }
}
