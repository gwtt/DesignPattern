package Visitor;

public abstract class Hardware {
    String command;
    public Hardware(String command){
        this.command = command;
    }

    public void run(){
        System.out.println(command);
    }

    public abstract void accept(Visitor visitor);

}
