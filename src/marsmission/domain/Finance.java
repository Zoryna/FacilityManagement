package marsmission.domain;

public class Finance implements FinanceInterface, Observer {

    private double rate; // 3.05 is watt cost per hour in average in the US
    private double cost; // arbitrarily set

    public void update(Observable o, Object arg){}
    public void setRate(double rate) { this.rate = rate; }
    public void setCost (double cost) { this.cost = cost; }
    public double getRate() { return rate; }
    public double getCost () { return cost; }
    public void usage() {}
    public void maintenanceCost() {}
    public void downtime() {}
    public void facilityCost() {}
    public void update(Object arg) {}
}
