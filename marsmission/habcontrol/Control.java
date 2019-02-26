<<<<<<< HEAD:Control.java
/*
    class that determines if a facility is available and assigns them
*/
=======
package marsmission.habcontrol;
>>>>>>> master:marsmission/habcontrol/Control.java

public class Control extends StateMachine {

    public void assignToUse(Facility fac) {
        setStateWorking(fac);
    }

    public void vacateFacility(Facility fac) {
        setStateResting(fac);
    }

    public void scheduleMaintenance(Facility fac) {
        setStateMaintenance(fac);
    }

<<<<<<< HEAD:Control.java
}
=======
    public void shitIsBroken(Facility fac){
        setStateBroken(fac);
    }
}
>>>>>>> master:marsmission/habcontrol/Control.java
