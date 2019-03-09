public class Finance
{

    public double calcUsage(int workingMachines, int hours) //cost of using Facility
    {
        //will get value from checkMachines in Inspection
        //checMachines returns the number of broken machines
        workingMachines = 6 - workingMachines;

        //convert to doubles to not lose precision
        double dWorkMachines = workingMachines;
        double dHours = hours;
        double ratePerHour = 3.05; //watt cost per hour

        double percentageWorking = (dWorkMachines * 100)/6; //calculates the percentage of facility working
        System.out.println(percentageWorking + "% of the Facility is working");

        ratePerHour = (percentageWorking * 0.1)/ratePerHour; //calculate the wattage for one hour of the Facilty
        double usageCost = ratePerHour * dHours;
        System.out.println("It costs " + usageCost + " to use this faciltiy for " + hours + " hour(s)");

        return usageCost;
    }

    public double calcMaintCostFacility(int amountBroken, int hours) //cost of maintenance
    {
        //convert to doubles to not lose precision
        double dAmountBroken = amountBroken;
        double dHours = hours;

        double hourlyCost = 50;
        double withHours = dHours * hourlyCost;
        System.out.println("It costs $" + withHours + " for maintenance for " + hours + " hour(s) because it is $" + hourlyCost + " per hour");

        double maintCost = dAmountBroken * withHours;
        System.out.println("It costs $" + maintCost + " because there are " + dAmountBroken + " broken machines");

        return maintCost;
    }

    /*public double calcDowntimeFacility() //how long facility has been broken
    {






        return calcDowntimeFacility;
    } */
}
