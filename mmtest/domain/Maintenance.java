package mmtest.domain;
import java.util.*;

public interface Maintenance  {

  //setters
  public void setInspection(Inspection ins);

  public void setControl(Control c);

  //getter
  public Inspection getInspection();

  public Control getControl();


  public void listMaintenanceRequest(Map<String, Boolean> map);

  public void fixMachines(Map<String, Boolean> map);

  public Facility fixFacility();

}
