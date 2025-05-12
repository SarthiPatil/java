package LibraryManagement;
import java.util.*;
public class Book{
String title;
String author;
int ISBN;
Scanner sc=new Scanner(System.in);
 public void getinfo(){
System.out.println("Enter ISBN :");
ISBN=sc.nextInt();
sc.nextLine();

System.out.print("Enter title of book :");
title=sc.nextLine();
System.out.print("\nEnter name of author :");
author=sc.nextLine();

}
 public void setinfo(){
System.out.println("Tile of book :" + title);

System.out.println("Name of author :" + author);

System.out.println("ISBN :" + ISBN);


}

}