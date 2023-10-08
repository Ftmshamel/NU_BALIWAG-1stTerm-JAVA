import java.util.Scanner;

public class Convert {
    static void myMethod(String Length, Double x, Double y) {
        System.out.println(Length + x * y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number you want to convert: ");
        Double lngth = scanner.nextDouble();

        myMethod("Feet: ", lngth, 0.0833333 );
        myMethod("Yard/s: ", lngth, 0.0277778);
        myMethod("Millimeter/s: ", lngth, 25.4);
        myMethod("Centimeter/s: ", lngth, 2.54);
        myMethod("Meter/s: ", lngth, 0.0254);
    }
}