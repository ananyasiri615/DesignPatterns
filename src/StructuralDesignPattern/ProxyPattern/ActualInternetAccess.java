package StructuralDesignPattern.ProxyPattern;

public class ActualInternetAccess implements OfficeInternetAccess{
    private String name;

    public ActualInternetAccess(String name) {
        super();
        this.name = name;
    }

    @Override
    public void grantInternetAccess(){
        System.out.println("The access is provided to "+name);
    }
}
