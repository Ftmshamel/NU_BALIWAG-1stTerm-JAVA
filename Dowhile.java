import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u;
        int i;

        System.out.print("Enter a start number: ");
        u = sc.nextInt();
        System.out.print("Enter a last number: ");
        i = sc.nextInt();

        do { 
            if (u%3 == 0) {
                System.out.println(u + " HATDOG");
            } else {
                System.out.println(u + " HA");
            }
            u++;
        } while (u<i);
    }
}