package mmtest.domain;
import java.util.*;

public class Control implements ControlInterface {

    Control () {}

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