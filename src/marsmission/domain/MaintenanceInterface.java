package marsmission.domain;
<<<<<<< HEAD

import java.util.*;

public interface MaintenanceInterface {

    //setter
    public void setInspection(Inspection ins);

    public void setControl(Control c);

    //getter
    public Inspection getInspection();

    public Control getControl();

    public void listMaintenanceRequest(Map<String, Boolean> map);

    public void fixMachines(Map<String, Boolean> map);

    public Facility fixFacility();
=======
import java.util.*;

public interface MaintenanceInterface {
    public void listMaintenanceRequest(Map<String, Boolean> map);
    public void fixMachines(Map<String, Boolean> map);
    public Facility fixFacility();
    public void setInspection(Inspection i);
>>>>>>> origin/Hulk
}
