package marsmission.domain;

import java.util.*;

public interface MaintenanceInterface {
    public void listMaintenanceRequest(ArrayList<MachinesInterface> brokenMachines);
    public void fixMachines(ArrayList<MachinesInterface> brokenMachines);
    public Facility fixFacility();
    public void setInspection(Inspection i);
    public void setControl(Control c);
}
