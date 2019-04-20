package marsmission.domain;

public class StateResting extends StateMachine {
    public void vacateFacility(Facility fac) { setStateWorking(fac); }
}
