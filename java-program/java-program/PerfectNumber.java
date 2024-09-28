
// when sum of all factor is equal to those number is called perfect number example 28 -->factor--> 1, 2, 4, 7, 14 ,28 and factor sum = 1+2+4+7+14 = 28 

import java.util.Scanner;
class PerfectNumber {
    public static void main(String[] args) {
        int i =1;
        int factor_sum =0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while(i<=n)
        {
            if(n%i==0)
            {
                // System.out.println(i);
                factor_sum = factor_sum + i;
            }
            i++;
        }
        if(factor_sum-n == n) System.out.println("This number is Perfect number");
        else System.out.println("This number is not Perfect number");
    }
}
