package marsmission.domain;

public interface StateMachineInterface {
    public void setStateWorking(Facility fac);
    public void setStateResting(Facility fac);
    public void setStateMaintenance(Facility fac);
    public void setStateBroken(Facility fac);
}
