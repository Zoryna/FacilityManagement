/*
  controller
  class that responds to the requests from Inspection
  Inspection-->Maintenance
*/
package marsmission.habcontrol;

import java.util.*;

public class Maintenance extends StateMachine
{

  public void listMaintenanceRequest(FacilityMachines fm, Inspection ins, int reqNum) //shows the request, which says what needs to be fixed from that inspection
  {
    System.out.println("This is facility " + fm.getName() + " and the request number: " + reqNum);
    System.out.println("Maintenance request: " + ins.makeMaintenanceRequest(fm, reqNum));

    //Shows what is broken in this maintenance request
    ins.listFacilityIssues(fm, reqNum);
  }

  public void fixMachines(FacilityMachines fm, Map<String, Boolean> m, Inspection ins, int reqNum) //changes broken machines to working (true)
  {
    m.replaceAll((key, value) -> true);
    System.out.println("Testing if all the values are true");

    for (Map.Entry<String, Boolean> i : m.entrySet()) {
      System.out.println(i.getKey() + ": " + i.getValue());
    }
  }

  public Facility fixedTheFacility (FacilityMachines fm, Control c) //changes the faciity state to resting
  {
    if ((fm.state == State.MAINTENANCE) || fm.state == State.BROKEN)
    {
      System.out.println("This state is broken, it is going to change to RESTING");
      c.vacateFacility(fm);
      System.out.println("The state is now " + fm.getState());
      return fm;
    }
    else
      return fm;
  }
}
