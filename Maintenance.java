/*
  controller of all the facilities in management
  class that responds to the requests from Inspection
  Inspection-->Maintenance
*/

import java.util.ArrayList;

public class Maintenance extends StateMachine
{
  //list Request
  //List Maintenace


  public void listMaintenanceRequest(FacilityMachines fm, Inspection ins, int reqNum) //shows the request, which says that there needs to be maintenance
  {
    //connect with the maintenance request (that says it needs maintenance) and connect it woth facilility machines,
    //which assigns what parts are working
    //shows all the maintenance requests
    //ex: Maintenance request 1 (and when it was sent?)
    // Maintenance request 2 (and when it was sent?)

    System.out.println("This is supposed to be the request: " + ins.makeMaintenanceRequest(fm, reqNum));
    System.out.println("This is the facility: " + fm + " and the request number: " + reqNum);

  }

  /*public void listMaintenace(FacilityMachines fm) //list of the maintenance that needs to be done
  {
    //list the maintenance requests from each facility
    //list whats broken in each facility

    //connect with facility machines
    //ex: Airlocks 1
    //From Maintenance Request 1
    //Oxygenator: need maintenance
    //Innter Airlocks: need maintenance
    //External airlocks: need maintenance



  } */

  public Facility fixedTheFacility (FacilityMachines fm, Control c) //changes the faciity state from broken (maintenance) to resting
  {
    if (fm.state == State.MAINTENANCE)
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
