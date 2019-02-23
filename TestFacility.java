import java.util.*;

public class TestFacility{
    public static void main (String[] args){
        Facility fac = new Facility("Airlocks #0", 0);
        fac.setAddress("Acidalia Planitia");
        fac.setDescription("Controls the opening/closing of airlocks");
        fac.setCapacity(0);
        fac.setCost(100);
        fac.setProblemRate(5);

        System.out.println("getName: " + fac.getName());
        System.out.println("getAddress: " + fac.getAddress());
        System.out.println("getDescription: " + fac.getDescription());
        System.out.println("getRefNumber: " + fac.getRefNumber());
        System.out.println("getCapacity: " + fac.getCapacity());
        System.out.println("getCost: " + fac.getCost());
        System.out.println("getProblemRate: " + fac.getProblemRate());
        System.out.println("Object: " + fac.getFacilityObj());
        fac.setName("Airlocks #1");
        fac.setRefNumber(1);
        System.out.println("getName: " + fac.getName());
        System.out.println("getRefNumber: " + fac.getRefNumber());
    }
}
