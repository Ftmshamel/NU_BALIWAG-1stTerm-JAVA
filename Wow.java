import java.util.Scanner;

public class Wow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u;
        int i;

        System.out.print("Enter a start number: ");
        u = sc.nextInt();
        System.out.print("Enter a last number: ");
        i = sc.nextInt();

        while (u<i) {
        if (u%3 == 0) {
            System.out.println(u + " WOW");
        } else {
            System.out.println(u + " HAHAHA");
        }
            u++;
        }
    }
}