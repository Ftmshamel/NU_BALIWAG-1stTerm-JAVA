import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u;
        int i;

        System.out.print("Enter a start number: ");
        u = sc.nextInt();
        System.out.print("Enter a last number: ");
        i = sc.nextInt();

        while (u<i+1) {
        System.out.println(u);
        u++;
        }
    }
}