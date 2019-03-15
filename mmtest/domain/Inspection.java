package mmtest.domain;
import java.util.*;

public interface Inspection {

    //setters
    public void setFacility(Facility fac);

    public void setMachines(Machines mach);

    //getters
    public Facility getFacility();

    public Machines getMachines();

    public boolean isBroken();

    public boolean makeMaintenanceRequest();

    public int checkMachines(Map<String, Boolean> map);

    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines);

    public void setMaintenance(MaintenanceImpl maint);

    public MaintenanceImpl getMaintenance();











}
