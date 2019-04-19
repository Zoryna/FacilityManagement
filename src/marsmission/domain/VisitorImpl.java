package marsmission.domain;

public class VisitorImpl implements Visitor{

    public void visit(Comms c) {
        System.out.println(c.getMachine() + " is 5 years old");
    }

    public void visit(ExternalAirlocks e) {
        System.out.println(e.getMachine() + " is 8 years old");
    }

    public void visit(NuclearReactor n) {
        System.out.println(n.getMachine() + " is 3 years old");
    }

    public void visit(WaterExtraction w) {
        System.out.println(w.getMachine() + " is 9 years old");
    }

    public void visit(Oxygenator o) {
        System.out.println(o.getMachine() + " is 10 years old");
    }

    public void visit(InnerAirlocks i) {
        System.out.println(i.getMachine() + " is 4 years old");
    }

}
