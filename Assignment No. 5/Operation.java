package Maths;
import java.util.*;
public class Operation{

public int num;
public void  getNum(){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();  
}
public void factorial(){
if(num==0){
System.out.println("Factorial of 0 is 1");
return;
}
int fact=1;
for(int i=num;i>0;i--){
fact*=i;
}
System.out.println("Factorial of"+num+"is:"+fact);
}

public void cube(){
double c=num*num*num;
System.out.println("Cube of"+num+"is"+c);

}
}
