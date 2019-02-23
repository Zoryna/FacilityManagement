public class TestFacilityMachines {
    public static void main (String[] args){
        FacilityMachines fm = new FacilityMachines();
        boolean state = true;
        boolean falseState = false;
        fm.oxygenator(falseState);
        fm.innerAirlocks(state);
        fm.externalAirlocks(falseState);
        fm.nuclearReactor(state);
        fm.comms(falseState);
        fm.waterMaking(state);
        fm.getFacilityStatus();

        System.out.println("Testing startMachines");
        fm.oxygenator(falseState);
        fm.innerAirlocks(falseState);
        fm.externalAirlocks(false);
        fm.nuclearReactor(false);
        fm.comms(false);
        fm.waterMaking(false);
        fm.getFacilityStatus();
        fm.startMachines();
        fm.getFacilityStatus();

        System.out.println(fm.getMap());
    }
}
