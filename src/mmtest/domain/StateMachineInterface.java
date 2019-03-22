package mmtest.domain;

public interface StateMachineInterface {

    public enum State{}

    public void setStateWorking(Facility fac);

    public void setStateResting(Facility fac);

    public void setStateMaintenance(Facility fac);

    public void setStateBroken(Facility fac);
}
