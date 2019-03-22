package marsmission.domain;
public class Finance implements FinanceInterface
{
    private double ratePerHour; //3.05 is watt cost per hour
    private double maintHourlyCost; //randomly chosen cost, may change later

    Finance () {}

    //setters
    public void setRatePerHour (double ratePerHour) {this.ratePerHour = ratePerHour;}

    public void setMaintHourlyCost (double maintHourlyCost) {this.maintHourlyCost = maintHourlyCost;}

    //getters
    public double getRatePerHour () {return ratePerHour;}

    public double getMaintHourlyCost () {return maintHourlyCost;}


    public void calcUsage(double workingMachines, double hours) //cost of using Facility
    {
        //will get value from checkMachines in Inspection
        //checMachines returns the number of broken machines
        workingMachines = 6 - workingMachines;

        double percentageWorking = (workingMachines * 100)/6; //calculates the percentage of facility working
        System.out.println(percentageWorking + "% of the Facility is working");

        ratePerHour = (percentageWorking * 0.1)/ratePerHour; //calculate the wattage for one hour of the Facilty
        double usageCost = ratePerHour * hours;
        System.out.println("It costs $" + usageCost + " to use this faciltiy for " + hours + " hour(s)");
    }

    public void calcMaintCostFacility(double amountBroken, double hours) //cost of maintenance
    {

        double withHours = hours * maintHourlyCost;
        System.out.println("It costs $" + withHours + " for maintenance for " + hours + " hour(s) because it is $" + maintHourlyCost + " per hour");

        double maintCost = amountBroken * withHours;
        System.out.println("It costs $" + maintCost + " because there are " + amountBroken + " broken machines");
    }

    public void calcDowntimeFacility(double amountBroken) //calculates how long facility has been broken
    {
        //if breaks, would stay broken at least 2 hours
        double maxHours = 24;
        double timeBroken = 2 * amountBroken;
        double totalTimeBroken = 24 - timeBroken;

        System.out.println("This facility has been broken for " + totalTimeBroken + " hours");
    }
}
