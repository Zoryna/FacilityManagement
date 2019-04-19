package marsmission.domain;

public class StateWorking extends StateMachine {
    public void assignToUse(Facility fac) { setStateWorking(fac); }
}
