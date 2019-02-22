/*
  controller of all the facilities in management
  class that responds to the requests from Inspection
  Inspection-->Maintenance
*/

import java.util.ArrayList;

public class Maintenance extends StateMachine
{
  public void listMaintenanceRequest(FacilityMachines fm, Inspection ins, int reqNum) //shows the request, which says what needs to be fixed from that inspection
  {
    System.out.println("This is facility: " + fm.getName() + " and the request number: " + reqNum);
    System.out.println("Maintenance request: " + ins.makeMaintenanceRequest(fm, reqNum));
  }

  public void listMaintenance(FacilityMachines fm, Inspection ins, int reqNum) //changes broken machines to working (true)
  {
    System.out.println(fm.getName() + " Maintenance report:");
    fm.showBrokenMachines(fm.getMap()); //fix
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
