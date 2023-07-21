package StructuralDesignPattern.AdapterPattern;

public interface SocketAdapter {
    public Voltage get110Volt();
    public Voltage get11Volt();
    public Voltage get5Volt();

}
