package HomeAssignment.StructuralDesignPattern.DecoratorPattern;

public class NutsAndDryFruitsDecorator extends PlainIceCream {
        protected IceCream iceCream;
        public NutsAndDryFruitsDecorator(PlainIceCream iceCream) {
            super(iceCream.name);
        }

        public void assemble(){
            super.make();
            System.out.println("Nuts and Fruits added to "+name+" IceCream");
            System.out.println(name+" IceCream is a has Nuts and Fruits");
        }
    }


