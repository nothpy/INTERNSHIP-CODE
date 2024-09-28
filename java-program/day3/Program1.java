class Program1
{
     
     public static void test()
     {
         System.out.println("This is test method");
     }

     public static void main(String[] args)
     {
        System.out.println(DataTypesExample.r); // accesing static variable from another class but non static variable cannnot access directly so we are access through object creation 
        DataTypesExample.mohmaya(); // accesing data using function from another class of DataTypesExample
        // Program2.prog2();   
         System.out.println("This is main method ");
         demo();
         test();
         demo();
     }

     public static void demo()
     {
         System.out.println("This is main demo👍👍👍👍👍👍👍👍👍👍");
         test();
     }

}