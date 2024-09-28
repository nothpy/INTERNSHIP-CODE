public class Pen{
    String name;
    int price; 
    String color;
    static int n=1;
    Pen(){
          System.err.println("Details of Pen=================");
    }
    Pen(String name)
    {
        this.name= name;
        n++;
    }
    Pen(String name, int price){
        this.name= name;
        this.price =price;
        n++;
    }
    Pen(String name, int price , String color)
    {
        this.name= name;
        this.price =price;
        this.color = color;
        n++;
    }
    public void display()
    {
        System.out.println("_____Constructor Number : "+n+" is called_____");
        System.out.println("Name of pen is: "+name);
        System.out.println("Price of pen is : "+price);
        System.out.println("Name of pen color: "+color);
        System.out.println("==========================");
    }
}