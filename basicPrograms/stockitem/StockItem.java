package basicPrograms.stockitem;

class StockItem {
    private String description;
    private int level;
    private double price;



    StockItem(String description, int level, double price) {
        this.description = description;
        this.level = level;
        this.price = price;
    }

    public void printReport(){
        System.out.println("****Stock Report*****");
        System.out.printf("Item: %s%n", this.description);
        System.out.printf("Stock Level: %d%n",this.level);
        System.out.printf("Price: %.1fp%n",this.price);
        System.out.println("*********");
    }

    public static void main(String[] args){
        StockItem item = new StockItem("Baked beans", 15, 65);
        item.printReport();
        System.out.print("done ");

    }
}
