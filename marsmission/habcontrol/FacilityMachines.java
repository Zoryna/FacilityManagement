package marsmission.habcontrol;
import java.util.Map;
import java.util.HashMap;

public class FacilityMachines extends Facility {

    private boolean oxygenator, innerAirlocks, externalAirlocks,
    comms, nuclearReactor, waterMaking;
    private static Map<String, Boolean> map = new HashMap<String, Boolean>();
    private final int numberOfMachines = 7;

    public FacilityMachines() {
        super(name, refNumber);
    }

    public void oxygenator(boolean oxygenator){
        this.oxygenator = oxygenator;
    }

    public void nuclearReactor(boolean nuclearReactor){
        this.nuclearReactor = nuclearReactor;
    }

    public void innerAirlocks(boolean innerAirlocks){
        this.innerAirlocks = innerAirlocks;
    }

    public void externalAirlocks(boolean externalAirlocks){
        this.externalAirlocks = externalAirlocks;
    }

    public void comms(boolean comms){
        this.comms = comms;
    }

    public void waterMaking(boolean waterMaking){
        this.waterMaking = waterMaking;
    }

    public void startMachines(){
        // Set machines to work
        oxygenator(true);
        nuclearReactor(true);
        innerAirlocks(true);
        externalAirlocks(true);
        comms(true);
        waterMaking(true);

        map.put("Oxygenator", oxygenator);
        map.put("Inner Airlocks", innerAirlocks);
        map.put("External Airlocks", externalAirlocks);
        map.put("Nuclear Reactor", nuclearReactor);
        map.put("Comms", comms);
        map.put("WaterMaking", waterMaking);
    }

    /*
        Not a great use of SRP here, I know, but the team never discussed the
        necessity for people using it to be able to add services, and that being
        streamlined automatically, so here is why it is like this.
    */

    public void getFacilityStatus(){
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public Map<String, Boolean> getMap(){
        return map;
    }
}
