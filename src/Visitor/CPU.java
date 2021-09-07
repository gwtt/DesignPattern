package Visitor;

public class CPU extends Hardware{
    public CPU(String command)
    {
        super(command);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }
}
