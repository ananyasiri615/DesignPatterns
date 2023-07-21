package BehavioralDesignPattern.ChainOfResponsibility;

public interface DispenseChain {
    void dispense(Currency currency);

    void setNextObjectInTheChain(DispenseChain next);
}
