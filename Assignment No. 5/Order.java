package Ecommerce;
import Ecommerce.Product;
import java.util.*;
public class Order{
double quantity;
Scanner sc=new Scanner(System.in);
Product p=new Product();
public void get(){
System.out.println("Enter Quantity:");
quantity=sc.nextInt();
}
public void total_price(){
double total=quantity*p.price;
System.out.println("Total Price:" + total);


}
public void setProductInfo() {
        p.getinfo();  // Make sure to call this to set the product price
    }

}