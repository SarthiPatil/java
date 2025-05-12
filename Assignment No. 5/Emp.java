
package employee;

public class Emp {
    
    String name;
    int empid;
    String category;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    
    public Emp(String name, int empid, String category, double bpay) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
    }


    public void calculatePay() {
        // Calculate DA, HRA, PF, and allowance
        da = bpay * 0.05;  // 5% of basic pay
        hra = bpay * 0.09; // 9% of basic pay
        pf = bpay * 0.11;  // 11% of basic pay
        allowance = bpay * 0.10; // 10% of basic pay

        // Calculate gross pay
        grosspay = bpay + hra + da + allowance;

        // Calculate net pay (after PF)
        npay = grosspay - pf;

        // Calculate income tax (let's assume 10% of gross pay)
        incometax = grosspay * 0.10; // 10% income tax

        // Calculate final net pay after income tax
        npay = npay - incometax;
    }

       public void printPayroll() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Income Tax: " + incometax);
        System.out.println("Net Pay (after tax): " + npay);
    }
}
