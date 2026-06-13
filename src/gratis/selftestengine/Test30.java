package gratis.selftestengine;

import java.util.Objects;

public class Test30 {
    public static void main(String[] args) {

        String [] strs = new String[2];

        int idx = 0;
        for (String str : strs) {
            strs[idx] = (" element "+ idx).concat(" ME");
            System.out.println(Objects.equals(strs[idx], str));
            strs[idx] = strs[idx].concat(" Me");
            idx++;
        }

        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
