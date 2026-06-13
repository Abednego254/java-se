package gratis.CertKiller.clothing.pants;

import gratis.CertKiller.clothing.*;

import static gratis.CertKiller.clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt() {
        String color = getColor();

        if (color.equals("green")) System.out.println("Fit");
    }

    public static void main(String[] args) {

        Jeans trouser = new  Jeans();
        trouser.matchShirt();
    }

}
