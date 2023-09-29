import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String gender;

        System.out.print("Ano ang iyong pangalan: ");
        name = sc.nextLine();
        System.out.print("Ano ang iyong kasarian: ");
        gender = sc.nextLine();

        switch (gender) {
            case "Babae":
                System.out.print("Ang ganda mo " + name + "<3");
                break;
            case "Lalaki":
                System.out.print("Ang gwapo mo " + name + "<3");
                break;
            default:
                System.out.print("Tanggap ka namin " + name + "<3");
                break;
        }
    }
}