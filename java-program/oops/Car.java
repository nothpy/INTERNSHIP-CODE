public class Car {
    String name;
    int price;
    static int count =0;
    Car()
    {
        count++;
        System.out.println("Car object created c"+count);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
    } 
}
