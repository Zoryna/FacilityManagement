/*
    a Concrete Subject for the Observer pattern
 */

import java.util.*;

public class TestFacility2 implements Inspection
{
        Facility fac = new Facility("Airlocks #0", 1);
        fac.setName("Airlocks #2");
        fac.setAddress("Acidalia Planitia");
        fac.setDescription("The airlocks function is to control air pressure from locations");
        fac.setRefNumber(0001);
        fac.setCapacity(0);
        fac.setCost(100);
        fac.setProblemRate(5);

        //testing
        public List listInspections()
        {
            List<String> theInspections = new List<String>(Arrays.asList{
                "1. WORKING",
                "2. MAINTENANCE"
            });

            return theInspections;
        }

         public String listFacilityIssues()
         {
            String issues;
            issues="Facility is not maintaning the air"

            return issues;
         }

        public boolean makeMaintenanceRequest()
        {
            boolean needMaintenance;
            needMaintenance=true;

            return true;
        }


        //testing states

}
