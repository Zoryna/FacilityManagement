import mmtest.domain.*;

public class TestManagement {
    public static void main (String[] args) {
        TimeController tc = new TimeController();
        Finance fin = new Finance();
        Randomizer r = new Randomizer();

        Inspection ins = new Inspection();
        Management ma = new Management();

        Facility apollo = new Facility();
        Machines apolloMach = new Machines(apollo);

        Facility nyx = new Facility();
        Machines nyxMach = new Machines(nyx);

        apollo.setName("Apollo");
        ins.setFacility(apollo);

        System.out.println("For Apollo");
        apolloMach.startMachines(); //all machines start as true

        apolloMach.oxygenator(true);
        apolloMach.nuclearReactor(false);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.comms(true);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Management");

        ma.requestAvailableCapacity(ins.checkMachines(apolloMach.getMap()));

        System.out.println("---------------------------");

        int numberOfTests = 3;
        double percentageBeingTested = 0.05;

        int apolloBroken = 0;

        ma.problemRateFacility(numberOfTests, apolloBroken);

        System.out.println("---------------------------");
        ma.actualUsage(ins.checkMachines(apolloMach.getMap()));



        System.out.println("---------------------------");
        System.out.println("---------------------------");

        nyx.setName("Nyx");
        ins.setFacility(nyx);

        System.out.println("For Nyx");
        nyxMach.startMachines(); //all machines start as true

        nyxMach.oxygenator(true);
        nyxMach.nuclearReactor(false);
        nyxMach.innerAirlocks(true);
        nyxMach.externalAirlocks(true);
        nyxMach.comms(true);
        nyxMach.waterMaking(false);

        nyxMach.update();
        nyxMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Management");

        ma.requestAvailableCapacity(ins.checkMachines(apolloMach.getMap()));

        System.out.println("---------------------------");

        int nyxBroken = 0;

        ma.problemRateFacility(numberOfTests, nyxBroken);

        System.out.println("---------------------------");
        ma.actualUsage(ins.checkMachines(nyxMach.getMap()));
    }
}
