package StructuralDesignPattern.AdapterPattern;

public class Socket {
    public Voltage getVolt(){
        return new Voltage(220);
    }
}
