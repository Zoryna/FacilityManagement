package marsmission.domain;
import java.util.*;

public interface InspectionInterface {
    public void setFacility(Facility fac);
    public Facility getFacility();
    public void setMachines(MachinesInterface m);
    public MachinesInterface getMachines();
    public boolean isBroken();
    public boolean makeMaintenanceRequest();
    public int checkMachines(ArrayList<MachinesInterface> machinesList);
    public ArrayList returnBrokenMachines(ArrayList<MachinesInterface> machinesList);
    public void setMaintenance(Maintenance maint);
}
