import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;

        String[] items = {"0. Box of Sardines", "1. Box of Candy", "2. Box of Chocolates", "3. Box of Biscuits", "4. Box of Breads", "5. Box of Coffee"};

        do{
            System.out.println("----- My Items -----");
            for (int i = 0; i < items.length; i++) {
                System.out.println("" + items[i]);
            }
            //String[] items = {"Box of Sardines", "Box of Candy", "Box of Chocolates", "Box of Biscuits", "Box of Breads", "Box of Coffee"};
            //System.out.println("0. Box of Sardines");
            //System.out.println("1. Box of Candy");
            //System.out.println("2. Box of Chocolates");
            //System.out.println("3. Box of Biscuits");
            //System.out.println("4. Box of Breads");
            //System.out.println("5. Box of Coffee");
            System.out.print("|What item you wanna pick? number only: ");
            int item1= scanner.nextInt();

            System.out.println("----- Stocks -----");
            System.out.println("0. Box of Pastries");
            System.out.println("1. Box of Tuna");
            System.out.println("2. Box of Cupcakes");
            System.out.println("3. Remove the Item");
            System.out.print("|Which stock will you select? ");
            int item2 = scanner.nextInt();

            switch (item2) {
                case 0:
                    items[item1] = "1. Box of Pastries";
                    break;
                case 1:
                    items[item1] = "0. Box of Tuna";
                    break;
                case 2:
                    items[item1] = "2. Box of Cupcakes";
                    break;
                case 3:
                    items[item1] = "";
                    break;
                default:
            }
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
            System.out.print("|Do you want another transaction? YES/NO: ");
            item = scanner.next();
        }
        while (item.equalsIgnoreCase("yes"));
    }
}