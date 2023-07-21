package BehavioralDesignPattern.ChainOfResponsibility;

import java.util.Scanner;

public class DispenserMain {
    public DispenseChain dispenseChain;
    public static void main(String[] args) {

        DispenseChain c1 = new Dispenser2000();
        DispenseChain c2 = new Dispenser500();
        DispenseChain c3 = new Dispenser100();
        
        c1.setNextObjectInTheChain(c2);
        c2.setNextObjectInTheChain(c3);
        System.out.println("Enter the amount to be withdrawn");

        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        Currency currency = new Currency(amount);
        c1.dispense(currency);
    }
}
