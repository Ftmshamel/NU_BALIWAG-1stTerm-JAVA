import java.util.Scanner;

public class Mahinanet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nambir;

        System.out.print("Enter a number: ");
        nambir = sc.nextInt();

        if (nambir %2 == 0){
            System.out.print("EVEN");
        } else if (nambir %3 == 0) {
            System.out.print("NICE");
        } else {
            System.out.print("BORING");
        }
    }
}