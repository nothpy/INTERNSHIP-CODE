import java.util.*;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a :");
        int a =sc.nextInt();
        System.out.println("Enter the number b :");
        int b =sc.nextInt();
        System.out.println("Enter the number c :");
        int c =sc.nextInt();
        System.out.println("Sum of a and b :" +(a+b));
        System.out.println( a>b && a>c ? "biggest number a is "+a : "biggest number b is "+b );
        // String n =sc.nextLine();
        int big =  a>b?a:b;
        int biggest = big>c?big:c;
        System.out.println("Biggest number of a , b and c is : "+biggest);
    }
}
