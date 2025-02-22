package basicPrograms.stockitem;

public class Tester2 {
    public static void main(String[] args) {
        StockItem product1 = new StockItem("Baked Beans 415g", 15, 65);
        StockItem product2 = new StockItem("Eggs (box of 6", 10, 175);
        StockItem product3 = new StockItem("Bread", 7, 89);

        product3.setPrice(99);
        product1.doDelivery(10);
        product2.doSale(3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
