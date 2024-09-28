public class DataTypesExample {
    // global varables
       static int r =40; // static global variable
       int j =30 ; //non static global varable
    public static void main(String[] args) {
        // Primitive data types
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;

        float f = 234.5f;
        double d = 123.4;

        char c = 'A';
        boolean bool = true;

        // Reference data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("Reference Data Types:");
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int k = 0; k<5; k++) {
            System.out.print(arr[k]);
        }
        int xy =10;
        double yx =230.90;
        double sum = xy+yx;
        // float kg =30.8f;
        System.out.println(xy);
        System.out.println(yx);
        System.out.println(sum);
        System.out.println("यह किसी लेख, निबंध या रचना का अंश भी हो सकता है किन्तु स्वयं में पूर्ण होना चाहिए। किसी भी शब्द, वाक्य, सूत्र से सम्बद्ध विचार एवं भावों को अपने अर्जित ज्ञान, निजी अनुभूति से संजोकर प्रवाहमयी शैली के माध्यम से गद्यभाषा में अभिव्यक्त करना अनुच्छेद कहलाता है। विकिपीडिया पर \"Paragraph\" भी देखें।");
        System.out.println("यह एक हिंदी पेराग्राफ है।");
    }
    public static void mohmaya()
     {
         System.out.println("This is mohmaya");
     }
}
