package Ecommerce;
import java.util.*;
 public class Customer{
String name;
String address;
double id;
Scanner sc=new Scanner(System.in);
 
public void getinfo(){
System.out.println("Name of Customer:");
name=sc.nextLine();
System.out.println("Address of Customer:");
address=sc.nextLine();
sc.nextLine();
System.out.println("Customeer id");
id=sc.nextDouble();
}

public void setinfo(){
System.out.println("Name of customer:" + name);
System.out.println("Address:" + address);
System.out.println("Customer id" + id);

}

}