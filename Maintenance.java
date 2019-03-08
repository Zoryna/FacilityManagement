import java.util.*;

public class Maintenance  {

  private Facility fac;
  private Machines mach;
  private Inspection ins;

  //setter
  public void setInspection(Inspection ins) { this.ins = ins; }

  //getter
  public Inspection getInspection() {return ins;}

  public void listMaintenanceRequest(){ //shows the request, which says what needs to be fixed from that inspection

    //Shows what is broken in this maintenance request
    ins.returnBrokenMachines(mach.getMap(), mach.getMachines());
  }

  /*public void fixMachines(Map<String, Boolean> map){ //changes broken machines to true

    map.replaceAll((key, value) -> true);
    System.out.println("Machines are now fixed");

    /*for (Map.Entry<String, Boolean> i : map.entrySet()) {
      System.out.println(i.getKey() + ": " + i.getValue());


    } */

  public Facility fixFacility(Control c){ //changes the faciity state to resting

    if (fac.getState().toString().equals("BROKEN"))
    {
      System.out.println("This state is broken, it is going to change to RESTING");
      c.vacateFacility(fac);
      System.out.println("The state is now " + fac.getState());
      return fac;
    }
    else
    {
      return fac;
    }
  }


}

