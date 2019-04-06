package marsmission.client;

// MarsMission
import marsmission.domain.*;
import marsmission.dataaccess.*;

// Java
import java.awt.*;
import java.util.*;

// Spring
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        System.out.println("***************** Woot, off to Mars, babe! ******************");
        Facility apollo = (Facility) context.getBean("facility");
        FacilityInformation fi = (FacilityInformation) context.getBean("facilityInformation");
        Inspection i = (Inspection) context.getBean("inspection");
        Finance f = (Finance) context.getBean("finance");
        Control c = (Control) context.getBean("control");

        System.out.println("\n");
        apollo.setStateWorking(apollo); // Looks weird, but it's not about looks, babe

        System.out.println("**** INJECTION ****");
        apollo.getFacilityInformation().setName("Apollo");
        apollo.getFacilityInformation().setName("Nyx");
        System.out.println("This facility is called: " + apollo.getFacilityInformation().getName());
        System.out.println("The state was set to: " + apollo.getState());

        System.out.println("\n");

        apollo.getOxygenator().setStatus(true);
        apollo.getInnerAirlocks().setStatus(true);
        apollo.getExternalAirlocks().setStatus(true);
        apollo.getNuclearReactor().setStatus(true);
        apollo.getComms().setStatus(true);
        apollo.getWaterExtraction().setStatus(true);
        apollo.getOxygenator().setFacility(apollo);
        System.out.println("This Machinery belongs to: " + apollo.getFacilityInformation().getName()); // Apollo is set through injection and then name is checked through injection, take that, Inception!
        System.out.println("Apollo's Oxygenator is: " + apollo.getOxygenator().status());
        System.out.println("Apollo's Inner Airlock is: " + apollo.getInnerAirlocks().status());
        System.out.println("Apollo's External Airlock is: " + apollo.getExternalAirlocks().status());
        System.out.println("Apollo's Nuclear Reactor is: " + apollo.getNuclearReactor().status());
        System.out.println("Apollo's Comms is: " + apollo.getComms().status());
        System.out.println("Apollo's WaterExtraction is: " + apollo.getWaterExtraction().status());

        // State Change
        System.out.println("\n");
        apollo.addObserver(f);
        System.out.println("Has the state changed in Facility? " + apollo.hasChanged());
        apollo.getOxygenator().setStatus(false);
        c.setStateBroken(apollo);
        apollo.setChanged();
        System.out.println("Apollo is now: " + apollo.getState());
        System.out.println("Apollo's oxygenator is: " + apollo.getOxygenator().status());
        System.out.println("Has the state changed? " + apollo.hasChanged());

        // Observers check
        System.out.println("checkObserver() returns true if Observer was properly added: " + apollo.checkObserver());
        apollo.notify(f); // Liskov Substitution Principle, we fancy
        f.update();
        apollo.deleteObserver(f);
        System.out.println("Checking if Observer was dettached, should return false: " + apollo.checkObserver());
        apollo.startMachines();
        apollo.getOxygenator().setStatus(false);
        apollo.startUpdateMap();
        i.getFacilityStatus(apollo.getMap());

    }
}
