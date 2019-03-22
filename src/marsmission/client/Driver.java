package marsmission.client;

// MarsMission
import marsmission.domain.*;
import marsmission.dataaccess.*;

// Java
import java.util.*;

// Spring

/*
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
*/

public class Driver {
    public static void main(String[] args){
        // ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Facility apollo = new Facility();
        Control c = new Control();
        c.setStateWorking(apollo);
        System.out.println(apollo.getState());
    }
}
