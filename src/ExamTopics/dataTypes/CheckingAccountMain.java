package ExamTopics.dataTypes;

public class CheckingAccountMain {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount((int) (Math.random() * 1000));

        account.changeAmount(-account.getAmount());
        System.out.println(account.getAmount());
    }
}
