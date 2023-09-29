import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Enter mo kung ilang taon ka na: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.print("May ka bebe time na siguro 'to");
        } else if (edad >= 12) {
            System.out.print("May ka-stalking stage ka na noh");
        } else {
            System.out.print("ARAL KA MUNANG MABUTI BATA!!");
        }
    }
}