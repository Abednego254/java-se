package ExamTopics.dataTypes;

public class StockRoom {
    private static int stock = 10;
    private static int qty;

    public void purchase(int q) { stock += q; this.qty = q;}

    public void sell(int q) { stock -= q; this.qty = q; }

    public static void printStock(String action) {
        System.out.println(action +" : "+ qty +" items. Stock in hand: "+ stock);
    }

    public static void main(String[] args) {
        StockRoom stockRoom = new StockRoom();
        stockRoom.sell(5);
        StockRoom.printStock("Sold");

        StockRoom stockRoom2 = new StockRoom();
        stockRoom2.purchase(5);
        stockRoom2.printStock("Purchased");
    }
}
