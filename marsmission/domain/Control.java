<<<<<<< HEAD:Control.java
=======
package marsmission.domain;

>>>>>>> master:marsmission/domain/Control.java
public class Control extends StateMachine {

    public void assignToUse(Facility fac){
        setStateWorking(fac);
    }

    public void vacateFacility(Facility fac){
        setStateResting(fac);
    }

    public void scheduleMaintenance(Facility fac){
        setStateMaintenance(fac);
    }

    public void shitIsBroken(Facility fac){
        setStateBroken(fac);
    }
<<<<<<< HEAD:Control.java
}
=======
}
>>>>>>> master:marsmission/domain/Control.java
