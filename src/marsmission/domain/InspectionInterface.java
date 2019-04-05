package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public Map<String, Boolean> returnBorkenMachines(Map<String, Boolean> map); // Typo intentional
    public void setMaintenance(Maintenance maint);
    public Maintenance getMaintenance();
    public void update();
}
