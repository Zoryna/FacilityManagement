public class StateMachine {

    public State state = State.RESTING;

    enum State {
        WORKING, RESTING, MAINTENANCE,
    }

    public State getFacilityState(){
        return state;
    }

    public void setStateWorking(Facility fac){
        fac.state = State.WORKING;
    }

    public void setStateResting(Facility fac){
        fac.state = State.RESTING;
    }

    public void setStateMaintenance(Facility fac){
        fac.state = State.MAINTENANCE;
    }

    public State getState(){
        return state;
    }
}
