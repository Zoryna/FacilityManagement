public class TestFacilityMachines {
    public static void main (String[] args){
        FacilityMachines fm = new FacilityMachines();

        fm.startMachines();
        fm.getMap();
        fm.getFacilityStatus();

        System.out.println("Changing some machines into false");
        fm.oxygenator(true);
        fm.innerAirlocks(true);
        fm.externalAirlocks(true);
        fm.nuclearReactor(false);
        fm.comms(false);
        fm.waterMaking(false);

        fm.getFacilityStatus();
        fm.checkMachines(fm.getTheMap());
        fm.theBrokenMachines(fm.getTheMap());

        FacilityMachines fm2 = new FacilityMachines();

        System.out.println("This is the second facility");
        fm2.startMachines();
        fm2.getMap();
        fm2.getFacilityStatus();

        System.out.println("Changing some machines into false");
        fm2.oxygenator(false);
        fm2.innerAirlocks(false);
        fm2.externalAirlocks(false);
        fm2.nuclearReactor(false);
        fm2.comms(false);
        fm2.waterMaking(true);

        fm2.getFacilityStatus();
        fm2.checkMachines(fm2.getTheMap());
        fm2.theBrokenMachines(fm2.getTheMap());


    }
}
