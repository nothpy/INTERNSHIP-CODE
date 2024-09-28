package Inheritance;

class FruitDriver {
    public static void main(String[] args) {
        Fruit m1 = new Mango();
        System.out.println(m1.price);
        m1.taste();
        System.out.println(m1.price);
        // m1.test();
        // m1.printValue();
    }
}
