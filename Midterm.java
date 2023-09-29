import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("--------------------------------------------\n");
        System.out.printf("[%-8s] [%-20s] [%-8s]\n" , "CODE" , "DESCRIPTION" , "PRICE");
        System.out.printf("[%-8d] [%-20s] [%-8d]\n" , 1 , "Pencil", 20);
        System.out.printf("[%-8d] [%-20s] [%-8d]\n" , 2 , "Notebook" , 40);
        System.out.printf("[%-8d] [%-20s] [%-8d]\n" , 3 , "Eraser" , 10);
        System.out.printf("--------------------------------------------\n");

        String Kayapaba;
        do {
            int kowd;

            System.out.print("Enter Item Code: ");
            kowd = sc.nextInt();

            int qty;
            int qty1;
            int qty2;
            int towtal;
            int towtal1;
            int towtal2;
            int tdrd;
            int tdrd1;
            int tdrd2;
            int chng;
            int chng1;
            int chng2;

            switch (kowd){
                case 1:
                    System.out.println("Description: Pencil = 20");
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    towtal = 20 * qty;
                    System.out.println("Total amount: " + towtal);
                    System.out.print("Cash Tendered: ");
                    tdrd = sc.nextInt();
                    chng = tdrd - towtal;
                    if (towtal < tdrd) {
                        System.out.println("Change: " + chng);
                    } else {
                        System.out.println("INSUFFICIENT MONEY");
                    }
                    break;
                case 2:
                    System.out.println("Description: Notebook = 40");
                    System.out.print("Quantity: ");
                    qty1 = sc.nextInt();
                    towtal1 = 40 * qty1;
                    System.out.println("Total amount: " + towtal1);
                    System.out.print("Cash Tendered: ");
                    tdrd1 = sc.nextInt();
                    chng1 = tdrd1 - towtal1;
                    if (towtal1 < tdrd1) {
                        System.out.println("Change: " + chng1);
                    } else {
                        System.out.println("INSUFFICIENT MONEY");
                    }
                    break;
                case 3:
                    System.out.println("Description: Eraser = 10");
                    System.out.print("Quantity: ");
                    qty2 = sc.nextInt();
                    towtal2 = 10 * qty2;
                    System.out.println("Total amount: " + towtal2);
                    System.out.print("Cash Tendered: ");
                    tdrd2 = sc.nextInt();
                    chng2 = tdrd2 - towtal2;
                    if (towtal2 < tdrd2) {
                        System.out.println("Change: " + chng2);
                    } else {
                        System.out.println("INSUFFICIENT MONEY");
                    }
                    break;
                default:
                    System.out.print("INVALID CODE");
                    return;
            }
                System.out.println("Do you want another transaction? 1-YES;2-N0 ");
                Kayapaba = sc.next();
        } while (Kayapaba.equals("1"));
    }
}