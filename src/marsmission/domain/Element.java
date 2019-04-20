package marsmission.domain;

public interface Element {
    public void accept(Visitor v);
}
