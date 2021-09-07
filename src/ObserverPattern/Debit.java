package ObserverPattern;

public interface Debit {
    void borrow(Credit credit);
    void notifyCredits();
}
