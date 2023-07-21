package StructuralDesignPattern.ProxyPattern;

public class ProxyMain {

    public static void main(String[] args) {
        OfficeInternetAccess obj =  new ProxyInterntAccess("Arjun Kumar",23);
        obj.grantInternetAccess();

        OfficeInternetAccess obj1 = new ProxyInterntAccess("Sheetal Kumari",42);
        obj1.grantInternetAccess();
    }
}
