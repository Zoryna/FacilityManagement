package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map);
    public void setMaintenance(Maintenance maint);
    public Maintenance getMaintenance();
}
