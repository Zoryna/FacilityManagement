package marsmission.domain;

import java.util.*;

public class Facility extends StateMachine implements Observable {

    private Oxygenator o;
    private FacilityInformation fi;
    private InnerAirlocks i;
    private ExternalAirlocks e;
    private NuclearReactor n;
    private Comms c;
    private WaterExtraction w;
    private double cost;
    private Observer observer;
    private boolean changed;
    private Map<String, Boolean> map = new HashMap<String, Boolean>();

    // Observable Interface
    public void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException();
        } else if (observer == null) {
            observer = o;
        }
    }
    public boolean hasChanged() { return changed; }
    public void deleteObserver(Observer o) { observer = null; }
    public boolean checkObserver() {
        if (observer == null) {
            return false;
        } else {
            return true;
        }
    }
    public void notify(Observer o) {
        if (changed) {
            o.update(this);
            setChanged();
        }
    }

    // Map Helpers
    public void startUpdateMap(){
        map.put("Oxygenator", o.status());
        map.put("Nuclear Reactor", n.status());
        map.put("Inner Airlocks", i.status());
        map.put("External Airlocks", e.status());
        map.put("Comms", c.status());
        map.put("Water Extraction", w.status());
    }

    public void startMachines(){
        o.setStatus(true);
        n.setStatus(true);
        i.setStatus(true);
        e.setStatus(true);
        c.setStatus(true);
        w.setStatus(true);

        map.clear();
        startUpdateMap();
    }

    public Map<String, Boolean> getMap(){
        return map;
    }

    public void getFacilityStatus(){ // The status of the map in this object
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    // Setters & Injections
    public void setChanged() { changed = !changed; }

    public void setOxygenator(Oxygenator o) { this.o = o; }

    public void setInnerAirlocks(InnerAirlocks i) { this.i = i; }

    public void setExternalAirlocks(ExternalAirlocks e) { this.e = e; }

    public void setNuclearReactor(NuclearReactor n) { this.n = n; }

    public void setComms(Comms c) { this.c = c; }

    public void setWaterExtraction(WaterExtraction w) { this.w = w; }

    public void setFacilityInformation(FacilityInformation fi) { this.fi = fi; }

    // Getters
    public State getState() { return state; }

    // Injections
    public Oxygenator getOxygenator() { return o; }

    public InnerAirlocks getInnerAirlocks() { return i; }

    public ExternalAirlocks getExternalAirlocks() { return e; }

    public NuclearReactor getNuclearReactor() { return n; }

    public Comms getComms() { return c; }

    public WaterExtraction getWaterExtraction() { return w; }

    public FacilityInformation getFacilityInformation() { return fi; }
}