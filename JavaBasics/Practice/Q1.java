// Classes and Objects

package Practice;

import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void displayDetails() {
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number : "+this.rollNumber);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNumber = sc.nextInt();

        Student student = new Student();
        student.setDetails(name, rollNumber);
        student.displayDetails();
        sc.close();
    }
}