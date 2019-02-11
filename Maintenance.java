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


  public void listMaintenanceRequest(Facility facility, Inspection ins, int reqNum) //shows the request, which says that there needs to be maintenance
  {

    System.out.println("This is supposed to be the request: " + ins.makeMaintenanceRequest(facility, reqNum));
    System.out.println("This is the facility: " + facility + " and the request number: " + reqNum);

  }



  /*public void listMaintenace(Facility facility) //list of the maintenance that needs to be done
  {


  } */







}
