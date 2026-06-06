package ExamTopics.dataTypes;

public class TestTwo {
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card "+ cardNo);
    }

    void checkCard(int cardNumber) throws RuntimeException {
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {
        TestTwo testTwo = new TestTwo();
        int cardNumber = 1234543;
        testTwo.readCard(cardNumber);
        testTwo.checkCard(cardNumber);
    }
}
