package gratis;

public class Customer {
    ElectricalAccount account = new ElectricalAccount();

    public void useElectricity(double kWh) {
        account.addKWh(kWh);
    }
}
