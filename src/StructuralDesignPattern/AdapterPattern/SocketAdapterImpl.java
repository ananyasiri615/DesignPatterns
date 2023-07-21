package StructuralDesignPattern.AdapterPattern;

public class SocketAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Voltage get110Volt() {
        Voltage v = getVolt();
        return new Voltage(v.getVolt()/2);
    }

    @Override
    public Voltage get11Volt() {
        Voltage v = getVolt();
        return new Voltage(v.getVolt()/20);
    }

    @Override
    public Voltage get5Volt() {
        Voltage v = getVolt();
        return new Voltage(v.getVolt()/44);

    }
}
