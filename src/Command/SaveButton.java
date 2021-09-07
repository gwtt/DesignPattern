package Command;
//图像渲染层 保存按钮
public class SaveButton {
    private Command command;
    public void bindCommand(Command command)
    {
        this.command = command;
    }
    public void doPrint(){
            if(command==null)
                throw new RuntimeException("初始化失败!");
            command.execute();
    }
}
