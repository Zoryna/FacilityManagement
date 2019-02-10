public class FacilityMachines extends Facility{

    private boolean oxygenator, innerAirlocks, externalAirlocks, solarPanels, transLine,
    comms, nuclearReactor, waterMaking;
    private final int machines = 7; // Number of machines
    // Store a Hashmap with the keys as the variables, and return it.
    // Maybe extending the StateMachine is needed

    FacilityMachines() {
        super(name, refNumber);
    }

    public void setOxygenator(boolean oxygenator){
        this.oxygenator = oxygenator;
    }

    public void setNuclearReactor(boolean nuclearReactor){
        this.nuclearReactor = nuclearReactor;
    }

    public void setInnerAirlocks(boolean innerAirlocks){
        this.innerAirlocks = innerAirlocks;
    }

    public void setExternalAirlocks(boolean externalAirlocks){
        this.externalAirlocks = externalAirlocks;
    }

    public void setSolarPanels(boolean solarPanels){
        this.solarPanels = solarPanels;
    }

    public void setComms(boolean comms){
        this.comms = comms;
    }

    public void setWaterMaking(boolean waterMaking){
        this.waterMaking = waterMaking;
    }


    public void checkMachines(){
        int[] ar = new int[machines];
        System.out.println("Oxygenator: " + oxygenator);
        System.out.println("Inner Airlocks: " + innerAirlocks);
        System.out.println("External Airlocks: " + externalAirlocks);
        System.out.println("Solar Panels: " + solarPanels);
        System.out.println("Comms: " + comms);
        System.out.println("Water Making: " + waterMaking);
    }


}
