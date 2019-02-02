public class StateMachine {

    public State state = State.RESTING;

    enum State {
        WORKING, RESTING, MAINTENANCE
    }

    public State getFacilityState(){
        return state;
    }

    public State toWorking(Facility fac) {
        fac.state = State.WORKING;
        return fac.getFacilityState();
    }

    public State toResting(Facility fac) {
        fac.state = State.RESTING;
        return fac.getFacilityState();
    }

    public State toMaintenance(Facility fac) {
        fac.state = State.MAINTENANCE;
        return fac.getFacilityState();
    }
}
