package marsmission.habcontrol;

public class FacilityBehavior extends StateMachine implements FacilityAI {

    // Inspection i = new Inspection();
    private final int START = 8;
    private final int REST = 18;
    private static Facility fac;

    public void setFacilityBehavior(Facility fac){
        this.fac = fac;
    }

    public void AI(TimeController tc, Control c){
        tc.setHours(START);
        if (tc.getHours() >= START && tc.getHours() < REST && fac.getState() != State.BROKEN){
            c.assignToUse(fac);
        }
        else if (tc.getHours() >= REST){
            c.vacateFacility(fac);
        }
    }

    public Facility getFacility(){
        return fac;
    }
}
