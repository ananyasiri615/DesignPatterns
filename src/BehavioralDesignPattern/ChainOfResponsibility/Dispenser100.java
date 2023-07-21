package BehavioralDesignPattern.ChainOfResponsibility;

public class Dispenser100 implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 100){
            int remainder = currency.getAmount() %100;
            if(remainder != 0){
                this.dispenseChain.dispense(new Currency(remainder));
            }
            int noOfNotes = currency.getAmount() / 100;
            System.out.println("Dispensing "+noOfNotes+" notes of 100");
        }
        else {
            this.dispenseChain.dispense(currency);
        }
    }

    @Override
    public void setNextObjectInTheChain(DispenseChain next) {
        this.dispenseChain = next;
    }
}
