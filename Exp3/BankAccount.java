package ASSIGN3;
import java.util.*;

public class BankAccount {

        float bal,wd;
        void deposit()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter deposited amount:");
            bal=sc.nextFloat();
        }
        void withdraw()
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter withdraw amount:");
            wd=sc.nextFloat();
            bal=bal-wd;
            System.out.println("Balance:"+bal);
        }
    }
    class savingAccount extends BankAccount
    {      void error()
    {
        System.out.println("Your balance is less than 100 so you can't withdraw amount");
    }
        public static void main(String[] args)
        {
            savingAccount s1=new savingAccount();
            s1.deposit();
            if(s1.bal<=100)
            {
                s1.error();
            }
            else
            {
                s1.withdraw();
            }
        }


}

/* OUTPUT :
Enter deposited amount:
200
Enter withdraw amount:
100
Balance:100.0
*/