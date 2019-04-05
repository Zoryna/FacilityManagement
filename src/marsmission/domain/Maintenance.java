package marsmission.domain;
import java.util.*;

public class Maintenance implements MaintenanceInterface {

  private MachinesInterface mach;
  private Inspection ins;
  private Control c;

  //setter
  public void setInspection(Inspection ins) { this.ins = ins; }

  public void setControl(Control c) {this.c = c;}

  public void listMaintenanceRequest(ArrayList<MachinesInterface> brokenMachines) { //shows what needs to be fixed from inspection

    System.out.println("Here are the machines that will be fixed");

    for (int i = 0; i < brokenMachines.size(); i++) {
        System.out.println(brokenMachines.get(i).getMachine());
    }
  }

  public void fixMachines(ArrayList<MachinesInterface> brokenMachines){ //changes broken machines to true

    for (int i = 0; i < brokenMachines.size(); i++) {
      brokenMachines.get(i).setStatus(true);
      System.out.println(brokenMachines.get(i) + " " + brokenMachines.get(i).status());
    }
  }

  public Facility fixFacility(){ //changes the faciity state to resting

    if ((ins.getFacility().getState().toString().equals("BROKEN")) && ins.makeMaintenanceRequest() == true)
    {
      System.out.println("The current state is " + ins.getFacility().getState() + " it will change to RESTING");
      c.assignToUse(ins.getFacility());
      System.out.println("The state is now " + ins.getFacility().getState());
      return ins.getFacility();
    }
    else
    {
      return ins.getFacility();
    }
  }
}
