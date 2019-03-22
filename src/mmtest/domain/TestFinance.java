package mmtest.domain;

import mmtest.domain.*;

public class TestFinance {
    public static void main(String[] args) {

        TimeController tc = new TimeController();
        Finance fin = new Finance();

        Inspection ins = new Inspection();

        Facility apollo = new Facility();
        Machines apolloMach = new Machines(apollo);

        Facility nyx = new Facility();
        Machines nyxMach = new Machines(nyx);

        apollo.setName("Apollo");
        ins.setFacility(apollo);

        System.out.println("For Apollo");
        apolloMach.startMachines(); //all machines start as true

        apolloMach.oxygenator(false);
        apolloMach.nuclearReactor(false);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.comms(true);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Finance");

        tc.setHours(8);
        fin.setRatePerHour(3.05); //3.05 is watt cost per hour

        fin.calcUsage(ins.checkMachines(apolloMach.getMap()), tc.getHours());
        System.out.println("---------------------------");

        tc.setHours(5);
        fin.setMaintHourlyCost(50); //arbitrary number
        fin.calcMaintCostFacility(ins.checkMachines(apolloMach.getMap()), tc.getHours());
        System.out.println("---------------------------");

        System.out.println("Calculating downtime");
        int numberOfTests = 3;
        double percentageBeingTested = 0.05;

        int apolloBroken = 0;

        System.out.println("The facility needs to be less than " + percentageBeingTested + " to pass as working");
        fin.calcDowntimeFacility(apolloBroken);



        System.out.println("---------------------------");
        System.out.println("---------------------------");

        nyx.setName("Nyx");
        ins.setFacility(nyx);

        System.out.println("For Nyx");
        nyxMach.startMachines(); //all machines start as true

        nyxMach.oxygenator(true);
        nyxMach.nuclearReactor(true);
        nyxMach.innerAirlocks(true);
        nyxMach.externalAirlocks(false);
        nyxMach.comms(false);
        nyxMach.waterMaking(true);

        nyxMach.update();
        nyxMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Finance");

        tc.setHours(6);
        fin.setRatePerHour(3.05); //3.05 is watt cost per hour
        fin.calcUsage(ins.checkMachines(nyxMach.getMap()), tc.getHours());
        System.out.println("---------------------------");

        tc.setHours(3);
        fin.setMaintHourlyCost(50); //arbitrary number
        fin.calcMaintCostFacility(ins.checkMachines(nyxMach.getMap()), tc.getHours());

        System.out.println("---------------------------");

        System.out.println("Calculating downtime");

        int nyxBroken = 0;

        System.out.println("The facility needs to be less than " + percentageBeingTested + " to pass as working");
        fin.calcDowntimeFacility(nyxBroken);
    }
}
