package MementoPattern;

public class MementoPattern {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();
        document.change("abc");
        history.add(document.save());

        document.change("def");
        history.add(document.save());

        document.change("ghi");
        history.add(document.save());

        document.change("lmn");

        document.resume(history.getLastVersion());
        document.print();

        document.resume(history.getLastVersion());
        document.print();
    }
}
