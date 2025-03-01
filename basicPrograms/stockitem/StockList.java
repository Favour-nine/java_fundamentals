package basicPrograms.stockitem;

import java.util.ArrayList;

public class StockList {
    private ArrayList<StockItem> warehouse;

    public StockList() {
        warehouse = new ArrayList<StockItem>();
    }

    public void addStockItem(StockItem item) {
        warehouse.add(item);
    }

    public int noOfStockItems() {
        return warehouse.size();
    }

    public void removeItem(int index){
        if(index >= 0 && index < warehouse.size()){
            warehouse.remove(index);
        }
    }

    public void showAllItems(){
        for(int i = 0; i < warehouse.size(); i++){
            System.out.println(warehouse.get(i).toString());
        }
    }

    public String getAllItems(){
        String all = "";
        for (int i = 0; i < warehouse.size(); i++) {
            all = all + warehouse.get(i).toString();
        }
        return all;
    }

    public String getItem(int index){
        if(index >= 0 && index < warehouse.size()){
            return warehouse.get(index).toString();
        } else{
            return null;
        }
    }

    public String getItem(String description){
        if(description.equals(StockItem.getDescription())){
            return StockItem.
        } else {
            return null;
        }
    };

    public static void createNewStockItem(String description, int level, double price){

    }

}
