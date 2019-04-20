package marsmission.domain;

public class VisitorImpl implements Visitor{

    public void visit(MachinesInterface i) {
        System.out.println(i.getMachine() + " is 5 years old");
    }

}
