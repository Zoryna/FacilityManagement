public class TestFacilityBehavior {
    public static void main(String[] args){
        Facility fac = new Facility("Airlock #0", 0);
        FacilityBehavior fb = new FacilityBehavior();
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
        System.out.println(fb.isItBroken(fac));
    }
}
