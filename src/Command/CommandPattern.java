package Command;

public class CommandPattern {
    public static void main(String[] args) {
        SaveButton saveButton = new SaveButton();
        TextBox box= new TextBox();

        PrintCommand printCommand = new PrintCommand(box);
        saveButton.bindCommand(printCommand);

        box.setContext("ABCDEFG");
        saveButton.doPrint();

        box.setContext("ABCDEFGHIJ");
        saveButton.doPrint();
    }
}
