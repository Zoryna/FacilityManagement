public class TestFacilityMachines {
    public static void main (String[] args){
        FacilityMachines fm = new FacilityMachines();
        boolean state = true;
        boolean falseState = false;
        fm.Oxygenator(falseState);
        fm.InnerAirlocks(state);
        fm.ExternalAirlocks(falseState);
        fm.SolarPanels(state);
        fm.Comms(falseState);
        fm.WaterMaking(state);
        fm.checkMachines();
    }
}
