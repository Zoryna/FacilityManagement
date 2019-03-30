package marsmission.domain;
import java.util.*;

public interface InspectionInterface {

    //setters
    public void setFacility(Facility fac);

    public void setMachines(Machines mach);

    public void setMaintenance(Maintenance maint);

    public void setControl (Control c);

    //getters
    public Facility getFacility();

    public Machines getMachines();

    public Maintenance getMaintenance();

    public Control getControl();

    public boolean isBroken();

    public boolean makeMaintenanceRequest();

    public int checkMachines(Map<String, Boolean> map);

    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines);

    public void update(Facility fac);
}