package LibraryManagement;
import java.util.*;
public class Member{
String name;
String date;
double id;
Scanner sc=new Scanner(System.in);
 public void getinfo(){

System.out.print("Enter name of customer:");
name=sc.nextLine();
System.out.print("\nDate of issue");
date=sc.nextLine();
sc.nextLine();
System.out.print("\nMember id:");
id=sc.nextDouble();


}
public void setinfo(){
System.out.println(" Name of customer:" + name);
System.out.println("Member id:" + id);

System.out.println("Date of issue" + date);

}


}
