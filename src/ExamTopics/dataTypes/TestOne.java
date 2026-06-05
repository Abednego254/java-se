package ExamTopics.dataTypes;

public class TestOne {
    public void updatePrice(Product product, double price) {
        price *= 2;
        product.price += price;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.price = 200;
        double newPrice = 100;

        TestOne test = new TestOne();
        test.updatePrice(product, newPrice);
        System.out.println(product.price +": "+ newPrice);
    }
}
