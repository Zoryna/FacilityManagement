package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public void checkMachines();
    public void returnBrokenMachines();
    public void setMaintenance(Maintenance maint);
    public Maintenance getMaintenance();
}
