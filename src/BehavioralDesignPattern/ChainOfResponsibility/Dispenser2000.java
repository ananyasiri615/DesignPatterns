package BehavioralDesignPattern.ChainOfResponsibility;

public class Dispenser2000 implements DispenseChain{

    private DispenseChain dispenseChain;
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 2000){
            int remainder = currency.getAmount() %2000;
            if(remainder != 0){
                this.dispenseChain.dispense(new Currency(remainder));
            }
            int noOfNotes = currency.getAmount() / 2000;
            System.out.println("Dispensing "+noOfNotes+" notes 2000");
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
