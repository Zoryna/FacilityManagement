package marsmission.domain;

public interface Visitor {

    public void visit(Comms c);

    public void visit(ExternalAirlocks e);

    public void visit(NuclearReactor n);

    public void visit(WaterExtraction w);

    public void visit(Oxygenator o);

    public void visit(InnerAirlocks i);

}
