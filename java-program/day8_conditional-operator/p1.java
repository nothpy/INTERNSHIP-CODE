public class p1 {
    public static void main(String[] args) {
        /*for (int i =10;i<200;i++)
        {
            int  n=i;
            int j =n;
            int temp=0 ;
            int rem =0;
            while(j>0)
            {
                rem = j%10;
                
                temp= temp*10+rem;
                j=j/10;
            }
            if(temp == n) System.out.print(" Palindrone Number:  "+i +" ");
            else System.out.println("Not Palindrone");
        }*/
        System.out.println("How many digit in number count");
        for(int i=11 ; i<2000000000; i= i*i)
        {
            int n = i;
            // int i =n;
            int count = 0;
            while(n>0)
            {
                n=n/10;
                count++;
            }
            System.out.println(i+" is "+count+" digit number");
            count =0;
        }
        
        
    }
}

