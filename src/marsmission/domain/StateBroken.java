package marsmission.domain;

public class StateBroken extends StateMachine {
    public void shitIsBroken(Facility fac){
        setStateBroken(fac);
    }
}
