package marsmission.domain;

public class VisitorImpl implements Visitor{

    public void visit(Comms c) {
        if (c.status() == true)
            System.out.println(c.getMachine() + "is working. It's status is " + c.status());
        else
            System.out.println(c.getMachine() + " is NOT working. It's status is " + c.status());
    }

    public void visit(ExternalAirlocks e) {
        if (e.status() == true)
            System.out.println(e.getMachine() + "is working. It's status is " + e.status());
        else
            System.out.println(e.getMachine() + " is NOT working. It's status is " + e.status());
    }

    public void visit(NuclearReactor n) {
        if (n.status() == true)
            System.out.println(n.getMachine() + "is working. It's status is " + n.status());
        else
            System.out.println(n.getMachine() + " is NOT working. It's status is " + n.status());
    }

    public void visit(WaterExtraction w) {
        if (w.status() == true)
            System.out.println(w.getMachine() + "is working. It's status is " + w.status());
        else
            System.out.println(w.getMachine() + " is NOT working. It's status is " + w.status());
    }

    public void visit(Oxygenator o) {
        if (o.status() == true)
            System.out.println(o.getMachine() + "is working. It's status is " + o.status());
        else
            System.out.println(o.getMachine() + " is NOT working. It's status is " + o.status());
    }

    public void visit(InnerAirlocks i) {
        if (i.status() == true)
            System.out.println(i.getMachine() + "is working. It's status is " + i.status());
        else
            System.out.println(i.getMachine() + " is NOT working. It's status is " + i.status());
    }

}
