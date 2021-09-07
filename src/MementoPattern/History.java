package MementoPattern;

import java.util.Stack;

//备忘录栈
public class History {
    Stack<BackUp> backUpStack = new Stack<>();
    public void add(BackUp backUp)
    {
        backUpStack.add(backUp);
    }
    public BackUp getLastVersion(){
        return backUpStack.pop();
    }
}
