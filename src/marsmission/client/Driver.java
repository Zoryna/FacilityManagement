package marsmission.client;

// MarsMission
import marsmission.domain.*;
import marsmission.dataaccess.*;

// Java
import java.util.*;

// Spring
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println("***************** Woot, off to Mars, babe! ******************");
        Machines apollo = (Machines) context.getBean("machines");
        Machines nyx = (Machines) context.getBean("machines");
        Inspection i = (Inspection) context.getBean("inspection");
        Management man = (Management) context.getBean("management");


        // Maintenance injects Inspection
        // Finance injects Management
        // Control injects Machines

        // Staging the first Facility
        apollo.setName("Apollo");
        System.out.println("\n");
        apollo.setStateWorking(apollo); // Looks weird, but it's not about looks, babe
        System.out.println("This facility is called: " + apollo.getName());
        System.out.println("The state was set to: " + apollo.getState());

        // Staging the second Facility
        nyx.setName("Nyx");
        System.out.println("\n");
        nyx.setStateWorking(nyx);
        System.out.println("This facility is called: " + nyx.getName());
        System.out.println("The state was set to: " + nyx.getState());

        // Break Nyx
        System.out.println("\n");
        nyx.startMachines();
        nyx.oxygenator(false);
        System.out.println("Inner state of Nyx's machines");
        nyx.update();
        nyx.getFacilityStatus();

        // Check Apollo
        System.out.println("\n");
        apollo.startMachines();
        apollo.update();
        System.out.println("Inner state of Apollo's machines");
        apollo.getFacilityStatus();

        System.out.println("\n");
        System.out.println("Nyx has a machine broken machine");
        Control c = nyx.getControl();
        c.shitIsBroken(nyx);
        System.out.println("The state is now: " + nyx.getState());

        System.out.println("---------------------------");

        System.out.println("Time to run an inspection");
        i.setFacility(nyx);
        i.isBroken();
        i.makeMaintenanceRequest();
        i.returnBrokenMachines(nyx.getMap(), nyx.getMachines());

        System.out.println("---------------------------");

        System.out.println("Maintenance will fix any broken machines");
        Maintenance maint = i.getMaintenance();
        maint.setInspection(i);
        maint.setControl(c);
        maint.listMaintenanceRequest(i.returnBrokenMachines(nyx.getMap(), nyx.getMachines()));
        System.out.println("\n");
        System.out.println("Fixing the machines:");
        maint.fixMachines(nyx.getMap());
        maint.fixFacility();

        System.out.println("---------------------------");

        System.out.println("Testing Management on Nyx");
        man.actualUsage(i.checkMachines(nyx.getMap()));
        man.problemRateFacility(6, 1);
        man.requestAvailableCapacity(i.checkMachines(nyx.getMap()));

        System.out.println("---------------------------");

        System.out.println("Calculating Nyx's finances");
        Finance fin = man.getFinance();
        fin.setRatePerHour(3.05);
        fin.setMaintHourlyCost(50);
        fin.calcUsage(i.checkMachines(nyx.getMap()), 8);
        fin.calcMaintCostFacility(i.checkMachines(nyx.getMap()), 5);
        fin.calcDowntimeFacility(6);

     }
}
