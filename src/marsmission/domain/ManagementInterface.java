package marsmission.domain;

public interface ManagementInterface {

    public void actualUsage(double workingMachines);

    public void problemRateFacility(double amountTests, double amountFail);

    public void requestAvailableCapacity(double workingMachines);
}
