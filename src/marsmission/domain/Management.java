package marsmission.domain;

public class Management implements ManagementInterface
{
    private Finance f;

<<<<<<< HEAD
    public void setFinance(Finance f) {this.f = f;}

    public Finance getFinance() {return f;}

=======
    public void setFinance(Finance f) {
        this.f = f;
    }

    public Finance getFinance(){
        return f;
    }
>>>>>>> origin/Hulk

    public void actualUsage(double workingMachines) //actual percentage of use
    {
        workingMachines = 6 - workingMachines;

        double percentageWorking = (workingMachines * 100)/6; //calculates the percentage of facility working
        System.out.println("The facility is %" + percentageWorking + " working");
<<<<<<< HEAD
        System.out.println(workingMachines + " machines are actually working");
=======
        System.out.println(workingMachines + " machines are actually being used");
>>>>>>> origin/Hulk
    }

    public void problemRateFacility(double amountTests, double amountFail) //percentage of the tests that failed
    {
        double rate = (amountFail * 100)/amountTests;

        System.out.println("There are " + amountTests + " tests and " + amountFail + " tests failed");
        System.out.println("The problem rate is %" + rate);
    }

    public void requestAvailableCapacity(double workingMachines) //the remaining percentage of the facility
    {
        double percentageWorking = (workingMachines * 100)/6; //calculates the percentage of facility working
<<<<<<< HEAD
        System.out.println(percentageWorking + "% of the Facility is in use");
=======
        System.out.println(percentageWorking + "% of the Facility is working");
>>>>>>> origin/Hulk

        double availableCapacity = 100 - percentageWorking;
        System.out.println(availableCapacity + "% of the Facility is available to request use");
    }
}
