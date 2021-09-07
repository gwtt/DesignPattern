package State;

public class Context {
    private State state;
    public void changeState(State state)
    {
        this.state = state;
    }
    public void doSomething(){
        state.doWork();
    }
}
