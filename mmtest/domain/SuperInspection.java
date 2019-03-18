package mmtest.domain;
import java.util.*;

public interface SuperInspection {

    public void setControl(ControlImpl c);

    public void ControlImpl getControl();

    public void setInspection(InspectionImpl ins);

    public void InspectionImpl getInspection ();

    public void setMaintenance(MaintenanceImpl maint);

    public MaintenanceImpl getMaintenance();
}