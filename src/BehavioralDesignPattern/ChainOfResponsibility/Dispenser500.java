package BehavioralDesignPattern.ChainOfResponsibility;

public class Dispenser500 implements DispenseChain{
    private DispenseChain dispenseChain;
    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 500){
            int remainder = currency.getAmount() %500;
            if(remainder != 0){
                this.dispenseChain.dispense(new Currency(remainder));
            }
            int noOfNotes = currency.getAmount() / 500;
            System.out.println("Dispensing "+noOfNotes+" notes of 500");
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
