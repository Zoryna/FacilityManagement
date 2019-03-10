package mmtest.domain;

public class TestFacilityBehavior {
    public static void main(String[] args){
        Facility fac = new Facility();
        FacilityBehavior fb = new FacilityBehavior();
        TimeController tc = new TimeController();
        Control c = new Control();

        fb.setFacilityBehavior(fac);
        fb.AI(tc, c);

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
