package marsmission.domain;
import java.util.*;

public class Maintenance implements MaintenanceInterface {

  private Inspection ins;
  private StatesFaçade sf;

  //setter
  public void setInspection(Inspection ins) { this.ins = ins; }

  public void setStatesFaçade(StatesFaçade sf) {this.sf = sf;}

  //getter
  public Inspection getInspection() {return ins;}

  public StatesFaçade getStatesFaçade() { return sf; }

  public void listMaintenanceRequest(Map<String, Boolean> map){ //shows what needs to be fixed from inspection

    System.out.println("Here are the machines that will be fixed");
    for (Map.Entry<String, Boolean> i : map.entrySet()) {
      System.out.println(i.getKey());
    }
  }

  public void fixMachines(Map<String, Boolean> map){ //changes broken machines to true

    //updates the map
    map.replaceAll((key, value) -> true);

    for (Map.Entry<String, Boolean> i: map.entrySet()){
      System.out.println(i.getKey() + ": " + i.getValue());
    }
    System.out.println("The machines are now all working");
  }

  public Facility fixFacility(){ //changes the faciity state to resting

    if ((ins.getFacility().getState().toString().equals("BROKEN")) && ins.makeMaintenanceRequest() == true)
    {
      System.out.println("The current state is " + ins.getFacility().getState() + " it will change to WORKING");
      sf.getStateWorking().assignToUse(ins.getFacility());
      System.out.println("The state is now " + ins.getFacility().getState());
      return ins.getFacility();
    }
    else
    {
      return ins.getFacility();
    }
  }
}