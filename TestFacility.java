import java.util.*;

public class TestFacility{
    public static void main (String[] args){
        Facility fac = new Facility("Airlocks #0", 0);
        //fac.setName("Airlocks #1"); -> tested later to test the object return
        fac.setAddress("Acidalia Planitia");
        fac.setDescription("The airlocks function is to control air pressure from locations");
        // fac.setRefNumber(0001); -> tested later to test the object return
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
