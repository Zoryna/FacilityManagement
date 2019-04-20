package marsmission.domain;

public class FacilityBehavior extends StateMachine implements FacilityAI {

    private TimeController tc;
    private StatesFaçade sf;
    private int START = tc.getHours();
    private int REST = tc.getHours();
    private Facility fac;

    public void setStatesFaçade(StatesFaçade sf) { this.sf = sf; }
    public StatesFaçade getStatesFaçade() { return sf; }

    public void setFacilityBehavior(Facility fac){
        this.fac = fac;
        AI(tc, sf);
    }

    public void AI(TimeController tc, StatesFaçade sf){
        tc.setHours(START);
        if (tc.getHours() >= START && tc.getHours() < REST && fac.getState() != State.BROKEN){
            sf.getStateWorking().assignToUse(fac);
        }
        else if (tc.getHours() >= REST){
            sf.getStateResting().vacateFacility(fac);
        }
    }

    // To comply with the interface, later it should go out, it has no business here
    public Facility getFacility(){
        return fac;
    }
}