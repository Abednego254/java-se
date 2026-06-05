package gratis.StringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder(5);
        String s = "";
        
        if(sBuilder.equals(s)) {
            System.out.println("Match 1");
        } else if (sBuilder.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No match");
        }
    }
}
