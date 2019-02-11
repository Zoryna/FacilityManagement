import java.util.*;

public class FacilityMachines extends Facility {

    private boolean oxygenator, innerAirlocks, externalAirlocks,
    comms, nuclearReactor, waterMaking;
    private Map<String, Boolean> map = new HashMap<String, Boolean>();
    private final int numberOfMachines = 7;
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

    public void nuclearReactor(boolean nuclearReactor){
        this.nuclearReactor = nuclearReactor;
    }

    public void Comms(boolean comms){
        this.comms = comms;
    }

    public void WaterMaking(boolean waterMaking){
        this.waterMaking = waterMaking;
    }

    /*
        Not a great use of SRP here, I know, but we never discussed a way for
        people using the interface to be able to add services, and that being
        streamlined automatically, so here is why it is like this.
    */
    public void getFacilityStatus(){
        map.put("Oxygenator", oxygenator);
        map.put("Inner Airlocks", innerAirlocks);
        map.put("External Airlocks", externalAirlocks);
        map.put("Nuclear Reactor", nuclearReactor);
        map.put("Comms", comms);
        map.put("WaterMaking", waterMaking);

        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public void checkMachines(){
        int[] ar = new int[numberOfMachines];
        System.out.println("Oxygenator: " + oxygenator);
        System.out.println("Inner Airlocks: " + innerAirlocks);
        System.out.println("External Airlocks: " + externalAirlocks);
        System.out.println("Nuclear Reactor: " + nuclearReactor);
        System.out.println("Comms: " + comms);
        System.out.println("Water Making: " + waterMaking);
    }
}
