package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public Facility getFacility();
    public void setMachines(MachinesInterface m);
    public MachinesInterface getMachines();
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public int checkMachines(ArrayList<Object> machinesList);
    public Map<String, Boolean> returnBrokenMachines(ArrayList<Object> machinesList);
    public void setMaintenance(Maintenance maint);
}
