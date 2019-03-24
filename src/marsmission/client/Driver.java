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
        nyx.oxygenator(false);
        System.out.println("Inner state of Apollo's machines");
        nyx.update();
        apollo.getFacilityStatus();

        System.out.println("\n");
        System.out.println("Apollo's machines just broke");
        apollo.breakMachines();
        Control c = apollo.getControl();
        c.shitIsBroken(apollo);
        System.out.println("The state is now: " + apollo.getState());

        System.out.println("---------------------------");

        System.out.println("Time to run an inspection");
        i.setFacility(apollo);
        i.isBroken();
        i.makeMaintenanceRequest();
        i.returnBrokenMachines(apollo.getMap(), apollo.getMachines());

        System.out.println("---------------------------");

        System.out.println("Maintenance will fix any broken machines");
        Maintenance maint = i.getMaintenance();
        maint.setInspection(i);
        maint.setControl(c);
        maint.listMaintenanceRequest(apollo.getMap());
        System.out.println("\n");
        System.out.println("Fixing the machines:");
        maint.fixMachines(apollo.getMap());
        maint.fixFacility();

        System.out.println("---------------------------");

        System.out.println("Testing Management");
        man.actualUsage(i.checkMachines(apollo.getMap()));
        man.problemRateFacility(6, 1);
        man.requestAvailableCapacity(i.checkMachines(apollo.getMap()));

        System.out.println("---------------------------");

        System.out.println("Calculating the facility's finances");
        Finance fin = man.getFinance();
        fin.setRatePerHour(3.05);
        fin.setMaintHourlyCost(50);
        fin.calcUsage(i.checkMachines(apollo.getMap()), 8);
        fin.calcMaintCostFacility(i.checkMachines(apollo.getMap()), 5);
        fin.calcDowntimeFacility(6);

     }
}
