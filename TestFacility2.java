/*
    a Concrete Subject for the Observer pattern
    facility that is broken
 */

import java.util.*;
import java.util.ArrayList;

public class TestFacility2 implements Inspection
{
        public void setDetails()
        {
            Facility fac = new Facility("Airlocks #0", 1);
            fac.setName("Airlocks #2");
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
            theInspections.add("BROKEN");

            return theInspections;
        }

         public String listFacilityIssues()
         {
            String issues;
            issues="Facility is not maintaning the air";

            return issues;
         }

        /*public boolean makeMaintenanceRequest()
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
        }*/




}
