package marsmission.domain;

public class StatesFaçade {
    private StateWorking sw;
    private StateResting sr;
    private StateMaintenance sm;
    private StateBroken sb;
    private FacilityBehavior fb;

    public void setStateWorking(StateWorking sw) { this.sw = sw;}
    public void setStateResting(StateResting sr) { this.sr = sr; }
    public void setStateMaintenance(StateMaintenance sm) {this.sm = sm; }
    public void setStateBroken(StateBroken sb) { this.sb = sb; }
    public StateWorking getStateWorking() { return sw; }
    public StateResting getStateResting() { return sr; }
    public StateMaintenance getStateMaintenance() { return sm; }
    public StateBroken getStateBroken() { return sb; }
    public void setFacilityBehavior (FacilityBehavior fb) { this.fb = fb;}
    public FacilityBehavior getFacilityBehavior() { return fb; }
}
