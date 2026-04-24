package ExamTopics;

public class StockRoom {
    private int stock = 10;
    private static int qty;
    public void purchase(int qty) {
        stock += qty;
    }
    public void sell(int qty) {
        stock -= qty;
    }
    public void printStock(String action) {
        System.out.println(action +": "+ qty +"items. Stock in hand"+ stock);
    }
}
