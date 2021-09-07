package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ZhangSan implements Debit{
    private List<Credit> allCredits = new ArrayList<>();
    @Override
    public void borrow(Credit credit) {
            allCredits.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredits.forEach(credit -> {credit.takeMoney(); });
    }
}
