package Visitor;

public class EggRobot {
    private HardDisk disk;
    private CPU cpu;

    public EggRobot(){
        disk =  new HardDisk("记住 1+1=1");
        cpu = new CPU("1+1=1");

    }
    public void calc(){
        cpu.run();
        disk.run();
    }

    public void accept(Visitor visitor){
        cpu.accept(visitor);
        disk.accept(visitor);
    }
}
