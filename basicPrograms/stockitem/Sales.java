package basicPrograms.stockitem;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StockItem product2 = new StockItem("Eggs (box of 6)", 10, 175);

        System.out.print("How many boxes of eggs would you like to buy?");
        int amount = sc.nextInt();

        product2.doSale(amount);

        System.out.println("\nInventory Report");
        System.out.println(product2);
    }
}
