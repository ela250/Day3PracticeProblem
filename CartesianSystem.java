package com.geometry;
import java.util.Scanner;

public class CartesianSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of line1(x1,y1) value :");
        double x1 =scanner.nextDouble();
        double y1 =scanner.nextDouble();
        System.out.println("Enter the coordinates of line2(y1,y2) value :");
        double x2 =scanner.nextDouble();
        double y2 =scanner.nextDouble();

        double length = Math.sqrt( ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("The length of a line is:" +length);


    }
}
