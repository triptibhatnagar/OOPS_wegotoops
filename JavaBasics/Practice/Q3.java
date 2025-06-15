// Constructors

package Practice;

import java.util.Scanner;

class Rectangle {
    double length;
    double width;
    double area;
    Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        this.area = this.length*this.width;
        return area;
    }
    void displayDetails() {
        System.out.printf("Length : %.2f\n" , this.length);
        System.out.printf("Width : %.2f\n" , this.width);
        System.out.printf("Area : %.2f\n" , this.area);
    }
}

public class Q3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.displayDetails();

        Rectangle r2 = new Rectangle(length, width);
        r2.calculateArea();
        r2.displayDetails();

        sc.close(); // Close the scanner
    }
}