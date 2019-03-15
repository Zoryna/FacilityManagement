package mmtest.domain;

public interface Management
{
    public void actualUsage(double workingMachines);

    public void problemRateFacility(double amountTests, double amountFail);

    public void requestAvailableCapacity(double workingMachines);
}
