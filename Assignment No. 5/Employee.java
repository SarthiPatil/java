
import employee.Emp;

public class Employee {
    public static void main(String[] args) {
        
        Emp e = new Emp("Snehal Vibhute", 1001, "Manager", 50000); 
        
        e.calculatePay();

       
        e.printPayroll();
    }
}
