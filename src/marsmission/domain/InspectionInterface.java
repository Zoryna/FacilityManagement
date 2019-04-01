package marsmission.domain;
import java.util.*;

public interface InspectionInterface {

    //setters
    public void setFacility(Facility fac);

    public void setMachines(Machines mach);

    public void setMaintenance(Maintenance maint);

    //getters
    public Facility getFacility();

    public Machines getMachines();

    public Maintenance getMaintenance();

    public boolean isBroken();

    public boolean makeMaintenanceRequest();

    public int checkMachines(Map<String, Boolean> map);

    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines);
}