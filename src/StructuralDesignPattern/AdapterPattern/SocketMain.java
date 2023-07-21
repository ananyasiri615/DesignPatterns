package StructuralDesignPattern.AdapterPattern;

public class SocketMain {
    public static void main(String[] args) {

        SocketAdapter obj = new SocketAdapterImpl();

        Voltage v = getVolt(obj, 5);

        System.out.println("Successfully got voltage : " + v.getVolt());

        Voltage v1 = getVolt(obj, 11);

        System.out.println("Successfully got voltage : " + v1.getVolt());

        Voltage v2 = getVolt(obj, 110);

        System.out.println("Successfully got voltage : " + v2.getVolt());
    }

    public static Voltage getVolt(SocketAdapter obj, int voltRequired) {

        switch (voltRequired) {
            case 110:
                return obj.get110Volt();
            case 11:
                return obj.get11Volt();
            case 5:
                return obj.get5Volt();
            default:
                return new Voltage();

        }
    }
}
