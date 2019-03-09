public class TestFinance {
    public static void main(String[] args) {

        TimeController tc = new TimeController();
        Finance fin = new Finance();

        Inspection ins = new Inspection();
        Maintenance maint = new Maintenance();

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
        apolloMach.waterMaking(true);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Finance");

        tc.setHours(8);
        fin.calcUsage(ins.checkMachines(apolloMach.getMap()), tc.getHours());

        tc.setHours(5);
        fin.calcMaintCostFacility(ins.checkMachines(apolloMach.getMap()), tc.getHours());


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
        nyxMach.waterMaking(false);

        nyxMach.update();
        nyxMach.getFacilityStatus();

        System.out.println("---------------------------");
        System.out.println("Testing Finance");

        tc.setHours(6);
        fin.calcUsage(ins.checkMachines(nyxMach.getMap()), tc.getHours());

        tc.setHours(3);
        fin.calcMaintCostFacility(ins.checkMachines(nyxMach.getMap()), tc.getHours());


















    }
}