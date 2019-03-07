/*
    class that determines if a facility is available and assigns them
*/

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

}