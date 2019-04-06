package marsmission.domain;

public interface FinanceInterface {
        public void setRatePerHour (double ratePerHour);
        public void setMaintHourlyCost (double maintHourlyCost);
        public double getRatePerHour ();
        public double getMaintHourlyCost ();
        public void calcUsage(double workingMachines, double hours);
        public void calcMaintCostFacility(double amountBroken, double hours);
        public void calcDowntimeFacility(double amountBroken);
}
