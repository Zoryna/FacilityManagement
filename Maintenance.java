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
  //private int requestNumber ;


  Maintenance(Facility facility)
  {
    this.facility = facility;
    //this.requestNumber = requestNumber;
  }


    //setters
    public void setFacility(Facility facility){ this.facility = facility; }

    //public void setRequestNumber(int requestNumber){ this.requestNumber = requestNumber; }

    //getters
    public Facility getFacility(){ return facility; }

    //public int getRequestNumber(){ return requestNumber; }



  /*public Maintenance listMaintenanceRequest(Facility facility) //list of maintenance requests
  {


  }*/

  /*public ArrayList listMaintenace(Facility facility)
  {


  } */







}
