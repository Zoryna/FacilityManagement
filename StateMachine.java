public class StateMachine {

    private State state;

    enum State {
        WORKING, RESTING, MAINTENANCE
    }

    StateMachine(){
        this.state = State.RESTING;
    }

    public State getState() {
        return state;
    }

    public State toWorking() {
        this.state = State.WORKING;
        return state;
    }

    public State toResting() {
        this.state = State.RESTING;
        return state;
    }

    public State toMaintenance() {
        this.state = State.MAINTENANCE;
        return state;
    }
}
