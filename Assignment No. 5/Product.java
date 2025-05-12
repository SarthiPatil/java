package Ecommerce;
import java.util.*;

public class Product{
String product;
String category;
double product_id;
double price;
Scanner sc=new Scanner(System.in);
public void getinfo(){
System.out.println("Name of the product");
product=sc.nextLine();
System.out.println("Category of the product");
category=sc.nextLine();
System.out.println("price of the product");
price=sc.nextDouble();
}
public void setinfo(){
System.out.println("Name of the product" + product);

System.out.println("Category of the product"+ category);

System.out.println("price of the product" + price);

}
}