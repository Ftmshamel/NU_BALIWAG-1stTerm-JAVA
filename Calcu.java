import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****CALCULATOR*****\n");

        String Kayapa;
        do {
            System.out.print("Enter first number: ");
            int pers = sc.nextInt();
            System.out.print("Enter second number: ");
            int sekond = sc.nextInt(); 
            
            int total;
            int total1;
            int total2;
            int total3;

            total = (pers + sekond);
            total1 = (pers - sekond);
            total2 = (pers * sekond);
            total3 = (pers / sekond);

            System.out.println("Pick an operator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Please, pick an operator (just enter the number): ");
            int ope = sc.nextInt();

            switch (ope) {
                case 1:
                    System.out.println("Total: " + total);
                    break;
                case 2:
                    System.out.println("Total: " + total1);
                    break;
                case 3:
                    System.out.println("Total: " + total2);
                    break;
                case 4:
                    System.out.println("Total: " + total3);
                    break;
                default:
                    System.out.println("Invalid");
                    return;
            }
            System.out.print("Do you want to compute another one? YES/NO: ");
            Kayapa = sc.next();
        } while (Kayapa.equalsIgnoreCase("YES"));
    }
}