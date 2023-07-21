package StructuralDesignPattern.ProxyPattern;

public class ProxyInterntAccess implements OfficeInternetAccess{

    private String empName;
    public int age;
    @Override
    public void grantInternetAccess() {
        String desig  = getEmployeeDesignamtion(age);
        if(desig.equalsIgnoreCase("Manager")){
            OfficeInternetAccess ia = new ActualInternetAccess(empName);
            ia.grantInternetAccess();
        }
        else {
            System.out.println(empName+ " is denied Internet Access");
        }
    }

    public String getEmployeeDesignamtion(int age){
        if(age>35){
            return "Manager";
        }
        else {
            return "Developer";
        }
    }

    public ProxyInterntAccess(String empName, int age) {
        super();
        this.empName = empName;
        this.age =age;
    }
}
