package ChainResp;

public class ChinaRespPattern {
    public static void main(String[] args) {
        Handler level1 = new Leader();
        Handler level2 = new Boss();
        level1.setNextHandler(level2);
        level1.process(11);
        level1.process(9);

    }
}
