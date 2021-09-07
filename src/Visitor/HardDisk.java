package Visitor;

public class HardDisk extends Hardware{
    public HardDisk(String command)
    {
        super(command);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDisk(this);
    }
}
