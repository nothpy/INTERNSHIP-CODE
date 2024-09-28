public class PenDriver {
    public static void main(String[] args) {
        Pen p1 =new Pen();
        p1.display();
        Pen p2 = new Pen("Jetter");
        p2.display();
        Pen p3 = new Pen("Win", 10);
        p3.display();
        Pen p4 = new Pen("Roreto", 5,"black");
        p4.display();
        Pen p5 = new Pen("Renolds", 10,"Yellow");
        p5.display();
        Pen p6 = new Pen("Jell", 15,"Green");
        p6.display();
    }
}
