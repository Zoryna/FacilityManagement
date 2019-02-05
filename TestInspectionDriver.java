/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {
        TestFacility fac1Test = new TestFacility();
        TestFacility2 fac2Test = new TestFacility2();

        fac1Test.setDetails();
        //testing
        System.out.println("getName: " + fac1Test.getName());
        System.out.println("getAddress: " + fac1Test.getAddress());
        System.out.println("getDescription: " + fac1Test.getDescription());
        System.out.println("getRefNumber: " + fac1Test.getRefNumber());
        System.out.println("getCapacity: " + fac1Test.getCapacity());
        System.out.println("getCost: " + fac1Test.getCost());
        System.out.println("getProblemRate: " + facTest.getProblemRate());
        System.out.println("Object: " + fac1Test.getFacilityObj());
        fac.setName("Airlocks #1");
        fac.setRefNumber(1);
        System.out.println("getName: " + fac1Test.getName());
        System.out.println("getRefNumber: " + fac1Test.getRefNumber());






















    }
}