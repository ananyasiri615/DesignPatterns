package HomeAssignment.CreationalDesignPattern.FactoryPattern;

public class MobileFactory {
    private Mobile mobile;

    public Mobile getMobile(String brand) {

        switch(brand.toLowerCase()) {

            case "apple" :
                mobile = new Apple();
                break;

            case "samsung" :
                mobile = new Samsung();
                break;
            case "vivo" :
                mobile = new Vivo();
                break;
            default :
                mobile = null;
        }

        return mobile;
    }
}
