class Program1{
    public static void main(String[] args) {
        System.out.println("this is main metthod");
        int a =85;int b=60; int c =78;
        getSum(a ,b);
        System.out.println("main method end");
        int mul = getMul(a,b);
        System.out.println("this is main method which are getting multiplication from getMul() method :"+mul);
        System.out.println("square sum of two number: ");
        System.out.println(getSquareSum(a,b));
        System.out.println("the big from "+a+" and " +b+" is: "+getBig(a,b));
        System.out.println("the biggest number from "+a+" , " +b+" and " +c+ " is: "+getBiggest(a,b,c));
    }
    public static int getBiggest(int x , int y , int z)
    {
        if(x>y && x>z) return x;
        else if(y>x&&y>z) return y;
        else return z;
    }
    public static int getBig(int x , int y)
    {
        if(x>y) return x;
        else return y;
    }
    public static void getSum(int x, int y){
        System.out.println("This is getSum method");
        int sum = x+y;
        System.out.println(sum);
    }
    public static int getMul(int x, int y){
        System.out.println("This is getSum method");
        int mul = x*y;
        System.out.println("This is getMul method multiplication "+ mul);
        return mul;
    }
    public static int getSquareSum(int x , int y){
        int sum = x*x+y*y;
        return sum;
    }
}