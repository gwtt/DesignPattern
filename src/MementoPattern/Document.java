package MementoPattern;

//文档类
public class Document {
    private String content;

    public BackUp save(){
        return new BackUp(content);
    }

    public void resume(BackUp backUp)
    {
        content = backUp.content;
    }

    public void change(String content)
    {
        this.content = content;
    }

    public void print()
    {
        System.out.println(content);
    }
}
