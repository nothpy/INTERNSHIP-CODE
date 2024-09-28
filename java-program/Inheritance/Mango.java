package Inheritance;

class Mango extends Fruit {
    int price =100;
    public void test()
    {
        System.out.println("Taste of Mango is sweet");
    }

    public void printValue()
    {
        System.out.println(price);
        System.out.println(super.price);
    }
}
