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

  private Facility facility;
  private Inspection insp;

  public void listMaintenanceRequest(Facility facility, Inspection insp) //list of maintenance requests
  {
    this.facility = facility;
    this.insp = insp;
    ArrayList<Maintenance> maintRequests = new ArrayList<Maintenance>(); //list of Maintenance objects, list that stores the Maintenance objects that are requests





  }



  /*public ArrayList listMaintenace(Facility facility) //list of the maintenance that needs to be done
  {


  } */







}
