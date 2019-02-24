package marsmission.test;
import marsmission.habcontrol.Facility;
import marsmission.habcontrol.FacilityBehavior;
import marsmission.habcontrol.TimeController;

public class TestFacilityBehavior {
    public static void main(String[] args){
        Facility fac = new Facility();
        FacilityBehavior fb = new FacilityBehavior();
        TimeController tc = new TimeController();

        fb.setFacilityBehavior(fac);
        fb.AI();

        if (fb.getFacility() == fac){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println(fac.getState());
        fac.setStateBroken(fac);
        System.out.println(fac.getState());
    }
}
