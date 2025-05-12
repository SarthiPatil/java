import ExceptionHandlingdemo.DivisionException; 
import ExceptionHandlingdemo.Calculator;
import java.util.*;
import java.lang.*;
public class CalculatorMain{
public static void main(String[] ar){ 
Scanner scan = new Scanner(System.in); 
Calculator d= new Calculator();
try{
System.out.println("Enter two numbers: "); 
int num1= scan.nextInt(); 
int num2 = scan.nextInt();
if(num2 == 0) { 
throw new DivisionException(); }
 else{ d.divide(num1, num2); 
}
} catch(DivisionException e){
System.out.println(e);
}
}
}