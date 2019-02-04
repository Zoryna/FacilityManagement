public class TestIO {
    public static void main(String[] args){
        ReadFile rf = new ReadFile();
        WriteFile wf = new WriteFile();
        Facility fac = new Facility("Airlock #0", 0);

        // WriteFile test outputs
        wf.setFileName("facilityinfo.txt");
        fac.setAddress("Acidalia Planitia");
        fac.setDescription("Controls airlock #0");
        fac.setCapacity(1000);
        fac.setCost(6.73);
        fac.setProblemRate(2);
        wf.saveFacilityInfo(fac);

        // ReadFile test outputs
        rf.setFileName("facilityinfo.txt");
        rf.readFile();
    }
}
