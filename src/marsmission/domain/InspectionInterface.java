package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public void setMaintenance(Maintenance m);
    public Maintenance getMaintenance();
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public Map<String, Boolean> returnBorkenMachines(Map<String, Boolean> map);
}