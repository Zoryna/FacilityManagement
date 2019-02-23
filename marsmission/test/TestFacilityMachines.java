import marsmission.habcontrol.FacilityMachines;

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

        fm.getFacilityStatus(fm.getTheMap());
        fm.checkMachines(fm.getTheMap());
        fm.theBrokenMachines(fm.getTheMap());
    }
}
