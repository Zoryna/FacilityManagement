package mmtest.domain;
import java.util.*;

public interface Maintenance  {

  public void listMaintenanceRequest(Map<String, Boolean> map);

  public void fixMachines(Map<String, Boolean> map);

  public Facility fixFacility();

}
