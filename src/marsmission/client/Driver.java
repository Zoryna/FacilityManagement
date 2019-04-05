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
        Inspection i = (Inspection) context.getBean("inspection");
        Finance f = (Finance) context.getBean("finance");
        Control c = (Control) context.getBean("control");

        System.out.println("\n");
        apollo.setStateWorking(apollo); // Looks weird, but it's not about looks, babe

        System.out.println("**** INJECTION ****");
        apollo.getFacilityInformation().setName("Apollo");
        System.out.println("This facility is called: " + apollo.getFacilityInformation().getName());
        System.out.println("The state was set to: " + apollo.getState());

        System.out.println("\n");

        apollo.startMachines();
        apollo.getOxygenator().setStatus(false);
        apollo.getInnerAirlocks().setStatus(true);
        apollo.getExternalAirlocks().setStatus(true);
        apollo.getNuclearReactor().setStatus(true);
        apollo.getComms().setStatus(true);
        apollo.getWaterExtraction().setStatus(true);

        System.out.println("Testing Inspection");
        i.setFacility(apollo);
        apollo.startUpdateMap();
        i.returnBorkenMachines(apollo.getMap());

    }
}