package marsmission.domain;

import java.util.*;

public class Maintenance extends StateMachine {

    public void listMaintenanceRequest(Facility fac, Inspection ins, boolean[] machines){ //shows the request, which says what needs to be fixed from that inspection

        System.out.println("This is facility " + fac.getName());
        ins.makeMaintenanceRequest(fac);

        // Shows what is broken in this maintenance request
        ins.listFacilityIssues(fac, machines);
    }

    // This doesn't need a Facility nor an Inspection
    public void fixMachines(Facility fac, Map<String, Boolean> map, Inspection ins){ // changes broken machines to working (true)

        map.replaceAll((key, value) -> true);
        System.out.println("Testing if all the values are true");

        for (Map.Entry<String, Boolean> i : map.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public Facility fixFacility(Facility fac, Control c){ // changes the faciity state to resting

        if ( (fac.state == State.MAINTENANCE) || (fac.state == State.BROKEN) ){
            System.out.println("This state is broken, it is going to change to RESTING");
            c.vacateFacility(fac);
            System.out.println("The state is now " + fac.getState());
            return fac;
        } else {
            return fac;
        }
    }
}
