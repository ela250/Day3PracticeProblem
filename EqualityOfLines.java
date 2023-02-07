package com.geometry;
import java.util.Objects;
import java.util.Scanner;
public class EqualityOfLines {
    public static void main(String[] args) {
        boolean equals;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of line1(x1,y1) value :");
        double x1 =scanner.nextDouble();
        double y1 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line1(y1,y2) value :");
        double x2 =scanner.nextDouble();
        double y2 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line2(x3,y3) value :");
        double x3 =scanner.nextDouble();
        double y3 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line2(x4,y4) value :");
        double x4 =scanner.nextDouble();
        double y4=scanner.nextDouble();
        double length1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        double length2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));

        System.out.println("Is both the lines are Equal?true or false :"+ Objects.equals(length1,length2));
    }
}
