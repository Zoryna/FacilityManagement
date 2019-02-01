public class StateMachine {

    private State state;

    // States
    private final State WORKING = new WorkingState();
    private final State RESTING = new RestingState();
    private final State BROKEN = new BrokenState();

    // Transitions
    public void toWorkingState() { setState(WORKING); }
    public void toRestingState() { setState(RESTING); }
    public void toBrokenState() { setState(BROKEN); }

    StateMachine(State state) {
        this.state = state;
    }

    protected void setState(final State state) {
        this.state = state;
    }

}
