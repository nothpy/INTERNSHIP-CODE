public class methodOverloading {
    public static void sum(int x,  int y) {
        System.out.println("Sum of int , int type : "+(x+y));
    }
    public static void sum(int x,  int y, int z) {
        System.out.println("Sum of int , int , int type : "+(x+y+z));
    }
    public static void sum(int x,  double y) {
        System.out.println("Sum of int , double type : "+(x+y));
    }
    public static void sum(double x,  int y) {
        System.out.println("Sum of double, int type : "+(x+y));
    }
   public static void main(String[] args) {
    sum(10,20);
    sum(10.5,20);
    sum(10, 20 ,11);
   }
}
