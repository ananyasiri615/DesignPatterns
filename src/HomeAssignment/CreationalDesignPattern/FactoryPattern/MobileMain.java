package HomeAssignment.CreationalDesignPattern.FactoryPattern;


public class MobileMain {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();

        Mobile apple = mobileFactory.getMobile("apple");
        apple.setModel("IPhone 14");
        apple.setPrice(95000);
        apple.feature();

        Mobile samsung = mobileFactory.getMobile("samsung");
        samsung.setModel("Samsung F 23");
        samsung.setPrice(20000);
        samsung.feature();

        Mobile vivo = mobileFactory.getMobile("vivo");
        vivo.setModel("Vivo v5");
        vivo.setPrice(25000);
        vivo.feature();

    }


}
