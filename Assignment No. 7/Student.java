

import java.io.*;
import java.util.Scanner;
public class Student {
    String name;
    int age;
    float height,weight;
    String city;
    double phone;
  
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        name=sc.nextLine();
        System.out.println("Age:");
        age=sc.nextInt();
        System.out.println("height:");
        height=sc.nextFloat();
        System.out.println("Weight:");
        weight=sc.nextFloat();
        sc.nextLine();
        System.out.println("city:");
        city=sc.nextLine();
        System.out.println("Number:");
        phone=sc.nextDouble();
        }
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("City: " + city);
            System.out.println("Number: " + phone);
        }

        public static void main(String[]args)throws IOException{
            Student s=new Student();
            s.get();
            FileOutputStream fout=new FileOutputStream("student.txt");
            DataOutputStream dos=new     DataOutputStream (fout);
            FileInputStream fin=new   FileInputStream("student.txt");
            dos.writeUTF(s.name);
        dos.writeInt(s.age);
        dos.writeFloat(s.height);
        dos.writeFloat(s.weight);
        dos.writeUTF(s.city);
        dos.writeDouble(s.phone);

        System.out.println("Student data written to student.txt");
        try (DataInputStream dis = new DataInputStream(new FileInputStream("student.txt"))) {
            Student s2 = new Student();
            s2.name = dis.readUTF();
            s2.age = dis.readInt();
            s2.height = dis.readFloat();
            s2.weight = dis.readFloat();
            s2.city = dis.readUTF();
            s2.phone = dis.readDouble();

            System.out.println("\nStudent data read from file:");
            s2.display();
        }
        }
        
        

    

}
