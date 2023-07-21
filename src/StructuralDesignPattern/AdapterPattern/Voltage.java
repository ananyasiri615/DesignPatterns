package StructuralDesignPattern.AdapterPattern;

public class Voltage {
    private int volt;

    public Voltage(){
        super();
    }

    public Voltage(int volt){
        super();
        this.volt = volt;
    }
    public int getVolt() {
        return volt;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }
}
