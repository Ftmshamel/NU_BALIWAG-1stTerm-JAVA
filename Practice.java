import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer;

        System.out.print("May Pasok ba mga Idols? YES/NO ");
        answer = sc.nextLine();

        if (answer.equals("YES")) {
            System.out.print("Masaya si Factotum");
        } else {
            System.out.print("Malungkot si Factotum");
        }
        }
    }
