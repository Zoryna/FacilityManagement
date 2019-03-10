package marsmission.domain;

public class FacilityBehavior extends StateMachine implements FacilityAI {

    private TimeController tc;
    private Control c;
    private int START = tc.getHours();
    private int REST = tc.getHours();
    public Facility fac;

    public void setFacilityBehavior(Facility fac){
        this.fac = fac;
        AI(tc, c);
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

    // To comply with the interface, later it should go out, it has no business here
    public Facility getFacility(){
        return fac;
    }
}
