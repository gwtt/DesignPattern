package Command;

//具体命令
public class PrintCommand implements Command{
    private PrintService serviceProvider = new PrintService();
    private TextBox box;
    public PrintCommand(TextBox box)
    {
        this.box = box;
    }
    @Override
    public void execute() {
        serviceProvider.Print(box.getContext());
    }
}
