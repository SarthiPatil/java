import java.util.*;
class OddNumberException extends Exception{
    public String toString(){
        return"OddNumberException: Number is odd.";
    }
}
class Number{
  int num;
  void get() throws OddNumberException{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    num=sc.nextInt();
    if(num%2!=0){
        throw new OddNumberException();
}
System.out.println(num);
  }  
}
public class Odd {
    public static void main(String [] args){
    Number n=new Number();
    try {
        n.get();
    } catch ( OddNumberException e) {
        System.out.println(e);
    }
        
    }
    
}
