package marsmission.domain;

public interface ControlInterface {

    public void assignToUse(Facility fac);

    public void vacateFacility(Facility fac);

    public void scheduleMaintenance(Facility fac);

    public void shitIsBroken(Facility fac);
}