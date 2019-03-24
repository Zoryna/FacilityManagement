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

        // Maintenance injects Inspection
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

     }
}
