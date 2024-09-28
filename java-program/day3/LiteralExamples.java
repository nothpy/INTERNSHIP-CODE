public class LiteralExamples {
    public static void main(String[] args) {
        int decimal = 100;
        int octal = 0144;    // 100 in octal
        int hex = 0x64;      // 100 in hexadecimal
        int binary = 0b1100100; // 100 in binary

        double pi = 3.14159;
        float e = 2.71828F;

        char letter = 'A';
        char newline = '\n';

        String greeting = "Hello, World!";
        
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        String nothing = null;

        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);

        System.out.println("Floating-Point Literals:");
        System.out.println("Double: " + pi);
        System.out.println("Float: " + e);

        System.out.println("Character Literals:");
        System.out.println("Char: " + letter);
        System.out.println("Newline Char: " + newline);

        System.out.println("String Literal:");
        System.out.println(greeting);

        System.out.println("Boolean Literals:");
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isFishTasty: " + isFishTasty);

        System.out.println("Null Literal:");
        System.out.println("String value: " + nothing);
    }
}
