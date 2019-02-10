public class FacilityMachines extends Facility{

    private boolean oxygenator, innerAirlocks, externalAirlocks, solarPanels, transLine,
    comms, nuclearReactor, waterMaking;
    private final int machines = 7; // Number of machines
    // Store a Hashmap with the keys as the variables, and return it.
    // Maybe extending the StateMachine is needed

    FacilityMachines() {
        super(name, refNumber);
    }

    public void Oxygenator(boolean oxygenator){
        this.oxygenator = oxygenator;
    }

    public void NuclearReactor(boolean nuclearReactor){
        this.nuclearReactor = nuclearReactor;
    }

    public void InnerAirlocks(boolean innerAirlocks){
        this.innerAirlocks = innerAirlocks;
    }

    public void ExternalAirlocks(boolean externalAirlocks){
        this.externalAirlocks = externalAirlocks;
    }

    public void SolarPanels(boolean solarPanels){
        this.solarPanels = solarPanels;
    }

    public void Comms(boolean comms){
        this.comms = comms;
    }

    public void WaterMaking(boolean waterMaking){
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
