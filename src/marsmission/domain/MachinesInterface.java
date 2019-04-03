package marsmission.domain;

import java.util.Map;
import java.util.HashMap;

public interface MachinesInterface {
    public Facility getFacility(); // Returns the Facility to which this machine was assigned to
    public void setFacility(Facility fac); // Sets a Facility to a Machine
    public void machine(); // This is what the specific implementation of a machine should do (aka oxygenator, etc)
    public boolean status(); // Is the machine working?
}
