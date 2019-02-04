/*
  the Observer that inspects all the facilities
  what needs to be inspected
  and makes a request to what needs to be maintained
  Inspection-->Maintenance
*/



public interface Inspection
{
  public List listInspections();

  public String listFacilityIssues();

  public boolean makeMaintenanceRequest();


  public void update(); //used by Subject to update the Observer

}
