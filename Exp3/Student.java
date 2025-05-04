package ASSIGN3;

class Student {
    protected int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;

    public Test(int rollNo, int sub1, int sub2) {
        super(rollNo);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}

class Result extends Test {
    public Result(int rollNo, int sub1, int sub2) {
        super(rollNo, sub1, sub2);
    }

    public void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Result student = new Result(101, 85, 90);
        student.displayResult();
    }
}