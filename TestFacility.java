/*
    a Concrete Subject for the Observer pattern
    facility that is working
 */

import java.util.*;
import java.util.ArrayList;

public class TestFacility implements Inspection
{

        public void setDetails()
        {
            Facility fac = new Facility("Airlocks #0", 0);
            fac.setName("Airlocks #1");
            fac.setAddress("Acidalia Planitia");
            fac.setDescription("The airlocks function is to control air pressure from locations");
            fac.setRefNumber(0001);
            fac.setCapacity(0);
            fac.setCost(100);
            fac.setProblemRate(5);
        }


        //testing
        public ArrayList listInspections()
        {
            ArrayList<String> theInspections = new ArrayList<String>();
            theInspections.add("WORKING");
            theInspections.add("WORKING");

            return theInspections;
        }

        public String listFacilityIssues()
        {
            String issues;
            issues="No issues";

            return issues;
        }

        /*public boolean makeMaintenanceRequest(List theInspections)
        {
            boolean makeRequest;
            this.theInspections = theInspections;

            //testing states
            if (theInspections.contains("BROKEN"))
            {
                fac.setState(MAINTENANCE);
                System.out.println("State set to BROKEN");
                return true;
            }

            else if (theInspections.contains("WORKING"))
            {
                fac.setState(WORKING);
                System.out.println("State set to WORKING");
                return false;
            }


        } */






        /*System.out.println("getName: " + fac.getName());
        System.out.println("getAddress: " + fac.getAddress());
        System.out.println("getDescription: " + fac.getDescription());
        System.out.println("getRefNumber: " + fac.getRefNumber());
        System.out.println("getCapacity: " + fac.getCapacity());
        System.out.println("getCost: " + fac.getCost());
        System.out.println("getProblemRate: " + fac.getProblemRate());
        System.out.println("Object: " + fac.getFacilityObj());
        */
}
