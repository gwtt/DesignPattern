package ChainResp;

public class Leader extends Handler{
    @Override
    public void process(Integer info) {
            if(info>0&&info<10)
                System.out.println("Leader 处理");
            else
                nextHandler.process(info);
    }
}
