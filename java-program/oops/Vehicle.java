public class Vehicle{
    String name;
    int price;
    String color;
    Vehicle(String name, int price , String color)
    {
        this.name= name;
        this.price = price;
        this.color = color;

    }
    public void display()
    {
        System.out.println("Name of vehicle is: "+name);
        System.out.println("Price of vehicle is: "+price);
        System.out.println("Color of vehicle is: "+color);
        System.out.println("=============================");
    }
}