package Visitor;

public interface Visitor {
    void visitCPU(CPU cpu);
    void visitDisk(HardDisk disk);
}
