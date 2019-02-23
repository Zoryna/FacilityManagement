/*
    class that determines if a facility is available and assigns them
    also schedules if facility needs maintenance
*/

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
}
