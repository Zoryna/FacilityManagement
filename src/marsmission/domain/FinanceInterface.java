package marsmission.domain;

public interface FinanceInterface {
<<<<<<< HEAD
    //setters
    public void setRatePerHour (double ratePerHour);

    public void setMaintHourlyCost (double maintHourlyCost);

    //getters
    public double getRatePerHour ();

    public double getMaintHourlyCost ();


    public void calcUsage(double workingMachines, double hours);

    public void calcMaintCostFacility(double amountBroken, double hours);

    public void calcDowntimeFacility(double amountBroken);
=======
        public void setRatePerHour (double ratePerHour);
        public void setMaintHourlyCost (double maintHourlyCost);
        public double getRatePerHour ();
        public double getMaintHourlyCost ();
        public void calcUsage(double workingMachines, double hours);
        public void calcMaintCostFacility(double amountBroken, double hours);
        public void calcDowntimeFacility(double amountBroken);
>>>>>>> origin/Hulk
}
