package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public void setMachines(MachinesInterface m);
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public int checkMachines(Map<String, Boolean> map);
    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines);
    public void setMaintenance(Maintenance maint);
    public Maintenance getMaintenance();
}
