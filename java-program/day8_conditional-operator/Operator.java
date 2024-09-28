class Operator {
    public static void main(String[] args) {
        int x =98, y=90;
        System.out.println(x>y?x+y:x+y);
        // System.out.println(true ? 10 : 20);
        // System.out.println(false ? 10 : 20);
        // System.out.println(true ? fun1() : fun2());
        // System.out.println(false ? fun1() : fun2());
        // System.out.println(false ? fun3() : fun4());
        // System.out.println(true ? fun3() : fun4());
    }
    public static int fun1(){
        System.out.println("This is Function 1");
        return 1;
    }
    public static int fun2(){
        System.out.println("This is function 2");
        return 2;
    }
    public static String fun3(){
        System.out.println("This is Function 3");
        return "Fun string 3";
    }
    public static String fun4(){
        System.out.println("This is function 4");
        return "Fun string 4";
    }
}
