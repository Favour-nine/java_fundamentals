package basicPrograms.stockitem;
import java.util.Scanner;

class StockItem {
    private String description;
    private int level;
    private double price;

    Scanner sc = new Scanner(System.in);

    StockItem(String descript, int lv, double itemPrice) {
        description = descript;
        level = lv;
        price = itemPrice;

//        System.out.print("Enter description: ");
//        description= sc.nextLine();
//        System.out.print("Enter level: ");
//        level= sc.nextInt();
//        System.out.print("Enter price: ");
//        price= sc.nextDouble();

//        sc.close();

    }

    public static void printReport(){
        StockItem item = new StockItem();
        System.out.println("****Stock Report*****");
        System.out.printf("Item: %s", item.description);
        System.out.printf("\nStock Level: %d",item.level);
        System.out.printf("\nPrice: %.1fp",item.price);
        System.out.println("\n*********");
    }

    public static void main(String[] args){
        printReport();
        System.out.print("done ");

    }
}
