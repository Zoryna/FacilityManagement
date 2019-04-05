package marsmission.domain;

public interface FinanceInterface {
        public void setRate(double rate); // Rate is set hourly
        public void setCost (double cost); // Hourly cost of maintenance
        public double getRate();
        public double getCost ();
        public void usage();
        public void maintenanceCost(); // The cost of maintenance
        public void downtime();
        public void facilityCost(); // The total value of running a facility, plus maintenance
}
