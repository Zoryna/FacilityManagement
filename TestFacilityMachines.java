public class TestFacilityMachines {
    public static void main (String[] args){
        FacilityMachines fm = new FacilityMachines();
        boolean state = true;
        boolean falseState = false;
        fm.setOxygenator(falseState);
        fm.setInnerAirlocks(state);
        fm.setExternalAirlocks(falseState);
        fm.setSolarPanels(state);
        fm.setComms(falseState);
        fm.setWaterMaking(state);
        fm.checkMachines();
    }
}
