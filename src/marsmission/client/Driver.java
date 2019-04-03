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
        Facility apollo = (Facility) context.getBean("facility");

        apollo.setName("Apollo");
        System.out.println("\n");
        apollo.setStateWorking(apollo); // Looks weird, but it's not about looks, babe
        System.out.println("This facility is called: " + apollo.getName());
        System.out.println("The state was set to: " + apollo.getState());

        System.out.println("\n");
        System.out.println("**** INJECTION ****");
        apollo.getMachines().setStatus(true);
        apollo.getMachines().setFacility(apollo);
        System.out.println("This Machine belongs to: " + apollo.getMachines().getFacility().getName()); // Apollo is set through injection and then name is checked through injection, take that, Inception!
        System.out.println("Apollo's oxygenator is: " + apollo.getMachines().status());

     }
}
