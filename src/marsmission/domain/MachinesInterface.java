package marsmission.domain;

import java.util.Map;
import java.util.HashMap;

public interface MachinesInterface {
    public void oxygenator(boolean oxygenator);
    public void nuclearReactor(boolean nuclearReactor);
    public void innerAirlocks(boolean innerAirlocks);
    public void externalAirlocks(boolean externalAirlocks);
    public void comms(boolean comms);
    public void waterMaking(boolean waterMaking);
    public boolean[] getMachines();
    public void breakMachines();
    public void initializeMap(Map<String, Boolean> map);
    public void startMachines();
    public Map<String, Boolean> getMap();
    public void getFacilityStatus();
    public void getFacilityStatus(Map<String, Boolean> map);
    public void setControl(Control c);
    public Control getControl();
    public void setFacility(Facility fac);
    public Facility getFacility();
    public void update();
}
