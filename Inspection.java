/*
  the Observer that inspects all the facilities
  what needs to be inspected
  and makes a request to what needs to be maintained
  Inspection-->Maintenance
*/

import java.util.*;
import java.util.ArrayList;


public interface Inspection
{
  public void setDetails();

  public ArrayList listInspections();

  public String listFacilityIssues();

  //public boolean makeMaintenanceRequest();


  //public void update(); //used by Subject to update the Observer

}
