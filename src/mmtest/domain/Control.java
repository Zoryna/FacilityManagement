package mmtest.domain;

public interface Control extends StateMachine {

    public void assignToUse(Facility fac);

    public void vacateFacility(Facility fac);

    public void scheduleMaintenance(Facility fac);

    public void shitIsBroken(Facility fac);
}
