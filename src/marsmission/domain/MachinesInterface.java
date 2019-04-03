package marsmission.domain;

import java.util.Map;
import java.util.HashMap;

public interface MachinesInterface {
<<<<<<< HEAD

    public void oxygenator(boolean oxygenator);

    public void nuclearReactor(boolean nuclearReactor);

    public void innerAirlocks(boolean innerAirlocks);

    public void externalAirlocks(boolean externalAirlocks);

    public void comms(boolean comms);

    public void waterMaking(boolean waterMaking);

    public boolean[] getMachines();

    // Set machines to false
    public void breakMachines();

    public void initializeMap(Map<String, Boolean> map);

    public void startMachines();

    public void update();

    public Map<String, Boolean> getMap();

    public void getFacilityStatus();

    public void getFacilityStatus(Map<String, Boolean> map);

    public void setControl(Control c);

    public Control getControl();

    public void setFacility(Facility fac);

    public Facility getFacility();

=======
    public Facility getFacility(); // Returns the Facility to which this machine was assigned to
    public void setFacility(Facility fac); // Sets a Facility to a Machine
    public void machine(); // This is what the specific implementation of a machine should do (aka oxygenator, etc)
    public boolean status(); // Is the machine working?
>>>>>>> origin/Hulk
}
