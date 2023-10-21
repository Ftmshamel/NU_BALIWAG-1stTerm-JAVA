import java.util.ArrayList;
import java.util.Scanner;

public class Reylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();
        items.add("[0] Box of Sardines");
        items.add("[1] Box of Candy");
        items.add("[2] Box of Chocolates");
        items.add("[3] Box of Biscuits");
        items.add("[4] Box of Breads");
        items.add("[5] Box of Coffee");

        String item;

        do {
            System.out.println("");
            System.out.println("=========================================================");
            System.out.println("[----------------------- MY ITEMS ----------------------]");
            System.out.println("=========================================================");

            for (String currentItem : items) {
                System.out.println(currentItem);
            }

            System.out.println("--------------------------------------------------------");
            System.out.print("What item you wanna pick? Enter the number only: ");
            int item1 = scanner.nextInt();
            System.out.println("--------------------------------------------------------");

            System.out.println("");
            System.out.println("========================================================");
            System.out.println("[------------------------ STOCKS ----------------------]");
            System.out.println("========================================================");
            System.out.println("[0] Box of Tuna");
            System.out.println("[1] Box of Pastries");
            System.out.println("[2] Box of Cupcakes");
            System.out.println("[3] Remove the Item");
            System.out.println("---------------------------------------------------------");
            System.out.print("Which stock will you select? ");
            int item2 = scanner.nextInt();
            System.out.println("---------------------------------------------------------");

            System.out.println("[----------------------- NEW ITEM ----------------------]");
            String Items = scanner.nextLine();

            switch (item2) {
                case 0:
                    items.set(item1, "[] Box of Tuna");
                    break;
                case 1:
                    items.set(item1, "[] Box of Pastries");
                    break;
                case 2:
                    items.set(item1, "[] Box of Cupcakes");
                    break;
                case 3:
                    items.set(item1, "");
                    break;
                default:
            }
            for (String currentItem : items) {
                System.out.println(currentItem);
            }
            System.out.println("---------------------------------------------------------");
            System.out.print("Add Item: ");
            String Items1 = scanner.nextLine();

            items.add("[] " + Items1);

            for (String currentItem : items) {
                System.out.println(currentItem);
            }

            System.out.println("---------------------------------------------------------");
            System.out.print("Do you want another transaction? YES/NO: ");
            item = scanner.next();
            System.out.println("---------------------------------------------------------");
        } while (item.equalsIgnoreCase("yes"));
    }
}
