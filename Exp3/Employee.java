package ASSIGN3;
import java.util.*;


public class Employee {


        String name, address, job_title;
        float salary,bonus;

        void data()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name:");
            name=sc.nextLine();
            System.out.println("Enter address:");
            address=sc.nextLine();
            System.out.println("Enter Job Title:");
            job_title=sc.nextLine();
            System.out.println("Enter salary:");
            salary=sc.nextFloat();
            System.out.println("Enter bonus:");
            bonus=sc.nextFloat();
        }
    }
    class Manager extends Employee
    {
        void display()
        {
            System.out.println("*****Manager Info******");
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
            System.out.println("Job Title:"+job_title);
            System.out.println("Salary"+salary);
            System.out.println("Salary after getting bonus:"+(salary+bonus));
        }
    }

    class Developer extends Employee
    {
        void display()
        {
            System.out.println("*****Developer Info******");
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
            System.out.println("Job Title:"+job_title);
            System.out.println("Salary"+salary);
            System.out.println("Salary after getting bonus:"+(salary+bonus));
        }
    }
    class Programmer extends Employee
    {
        void display()
        {
            System.out.println("*****Programmer Info******");
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
            System.out.println("Job Title:"+job_title);
            System.out.println("Salary"+name);
            System.out.println("Salary after getting bonus:"+(salary+bonus));
        }
    }
    class Test2
    {
        public static void main(String[] args)
        {
            Manager m1=new Manager();
            m1.data();
            m1.display();

            Developer d1=new Developer();
            d1.data();
            d1.display();

            Programmer p1=new Programmer();
            p1.data();
            p1.display();
        }


}

/*
Enter name:
RAJ
Enter address:
kolhpaur
Enter Job Title:
CEO
Enter salary:
20000
Enter bonus:
1000
*****Manager Info******
Name:RAJ
Address:kolhpaur
Job Title:CEO
Salary20000.0
Salary after getting bonus:21000.0
Enter name:
ANIKET
Enter address:
kolhapur
Enter Job Title:
MAnager
Enter salary:
100
Enter bonus:
50
*****Developer Info******
Name:ANIKET
Address:kolhapur
Job Title:MAnager
Salary100.0
Salary after getting bonus:150.0
Enter name:
Parvej
Enter address:
KOlhapur
Enter Job Title:
Ass.Manager
Enter salary:
200
Enter bonus:
10
*****Programmer Info******
Name:Parvej
Address:KOlhapur
Job Title:Ass.Manager
SalaryParvej
Salary after getting bonus:210.0

 */