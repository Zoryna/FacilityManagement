package marsmission.domain;
import java.util.*;

public interface MaintenanceInterface {
    public void setStatesFaçade(StatesFaçade sf);
    public void listMaintenanceRequest(Map<String, Boolean> map);
    public void fixMachines(Map<String, Boolean> map);
    public Facility fixFacility();
    public void setInspection(Inspection i);
    public Inspection getInspection();
}
