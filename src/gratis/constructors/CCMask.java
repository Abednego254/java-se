package gratis.constructors;

public class CCMask {
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        // LINE N1
        return x + creditCard.substring(15, 19);
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9012-3456"));
    }
}
