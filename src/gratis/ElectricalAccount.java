package gratis;

public class ElectricalAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double kWh) {
        if (kWh > 0.0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
        }
    }

    // line n1
}
