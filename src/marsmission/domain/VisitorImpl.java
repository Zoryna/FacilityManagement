package marsmission.domain;

public class VisitorImpl implements Visitor{

    public void visit(Comms c) {
        if (c.status() == true)
            System.out.println(c.getMachine() + "is working. Its status is " + c.status());
        else
            System.out.println(c.getMachine() + " needs to be fixed. Its status is " + c.status());
    }

    public void visit(ExternalAirlocks e) {
        if (e.status() == true)
            System.out.println(e.getMachine() + " is working. Its status is " + e.status());
        else
            System.out.println(e.getMachine() + " needs to be fixed. Its status is " + e.status());
    }

    public void visit(NuclearReactor n) {
        if (n.status() == true)
            System.out.println(n.getMachine() + " is working. Its status is " + n.status());
        else
            System.out.println(n.getMachine() + " needs to be fixed. Its status is " + n.status());
    }

    public void visit(WaterExtraction w) {
        if (w.status() == true)
            System.out.println(w.getMachine() + " is working. Its status is " + w.status());
        else
            System.out.println(w.getMachine() + " needs to be fixed. Its status is " + w.status());
    }

    public void visit(Oxygenator o) {
        if (o.status() == true)
            System.out.println(o.getMachine() + "is working. Its status is " + o.status());
        else
            System.out.println(o.getMachine() + " needs to be fixed. Its status is " + o.status());
    }

    public void visit(InnerAirlocks i) {
        if (i.status() == true)
            System.out.println(i.getMachine() + " is working. Its status is " + i.status());
        else
            System.out.println(i.getMachine() + " needs to be fixed. Its status is " + i.status());
    }

}
