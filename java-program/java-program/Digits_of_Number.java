class Digits_of_Number {
    public static void main(String[] args) {
        int n = 987456321;
        System.out.println("Each digits of a number ");
        EachDigitsPrint(n);
        System.out.println("Even digits of a number ");
        Even_Digits_Print(n);
        System.out.println("Number which are >= 6 :  ");
        Digits_6_greater(n);
        System.out.println("Total number of digits in a number :  ");
        Number_of_digits(n);
        System.out.println("No_of_Even_Digits_Print: ");
        No_of_Even_Digits_Print(n);
        Sum_of_Odd_digits(n);
        Sum_of_Even_digits(n);
        getBiggestAndSmallest(n); 
    }
    public static void EachDigitsPrint(int n)
    {
        int rem =0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            System.out.println(rem);
        }
    }
    public static void Even_Digits_Print(int n)
    {
        int rem =0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            
            if( rem%2 == 0 )
               System.out.println(rem);
        }
    }
    public static void Digits_6_greater(int n)
    {
        int rem =0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            if( rem>=6 )
               System.out.println(rem);
        }
    }
    public static void Number_of_digits(int n)
    {
        int count =0;;
        while(n>0)
        {
            n =n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void No_of_Even_Digits_Print(int n)
    {
        int rem =0;
        int count=0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            
            if( rem%2 == 0 )
               count++;
        }
        System.out.println("Total Even digits : " + count);
    }
    public static void Sum_of_Odd_digits(int n)
    {
        int rem =0;
        int sum=0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            
            if( rem%2!=0 )
               sum = sum+rem;
        }
        System.out.println("Total sum of all odd  digits : " + sum);
    }
    public static void Sum_of_Even_digits(int n)
    {
        int rem =0;
        int sum=0;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            
            if( rem%2==0 )
               sum = sum+rem;
        }
        System.out.println("Total sum of all Even  digits : " + sum);
    }
    public static void getBiggestAndSmallest(int n)
    {
        int rem =0;
        int big = n%10;
        int small = n%10;
        while(n>0)
        {
            rem = n%10;
            n =n/10;
            
            if(big<rem)
               big = rem;
            if(small>rem)
                small=rem;   
        }
        System.out.println("The biggest digit is "+big+" and smallest digit is "+small );
    }
    
}
