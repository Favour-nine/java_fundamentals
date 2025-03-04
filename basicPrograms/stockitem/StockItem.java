package basicPrograms.stockitem;

class StockItem {
    private String description;
    private int level;
    private double price;
    private Date sellByDate;


    StockItem(String description, int level, double price) {
        this.description = description;
        this.level = level;
        this.price = price;
    }

    StockItem(String description, int level, double price, Date sellByDate) {
        this.description = description;
        this.level = level;
        this.price = price;
        this.sellByDate = sellByDate;
    }


//    public void printReport(){
//        System.out.println("****Stock Report*****");
//        System.out.printf("Item: %s%n", this.description);
//        System.out.printf("Stock Level: %d%n",this.level);
//        System.out.printf("Price: %.1fp%n",this.price);
//        System.out.println("*********");
//    }

    @Override
    public String toString(){
        return "****Stock Report*****   \nItem: " + this.description + "\nLevel: " + this.level + "\nPrice: " + this.price + "\n";
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void doDelivery(int amount){
        this.level = level + amount;
    }

    public void doSale(int amount){
        if(this.level >= amount){
            this.level = level - amount;
        } else{
            System.out.println("can not sell above inventory");
        }
    }

    public Integer getStockLevel(){
        return this.level;
    }

    public  String getDescription(){
        return this.description;
    }

    public void sellByDate(int d, int m, int y){
        this.sellByDate.setDate(d, m, y);
    }



    public static void main(String[] args){
//        StockItem item = new StockItem("Baked beans", 15, 65);
//        item.printReport();
//        System.out.print("done ");

    }
}
