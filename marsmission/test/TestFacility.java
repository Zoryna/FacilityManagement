package marsmission.test;
import marsmission.habcontrol.Facility;

import java.util.*;

public class TestFacility{
    public static void main (String[] args){
        Facility fac0 = new Facility();
        Facility fac1 = new Facility();

        // Stages the first object
        fac0.setName("Airlocks #0");
        fac0.setAddress("Acidalia Planitia");
        fac0.setDescription("Controls the opening/closing of airlocks");
        fac0.setCapacity(0);
        fac0.setCost(100);
        fac0.setProblemRate(5);

        // Checks if objects are unique
        if (fac1 == fac0){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


        System.out.println("getName: " + fac0.getName());
        System.out.println("getAddress: " + fac0.getAddress());
        System.out.println("getDescription: " + fac0.getDescription());
        System.out.println("getRefNumber: " + fac0.getRefNumber());
        System.out.println("getCapacity: " + fac0.getCapacity());
        System.out.println("getCost: " + fac0.getCost());
        System.out.println("getProblemRate: " + fac0.getProblemRate());
        fac1.setName("Airlocks #1");
        fac1.setRefNumber(1);
        System.out.println("getName: " + fac1.getName());
        System.out.println("getRefNumber: " + fac1.getRefNumber());
    }
}
