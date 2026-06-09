package gratis;

public class Test78 {
    public static void main(String[] args) {
        int wd = 0;

        String[] days = { "Sun", "Mon", "Wed", "Sat" };
        for (String day : days) {

            switch (day) {
                case "Sat":
                case "Sun":
                    wd--;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);
    }
}
