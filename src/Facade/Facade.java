package Facade;

public class Facade {
    SubFlow1 subFlow1 = new SubFlow1();
    SubFlow2 subFlow2 = new SubFlow2();
    SubFlow3 subFlow3 = new SubFlow3();
    boolean prove(){
        return subFlow1.isTrue()&&subFlow2.isOk()&&subFlow3.isGoodMan();
    }
}
